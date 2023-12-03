package company.librate;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

import com.example.demo.R;

public class DialogFiveStars extends Dialog {
    private static final String KEY_IS_RATE = "key_is_rate";
    private Button btnNotnow;
    private Button btnOk;

    public Context context;

    public boolean isRateAppTemp = false;

    public RatingBar mBar;
    SharedPreferences sharedPrefs;
    private String supportEmail;

    public int upperBound = 2;

    public DialogFiveStars(Context context2, String supportEmail2) {
        super(context2);
        requestWindowFeature(1);
        setContentView(R.layout.dialog_rate_data);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.context = context2;
        this.supportEmail = supportEmail2;
        this.sharedPrefs = context2.getSharedPreferences(context2.getPackageName(), 0);
        initDialog();
    }

    private void initDialog() {
        this.btnOk = (Button) findViewById(R.id.btn_ok);
        this.btnNotnow = (Button) findViewById(R.id.btn_not_now);
        this.mBar = (RatingBar) findViewById(R.id.ratingBar);
        this.btnOk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!DialogFiveStars.this.isRateAppTemp) {
                    return;
                }
                if (DialogFiveStars.this.mBar.getRating() > ((float) DialogFiveStars.this.upperBound)) {
                    DialogFiveStars.this.openMarket();
                    DialogFiveStars.this.notShowDialogWhenUserRateHigh();
                    return;
                }
                DialogFiveStars.this.sendEmail();
                DialogFiveStars.this.notShowDialogWhenUserRateHigh();
            }
        });
        this.btnNotnow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((Activity) DialogFiveStars.this.context).finish();
            }
        });
        this.mBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                boolean unused = DialogFiveStars.this.isRateAppTemp = true;
                if (!DialogFiveStars.this.isRateAppTemp) {
                    return;
                }
                if (ratingBar.getRating() > ((float) DialogFiveStars.this.upperBound)) {
                    DialogFiveStars.this.dismiss();
                    DialogFiveStars.this.openMarket();
                    DialogFiveStars.this.notShowDialogWhenUserRateHigh();
                    return;
                }
                DialogFiveStars.this.dismiss();
                DialogFiveStars.this.notShowDialogWhenUserRateHigh();
            }
        });
    }

    public boolean isRate() {
        return this.sharedPrefs.getBoolean(KEY_IS_RATE, false);
    }


    public void notShowDialogWhenUserRateHigh() {
        SharedPreferences.Editor editor = this.context.getSharedPreferences(this.context.getPackageName(), 0).edit();
        editor.putBoolean(KEY_IS_RATE, true);
        editor.apply();
        ((Activity) this.context).finish();
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
}
