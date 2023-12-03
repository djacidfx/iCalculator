package com.ical.calculator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;

import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.ical.calculator.calculatorface.CalCulatorKey;
import com.ical.calculator.calculatorface.CalSetNumber;
import com.ical.calculator.calculatorface.CalculatorSuperOperation;
import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerFromater;
import com.ical.calculator.calsuper.OperationSuperCalculator;
import com.ical.calculator.calsuper.VipSkillCalculator;
import com.example.demo.R;

import company.librate.FiveStarsDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, VipSkillCalculator {

    public boolean checkClickChoose;
    private boolean checkClickFirst;
    private boolean checkbracket;

    public DrawerLayout drawerLayout;

    public FiveStarsDialog fiveStarsDialog;
    private ImageButton ibCosNegavityOne;
    private ImageButton ibCubeRoot;
    private ImageButton ibDivide;
    private ImageButton ibEulerN;
    private ImageButton ibExponentTow;
    private ImageButton ibExponential2;
    private ImageButton ibExponentital3;
    private ImageButton ibExponentitalN;
    private ImageButton ibExponentitalTen;
    private TextView ibLogaEuler;
    private ImageButton ibLogaTen;
    private ImageButton ibMinus;
    private ImageButton ibMultiplication;
    private ImageButton ibNRoot;
    private ImageButton ibNegavity;
    private ImageButton ibOneExponentitalNegavity;
    private ImageButton ibPercen;
    private ImageButton ibPi;
    private ImageButton ibPlus;
    private ImageButton ibReset;
    private ImageButton ibSinNegavityOne;
    private ImageButton ibSuaqreRoot;
    private ImageButton ibTanNegavityOne;
    private ImageButton imbChooseColor;
    private ImageButton imbFeddback;
    private ImageButton imbPrivate;
    private ImageButton imbRate;

    public ImageView imvBg;
    private ImageView imvMore;
    private LinearLayout llBoss;
    private LinearLayout llScreenExtend;
    private double mBaseValue;
    private VipSkillCalculator mCallback;
    private String mDisplayedValue;
    private boolean mIsFirstOperation;
    private String mLastKey;
    private String mLastOperation;
    private boolean mResetValue;
    private double mSecondValue;
    private CalSetNumber setOfNumber;
    private TextView tvBracketLeft;
    private TextView tvBracketRigth;
    private TextView tvComma;
    private TextView tvCos;
    private TextView tvCosh;
    private TextView tvEight;
    private TextView tvEqual;
    private TextView tvEuler;
    private TextView tvFive;
    private TextView tvFour;
    private TextView tvGiaiThua;
    private TextView tvNine;
    private TextView tvOne;
    private TextView tvRad;
    private TextView tvRand;

    public TextView tvResult;
    private TextView tvSeven;
    private TextView tvSin;
    private TextView tvSinh;
    private TextView tvSix;
    private TextView tvTan;
    private TextView tvTanh;
    private TextView tvThree;
    private TextView tvTow;
    private TextView tvZero;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        getWindow().setFlags(512, 512);
        resetValues();
        initView();
    }

    private void initView() {


        AdAdmob adAdmob = new AdAdmob(this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.bannerAd), this);
        adAdmob.FullscreenAd(this);


        this.setOfNumber = new CalSetNumber();
        this.mCallback = new VipSkillCalculator() {
            public void setValueCal(String value) {
                MainActivity.this.tvResult.setText(value);
            }

            public void setFormulaCal(String value) {
            }
        };
        this.llScreenExtend = (LinearLayout) findViewById(R.id.ll_screen_extend);
        this.drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.drawerLayout.setClickable(true);
        this.tvZero = (TextView) findViewById(R.id.tv_zero);
        this.tvOne = (TextView) findViewById(R.id.tv_One);
        this.tvTow = (TextView) findViewById(R.id.tv_Tow);
        this.tvSix = (TextView) findViewById(R.id.tv_Six);
        this.tvSeven = (TextView) findViewById(R.id.tv_Seven);
        this.tvEight = (TextView) findViewById(R.id.tv_Eight);
        this.tvNine = (TextView) findViewById(R.id.tv_Nine);
        this.tvThree = (TextView) findViewById(R.id.tv_Three);
        this.tvFour = (TextView) findViewById(R.id.tv_Four);
        this.tvFive = (TextView) findViewById(R.id.tv_Five);
        this.ibSuaqreRoot = (ImageButton) findViewById(R.id.ib_square_root);
        this.ibCubeRoot = (ImageButton) findViewById(R.id.ib_cube_root);
        this.ibNRoot = (ImageButton) findViewById(R.id.ib_n_root);
        this.ibLogaTen = (ImageButton) findViewById(R.id.ib_loga_ten);
        this.ibExponentTow = (ImageButton) findViewById(R.id.ib_tow_eponentital_x);
        this.ibSinNegavityOne = (ImageButton) findViewById(R.id.ib_sin_expontital_one_negavity);
        this.ibCosNegavityOne = (ImageButton) findViewById(R.id.ib_cos_expontital_one_negavity);
        this.ibTanNegavityOne = (ImageButton) findViewById(R.id.ib_tan_expontital_one_negavity);
        this.ibLogaEuler = (TextView) findViewById(R.id.tv_loga_euler);
        this.ibPi = (ImageButton) findViewById(R.id.ib_pi);
        this.ibExponentitalTen = (ImageButton) findViewById(R.id.ib_exponential_ten);
        this.ibOneExponentitalNegavity = (ImageButton) findViewById(R.id.ib_one_exponential_negavity);
        this.tvResult = (TextView) findViewById(R.id.tv_result);
        this.ibLogaTen.setOnClickListener(this);
        this.ibExponentTow.setOnClickListener(this);
        this.ibSinNegavityOne.setOnClickListener(this);
        this.ibCosNegavityOne.setOnClickListener(this);
        this.ibTanNegavityOne.setOnClickListener(this);
        this.ibLogaEuler.setOnClickListener(this);
        this.ibPi.setOnClickListener(this);
        this.ibExponentitalTen.setOnClickListener(this);
        this.ibOneExponentitalNegavity.setOnClickListener(this);
        this.ibSuaqreRoot.setOnClickListener(this);
        this.ibCubeRoot.setOnClickListener(this);
        this.ibNRoot.setOnClickListener(this);
        this.tvSin = (TextView) findViewById(R.id.tv_sin);
        this.tvCos = (TextView) findViewById(R.id.tv_cos);
        this.tvSinh = (TextView) findViewById(R.id.tv_sinh);
        this.tvCosh = (TextView) findViewById(R.id.tv_sinh);
        this.tvTanh = (TextView) findViewById(R.id.tv_tanh);
        this.tvRand = (TextView) findViewById(R.id.tv_rand);
        this.tvTan = (TextView) findViewById(R.id.tv_tan);
        this.tvRad = (TextView) findViewById(R.id.tv_rad);
        this.imbFeddback = (ImageButton) findViewById(R.id.ib_feeback);
        this.imbPrivate = (ImageButton) findViewById(R.id.ib_privatie);
        this.imbRate = (ImageButton) findViewById(R.id.ib_rate);
        this.imbChooseColor = (ImageButton) findViewById(R.id.ib_choose_color);
        this.imvBg = (ImageView) findViewById(R.id.imv_bg);
        this.llBoss = (LinearLayout) findViewById(R.id.ll_boss);
        SharedPreferences sharedPreferencesColor = getSharedPreferences("check_choose", 0);
        if (sharedPreferencesColor != null) {
            if (sharedPreferencesColor.getBoolean("choose", false)) {
                this.imvBg.setImageResource(R.drawable.bkwhite);
                this.tvResult.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            } else {
                this.imvBg.setImageResource(R.drawable.bk);
                this.tvResult.setTextColor(-1);
            }
        }
        this.imbChooseColor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SharedPreferences.Editor editor = MainActivity.this.getSharedPreferences("check_choose", 0).edit();
                if (MainActivity.this.checkClickChoose) {
                    editor.putBoolean("choose", true);
                    editor.apply();
                    MainActivity.this.tvResult.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    MainActivity.this.imvBg.setImageResource(R.drawable.bkwhite);
                    boolean unused = MainActivity.this.checkClickChoose = false;
                    return;
                }
                editor.putBoolean("choose", false);
                editor.apply();
                MainActivity.this.imvBg.setImageResource(R.drawable.bk);
                MainActivity.this.tvResult.setTextColor(-1);
                boolean unused2 = MainActivity.this.checkClickChoose = true;
            }
        });
        this.fiveStarsDialog = new FiveStarsDialog(this, "");
        this.imbRate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.fiveStarsDialog.showDialogRate();
            }
        });
        this.imbPrivate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(MainActivity.this.getResources().getString(R.string.policy))));
            }
        });
        this.imbFeddback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


            }
        });
        this.imvMore = (ImageView) findViewById(R.id.imv_more);
        SharedPreferences sharedPreferences = getSharedPreferences("checkfirst", 0);


        this.imvMore.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.drawerLayout.openDrawer((int) GravityCompat.START);
                SharedPreferences.Editor editor = MainActivity.this.getSharedPreferences("checkfirst", 0).edit();
                editor.putBoolean("boo", true);
                editor.apply();
            }
        });
        this.tvSin.setOnClickListener(this);
        this.tvCos.setOnClickListener(this);
        this.tvTan.setOnClickListener(this);
        this.tvSinh.setOnClickListener(this);
        this.tvCosh.setOnClickListener(this);
        this.tvTanh.setOnClickListener(this);
        this.tvRand.setOnClickListener(this);
        this.tvRad.setOnClickListener(this);
        this.tvEuler = (TextView) findViewById(R.id.tv_euler);
        this.tvGiaiThua = (TextView) findViewById(R.id.tv_giaithua);
        this.ibExponential2 = (ImageButton) findViewById(R.id.ib_exponential_2);
        this.ibExponentital3 = (ImageButton) findViewById(R.id.ib_exponential_3);
        this.ibEulerN = (ImageButton) findViewById(R.id.ib_euler_n);
        this.tvBracketLeft = (TextView) findViewById(R.id.tv_bracket_Left);
        this.tvBracketRigth = (TextView) findViewById(R.id.tvbracket_Rigth);
        this.ibExponentitalN = (ImageButton) findViewById(R.id.ib_eponential_n);
        this.tvBracketRigth.setOnClickListener(this);
        this.tvBracketLeft.setOnClickListener(this);
        this.ibExponentitalN.setOnClickListener(this);
        this.ibEulerN.setOnClickListener(this);
        this.ibReset = (ImageButton) findViewById(R.id.ib_reset);
        this.tvResult.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/ios_light.otf"));
        this.ibPercen = (ImageButton) findViewById(R.id.ib_percent);
        this.ibPlus = (ImageButton) findViewById(R.id.ib_plus);
        this.tvEqual = (TextView) findViewById(R.id.tv_equal);
        this.tvComma = (TextView) findViewById(R.id.tv_comma);
        this.ibMultiplication = (ImageButton) findViewById(R.id.ib_multiplication);
        this.ibNegavity = (ImageButton) findViewById(R.id.ib_negavity);
        this.ibDivide = (ImageButton) findViewById(R.id.ib_divide);
        this.ibMinus = (ImageButton) findViewById(R.id.ib_minus);
        this.tvZero.setOnClickListener(this);
        this.tvOne.setOnClickListener(this);
        this.tvTow.setOnClickListener(this);
        this.tvThree.setOnClickListener(this);
        this.tvFour.setOnClickListener(this);
        this.tvFive.setOnClickListener(this);
        this.tvSix.setOnClickListener(this);
        this.tvSeven.setOnClickListener(this);
        this.tvEight.setOnClickListener(this);
        this.tvNine.setOnClickListener(this);
        this.tvGiaiThua.setOnClickListener(this);
        this.tvEuler.setOnClickListener(this);
        this.ibExponential2.setOnClickListener(this);
        this.ibExponentital3.setOnClickListener(this);
        this.ibReset.setOnClickListener(this);
        this.tvResult.setOnClickListener(this);
        this.ibPlus.setOnClickListener(this);
        this.ibPercen.setOnClickListener(this);
        this.ibMultiplication.setOnClickListener(this);
        this.tvComma.setOnClickListener(this);
        this.tvEqual.setOnClickListener(this);
        this.ibMinus.setOnClickListener(this);
        this.ibNegavity.setOnClickListener(this);
        this.ibDivide.setOnClickListener(this);
        this.tvResult.setText("0");
        this.ibReset.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                MainActivity.this.handleClear();
                return false;
            }
        });
    }


    public void onStop() {
        super.onStop();
    }

    private void resetValues() {
        this.mBaseValue = 0.0d;
        this.mSecondValue = 0.0d;
        this.mResetValue = false;
        this.mLastKey = "";
        this.mLastOperation = "";
        this.mDisplayedValue = "";
        this.mIsFirstOperation = true;
    }

    public void onClick(View v) {
        if (this.mLastKey.equals(CalCulatorKey.EQUALS)) {
            this.mLastOperation = CalCulatorKey.EQUALS;
        }
        this.mLastKey = CalCulatorKey.DIGIT;
        resetValueIfNeeded();
        switch (v.getId()) {
            case R.id.tv_bracket_Left:
                this.checkbracket = true;
                return;
            case R.id.tvbracket_Rigth:
                if (this.checkClickFirst && this.checkbracket) {
                    handleEquals();
                    return;
                }
                return;
            case R.id.tv_euler:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.EULER);
                return;
            case R.id.tv_giaithua:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.GIAITHUA);
                return;
            case R.id.ib_exponential_2:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.EXPONENTIAL_2);
                return;
            case R.id.ib_exponential_3:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.EXPONENTIAL_3);
                return;
            case R.id.ib_eponential_n:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.EXPONENTIAL_N);
                return;
            case R.id.ib_euler_n:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.EULER_N);
                return;
            case R.id.ib_exponential_ten:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.EXPONENTIAL_TEN);
                return;
            case R.id.ib_one_exponential_negavity:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.ONE_EXPONENTIAL_NEGAVITY);
                return;
            case R.id.ib_square_root:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.SQUARE_ROOT);
                return;
            case R.id.ib_cube_root:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.CUBE_ROOT);
                return;
            case R.id.ib_n_root:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.N_ROOT);
                return;
            case R.id.tv_loga_euler:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.LOGA_EULER);
                return;
            case R.id.ib_loga_ten:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.LOGA_TEN);
                return;
            case R.id.ib_tow_eponentital_x:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.EPONENTITAL_TOW);
                return;
            case R.id.ib_sin_expontital_one_negavity:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }


                try {
                    if (Integer.parseInt(this.tvResult.getText().toString()) < 1 || Integer.parseInt(this.tvResult.getText().toString()) < 0) {
                        handleOperation(CalCulatorKey.SIN_EPONTITAL_ONE_NEGAVITY);
                        return;
                    }
                    this.drawerLayout.closeDrawer(Gravity.LEFT);
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }

                return;
            case R.id.ib_cos_expontital_one_negavity:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }

                try {
                    if (Integer.parseInt(this.tvResult.getText().toString()) < 1 || Integer.parseInt(this.tvResult.getText().toString()) < 0) {
                        handleOperation(CalCulatorKey.COS_EPONTITAL_ONE_NEGAVITY);
                        return;
                    }
                    this.drawerLayout.closeDrawer(Gravity.LEFT);
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }

                return;
            case R.id.ib_tan_expontital_one_negavity:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.TAN_EPONTITAL_ONE_NEGAVITY);
                handleEquals();
                return;
            case R.id.tv_sin:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.SIN);
                return;
            case R.id.tv_cos:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.COS);
                return;
            case R.id.tv_tan:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.TAN);
                return;
            case R.id.tv_sinh:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.SINH);
                return;
            case R.id.tv_cosh:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.COSH);
                return;
            case R.id.tv_tanh:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.TANH);
                return;
            case R.id.ib_pi:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.PI);
                return;
            case R.id.tv_rand:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.RAND);
                return;
            case R.id.ib_reset:
                handleReset();
                this.checkClickFirst = true;
                setClickAll();
                return;
            case R.id.ib_negavity:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.MINUS);
                return;
            case R.id.ib_percent:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.PERCENT);
                handleResult();
                return;
            case R.id.ib_divide:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.DIVIDE);
                setClickDivide();
                return;
            case R.id.tv_Seven:
                addDigit(this.setOfNumber.getSeven());
                this.checkClickFirst = true;
                return;
            case R.id.tv_Eight:
                addDigit(this.setOfNumber.getEigth());
                this.checkClickFirst = true;
                return;
            case R.id.tv_Nine:
                addDigit(this.setOfNumber.getNine());
                this.checkClickFirst = true;
                return;
            case R.id.ib_multiplication:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.MULTIPLY);
                setClickMultiplication();
                return;
            case R.id.tv_Four:
                addDigit(this.setOfNumber.getFour());
                this.checkClickFirst = true;
                return;
            case R.id.tv_Five:
                addDigit(this.setOfNumber.getFive());
                this.checkClickFirst = true;
                return;
            case R.id.tv_Six:
                addDigit(this.setOfNumber.getSix());
                this.checkClickFirst = true;
                return;
            case R.id.ib_minus:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.MINUS);
                setClickMinus();
                return;
            case R.id.tv_One:
                addDigit(this.setOfNumber.getOne());
                this.checkClickFirst = true;
                return;
            case R.id.tv_Tow:
                addDigit(this.setOfNumber.getTow());
                this.checkClickFirst = true;
                return;
            case R.id.tv_Three:
                addDigit(this.setOfNumber.getThree());
                this.checkClickFirst = true;
                return;
            case R.id.ib_plus:
                if (!this.checkClickFirst) {
                    handleReset();
                    this.checkClickFirst = true;
                }
                handleOperation(CalCulatorKey.PLUS);
                setClickPlus();
                return;
            case R.id.tv_zero:
                zeroClicked();
                this.checkClickFirst = true;
                return;
            case R.id.tv_comma:
                decimalClicked();
                this.checkClickFirst = true;
                return;
            case R.id.tv_equal:
                if (this.checkClickFirst) {
                    handleEquals();
                }
                setClickAll();
                return;
            default:
                return;
        }
    }

    private void setClickDivide() {
        this.ibDivide.setBackgroundResource(R.drawable.background_action);
        this.ibDivide.setImageResource(R.drawable.divideyello);
        this.ibPlus.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibPlus.setImageResource(R.drawable.add);
        this.ibMinus.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibMinus.setImageResource(R.drawable.substractnagevity);
        this.ibMultiplication.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibMultiplication.setImageResource(R.drawable.multiplicationwite);
    }

    private void setClickAll() {
        this.ibDivide.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibDivide.setImageResource(R.drawable.divide);
        this.ibPlus.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibPlus.setImageResource(R.drawable.add);
        this.ibMinus.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibMinus.setImageResource(R.drawable.substractnagevity);
        this.ibMultiplication.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibMultiplication.setImageResource(R.drawable.multiplicationwite);
    }

    private void setClickMinus() {
        this.ibDivide.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibDivide.setImageResource(R.drawable.divide);
        this.ibPlus.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibPlus.setImageResource(R.drawable.add);
        this.ibMinus.setBackgroundResource(R.drawable.background_action);
        this.ibMinus.setImageResource(R.drawable.substract);
        this.ibMultiplication.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibMultiplication.setImageResource(R.drawable.multiplicationwite);
    }

    private void setClickPlus() {
        this.ibDivide.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibDivide.setImageResource(R.drawable.divide);
        this.ibPlus.setBackgroundResource(R.drawable.background_action);
        this.ibPlus.setImageResource(R.drawable.addyello);
        this.ibMinus.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibMinus.setImageResource(R.drawable.substractnagevity);
        this.ibMultiplication.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibMultiplication.setImageResource(R.drawable.multiplicationwite);
    }

    private void setClickMultiplication() {
        this.ibDivide.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibDivide.setImageResource(R.drawable.divide);
        this.ibPlus.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibPlus.setImageResource(R.drawable.add);
        this.ibMinus.setBackgroundResource(R.drawable.oval_yello_tron);
        this.ibMinus.setImageResource(R.drawable.substractnagevity);
        this.ibMultiplication.setBackgroundResource(R.drawable.background_action);
        this.ibMultiplication.setImageResource(R.drawable.multiplication);
    }

    private void handleReset() {
        resetValues();
        setValueCal("0");
        setFormulaCal("");
    }

    private String formatString(String str) {
        return str.contains(".") ? str : PerFromater.doubleToString(PerFromater.stringToDouble(str).doubleValue());
    }

    public void addDigit(int number) {
        setValueCal(formatString(getDisplayedNumber() + number));
    }

    public String getDisplayedNumber() {
        return this.mDisplayedValue;
    }

    public double getDisplayedNumberAsDouble() {
        return PerFromater.stringToDouble(getDisplayedNumber()).doubleValue();
    }

    public void setValueCal(String value) {
        this.mCallback.setValueCal(value);
        this.mDisplayedValue = value;
    }

    public void setFormulaCal(String value) {
        this.mCallback.setFormulaCal(value);
    }

    public void decimalClicked() {
        String value = getDisplayedNumber();
        if (!value.contains(".")) {
            value = value + ".";
        }
        setValueCal(value);
    }

    public void zeroClicked() {
        if (!getDisplayedNumber().equals("0")) {
            addDigit(0);
        }
    }

    public void handleClear() {
        String oldValue = getDisplayedNumber();
        String newValue = "0";
        int len = oldValue.length();
        int minLen = 1;
        if (oldValue.contains("-")) {
            minLen = 1 + 1;
        }
        if (len > minLen) {
            newValue = oldValue.substring(0, len - 1);
        }
        String newValue2 = formatString(newValue.replaceAll("\\.$", ""));
        setValueCal(newValue2);
        this.mBaseValue = PerFromater.stringToDouble(newValue2).doubleValue();
    }

    public void calculateResult() {
        OperationSuperCalculator operation = CalculatorSuperOperation.forId(this.mLastOperation, this.mBaseValue, this.mSecondValue);
        if (operation != null) {
            updateResult(operation.getResultCal());
        }
        this.mIsFirstOperation = false;
    }

    private void updateResult(double value) {
        setValueCal(PerFromater.doubleToString(value));
        this.mBaseValue = value;
    }

    public void handleResult() {
        this.mSecondValue = getDisplayedNumberAsDouble();
        calculateResult();
        this.mBaseValue = getDisplayedNumberAsDouble();
    }

    public void handleOperation(String operation) {
        if (this.mLastKey.equals(CalCulatorKey.DIGIT)) {
            handleResult();
        }
        this.mResetValue = true;
        this.mLastKey = operation;
        this.mLastOperation = operation;
        if (operation.equals(CalCulatorKey.ROOT)) {
            calculateResult();
        }
        this.drawerLayout.closeDrawer(Gravity.LEFT);
    }

    private void resetValueIfNeeded() {
        if (this.mResetValue) {
            this.mDisplayedValue = "0";
        }
        this.mResetValue = false;
    }

    public void handleEquals() {
        if (this.mLastKey.equals(CalCulatorKey.EQUALS)) {
            calculateResult();
        }
        if (this.mLastKey.equals(CalCulatorKey.DIGIT)) {
            this.mSecondValue = getDisplayedNumberAsDouble();
            calculateResult();
            this.mLastKey = CalCulatorKey.EQUALS;
        }
    }
}
