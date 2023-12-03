package company.librate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.demo.R;

public class FiveStarsDialog implements DialogInterface.OnClickListener {
    private static final String DEFAULT_NEGATIVE = "Not Now";
    private static final String DEFAULT_POSITIVE = "Ok";
    private static final String DEFAULT_TEXT = "How much do you love our app?";
    private static final String DEFAULT_TITLE = "Rate this app";
    private static final String KEY_IS_RATE = "key_is_rate";

    public AlertDialog alertDialog;
    private TextView contentTextView;
    private final Context context;
    private View dialogView;

    public boolean isRateAppTemp = false;
    private String rateText = null;
    private RatingBar ratingBar;
    SharedPreferences sharedPrefs;
    private String supportEmail;
    private String title = null;

    public int upperBound = 2;

    public FiveStarsDialog(Context context2, String supportEmail2) {
        this.context = context2;
        this.sharedPrefs = context2.getSharedPreferences(context2.getPackageName(), 0);
        this.supportEmail = supportEmail2;
    }

    public boolean isRate() {
        return this.sharedPrefs.getBoolean(KEY_IS_RATE, false);
    }

    private void build() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        this.dialogView = LayoutInflater.from(this.context).inflate(R.layout.stars, (ViewGroup) null);
        String titleToAdd = this.title == null ? DEFAULT_TITLE : this.title;
        String textToAdd = this.rateText == null ? DEFAULT_TEXT : this.rateText;
        this.contentTextView = (TextView) this.dialogView.findViewById(R.id.text_content);
        this.contentTextView.setText(textToAdd);
        this.ratingBar = (RatingBar) this.dialogView.findViewById(R.id.ratingBar);
        this.ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                boolean unused = FiveStarsDialog.this.isRateAppTemp = true;
                if (!FiveStarsDialog.this.isRateAppTemp) {
                    return;
                }
                if (ratingBar.getRating() > ((float) FiveStarsDialog.this.upperBound)) {
                    FiveStarsDialog.this.alertDialog.dismiss();
                    FiveStarsDialog.this.openMarket();
                    FiveStarsDialog.this.notShowDialogWhenUserRateHigh();
                    return;
                }
                FiveStarsDialog.this.alertDialog.dismiss();
                FiveStarsDialog.this.sendEmail();
                FiveStarsDialog.this.notShowDialogWhenUserRateHigh();
            }
        });
        this.alertDialog = builder.setTitle(titleToAdd).setView(this.dialogView).setNegativeButton(DEFAULT_NEGATIVE, this).setPositiveButton(DEFAULT_POSITIVE, this).create();
    }


    public void notShowDialogWhenUserRateHigh() {
        SharedPreferences.Editor editor = this.context.getSharedPreferences(this.context.getPackageName(), 0).edit();
        editor.putBoolean(KEY_IS_RATE, true);
        editor.apply();
    }


    public void openMarket() {
        String appPackageName = this.context.getPackageName();
        try {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + appPackageName)));
        } catch (ActivityNotFoundException e) {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
        }
    }


    public void sendEmail() {
        Intent emailIntent = new Intent("android.intent.action.SEND");
        emailIntent.setType("text/email");
        emailIntent.putExtra("android.intent.extra.EMAIL", new String[]{this.supportEmail});
        emailIntent.putExtra("android.intent.extra.SUBJECT", "App Report (" + this.context.getPackageName() + ")");
        emailIntent.putExtra("android.intent.extra.TEXT", "");
        this.context.startActivity(Intent.createChooser(emailIntent, "Send mail Report App !"));
    }

    public void showDialogRate() {
        build();
        this.alertDialog.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1 && this.isRateAppTemp) {
            if (this.ratingBar.getRating() > ((float) this.upperBound)) {
                openMarket();
                notShowDialogWhenUserRateHigh();
            } else {
                sendEmail();
                notShowDialogWhenUserRateHigh();
            }
        }
        if (i == -2) {
            ((Activity) this.context).finish();
        }
        this.alertDialog.hide();
    }
}
