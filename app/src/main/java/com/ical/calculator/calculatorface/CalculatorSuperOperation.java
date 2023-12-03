package com.ical.calculator.calculatorface;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.CalDivideOperationUntiCalculatorPer;
import com.ical.calculator.calsuper.HatNhanCalculatorSuper.NegavityOperationUntiCalculatorPer;
import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerMinusOperationUntiCalculator;
import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerModuloOperationUntiCalculator;
import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerMultiplyOperationUntiCalculator;
import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerPlusOperationUntiCalculator;
import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerPowerOperationUntiCalculator;
import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PercentOperationUntiCalculatorPer;
import com.ical.calculator.calsuper.HatNhanCalculatorSuper.RootOperationUntiCalculatorPer;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.CalPerCosUnti;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.CalPerSquareRoot;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.CalPi;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.CalRand;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.CalSinh;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.CalTan;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.CalTanh;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.CosEpontitalNegavity;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.CoshPerCal;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.CubeRootPer;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.EulerNOperationUntiCalculatorPer;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.ExponentitalTenOperationUntiCalculatorPer;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.ExponentitalThreeOperationUntiCalculatorPer;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.ExponentitalTowOperationUntiCalculatorPer;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.FactorialOpreation;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.LogaEuler;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.LogaTen;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.NRoot;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.OneExponentitalNegavity;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.PerCalExponentitalNOperationUntiCalculator;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.PerEponentitalTowCal;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.PerEulerOPrerationCal;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.SinCal;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.SinEpontitalOneNegavity;
import com.ical.calculator.calsuper.ItemVeCalculatorSuper.TanExponentitalNegavity;
import com.ical.calculator.calsuper.OperationSuperCalculator;

public class CalculatorSuperOperation {
    public static OperationSuperCalculator forId(String id, double baseValue, double secondValue) {
        char c = 65535;
        switch (id.hashCode()) {
            case -2086490589:
                if (id.equals(CalCulatorKey.EXPONENTIAL_TEN)) {
                    c = 16;
                    break;
                }
                break;
            case -1765414587:
                if (id.equals(CalCulatorKey.EXPONENTIAL_2)) {
                    c = 12;
                    break;
                }
                break;
            case -1674175764:
                if (id.equals(CalCulatorKey.SIN_EPONTITAL_ONE_NEGAVITY)) {
                    c = 24;
                    break;
                }
                break;
            case -1490124133:
                if (id.equals(CalCulatorKey.COS_EPONTITAL_ONE_NEGAVITY)) {
                    c = 25;
                    break;
                }
                break;
            case -1398936296:
                if (id.equals(CalCulatorKey.EULER_N)) {
                    c = 15;
                    break;
                }
                break;
            case -1331463047:
                if (id.equals(CalCulatorKey.DIVIDE)) {
                    c = 2;
                    break;
                }
                break;
            case -1134571708:
                if (id.equals(CalCulatorKey.NEGAVITY_TRUE)) {
                    c = 8;
                    break;
                }
                break;
            case -1068784010:
                if (id.equals(CalCulatorKey.MODULO)) {
                    c = 4;
                    break;
                }
                break;
            case -1054460207:
                if (id.equals(CalCulatorKey.N_ROOT)) {
                    c = 20;
                    break;
                }
                break;
            case -1035153748:
                if (id.equals(CalCulatorKey.CUBE_ROOT)) {
                    c = 19;
                    break;
                }
                break;
            case -960720203:
                if (id.equals(CalCulatorKey.TAN_EPONTITAL_ONE_NEGAVITY)) {
                    c = 26;
                    break;
                }
                break;
            case -825428435:
                if (id.equals(CalCulatorKey.NEGAVITY_FALSE)) {
                    c = 9;
                    break;
                }
                break;
            case -681585081:
                if (id.equals(CalCulatorKey.LOGA_EULER)) {
                    c = 21;
                    break;
                }
                break;
            case -678927291:
                if (id.equals(CalCulatorKey.PERCENT)) {
                    c = 7;
                    break;
                }
                break;
            case -587593498:
                if (id.equals(CalCulatorKey.EPONENTITAL_TOW)) {
                    c = 23;
                    break;
                }
                break;
            case -51333132:
                if (id.equals(CalCulatorKey.EXPONENTIAL_N)) {
                    c = 14;
                    break;
                }
                break;
            case 3577:
                if (id.equals(CalCulatorKey.PI)) {
                    c = '!';
                    break;
                }
                break;
            case 98695:
                if (id.equals(CalCulatorKey.COS)) {
                    c = 28;
                    break;
                }
                break;
            case 113880:
                if (id.equals(CalCulatorKey.SIN)) {
                    c = 27;
                    break;
                }
                break;
            case 114593:
                if (id.equals(CalCulatorKey.TAN)) {
                    c = 29;
                    break;
                }
                break;
            case 3059649:
                if (id.equals(CalCulatorKey.COSH)) {
                    c = 31;
                    break;
                }
                break;
            case 3444122:
                if (id.equals(CalCulatorKey.PLUS)) {
                    c = 0;
                    break;
                }
                break;
            case 3492901:
                if (id.equals(CalCulatorKey.RAND)) {
                    c = '\"';
                    break;
                }
                break;
            case 3506402:
                if (id.equals(CalCulatorKey.ROOT)) {
                    c = 6;
                    break;
                }
                break;
            case 3530384:
                if (id.equals(CalCulatorKey.SINH)) {
                    c = 30;
                    break;
                }
                break;
            case 3552487:
                if (id.equals(CalCulatorKey.TANH)) {
                    c = ' ';
                    break;
                }
                break;
            case 96868201:
                if (id.equals(CalCulatorKey.EULER)) {
                    c = 10;
                    break;
                }
                break;
            case 103901296:
                if (id.equals(CalCulatorKey.MINUS)) {
                    c = 1;
                    break;
                }
                break;
            case 106858757:
                if (id.equals(CalCulatorKey.POWER)) {
                    c = 5;
                    break;
                }
                break;
            case 141255356:
                if (id.equals(CalCulatorKey.ONE_EXPONENTIAL_NEGAVITY)) {
                    c = 17;
                    break;
                }
                break;
            case 386927300:
                if (id.equals(CalCulatorKey.SQUARE_ROOT)) {
                    c = 18;
                    break;
                }
                break;
            case 632367652:
                if (id.equals(CalCulatorKey.EXPONENTIAL_3)) {
                    c = 13;
                    break;
                }
                break;
            case 653829668:
                if (id.equals(CalCulatorKey.MULTIPLY)) {
                    c = 3;
                    break;
                }
                break;
            case 697000842:
                if (id.equals(CalCulatorKey.GIAITHUA)) {
                    c = 11;
                    break;
                }
                break;
            case 2014944891:
                if (id.equals(CalCulatorKey.LOGA_TEN)) {
                    c = 22;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new PerPlusOperationUntiCalculator(baseValue, secondValue);
            case 1:
                return new PerMinusOperationUntiCalculator(baseValue, secondValue);
            case 2:
                return new CalDivideOperationUntiCalculatorPer(baseValue, secondValue);
            case 3:
                return new PerMultiplyOperationUntiCalculator(baseValue, secondValue);
            case 4:
                return new PerModuloOperationUntiCalculator(baseValue, secondValue);
            case 5:
                return new PerPowerOperationUntiCalculator(baseValue, secondValue);
            case 6:
                return new RootOperationUntiCalculatorPer(baseValue);
            case 7:
                return new PercentOperationUntiCalculatorPer(baseValue);
            case 8:
                return new NegavityOperationUntiCalculatorPer(baseValue);
            case 9:
                return new NegavityOperationUntiCalculatorPer(baseValue);
            case 10:
                return new PerEulerOPrerationCal(baseValue);
            case 11:
                return new FactorialOpreation(baseValue);
            case 12:
                return new ExponentitalTowOperationUntiCalculatorPer(baseValue);
            case 13:
                return new ExponentitalThreeOperationUntiCalculatorPer(baseValue);
            case 14:
                return new PerCalExponentitalNOperationUntiCalculator(baseValue, secondValue);
            case 15:
                return new EulerNOperationUntiCalculatorPer(baseValue);
            case 16:
                return new ExponentitalTenOperationUntiCalculatorPer(baseValue);
            case 17:
                return new OneExponentitalNegavity(baseValue);
            case 18:
                return new CalPerSquareRoot(baseValue);
            case 19:
                return new CubeRootPer(baseValue);
            case 20:
                return new NRoot(baseValue, secondValue);
            case 21:
                return new LogaEuler(baseValue);
            case 22:
                return new LogaTen(baseValue);
            case 23:
                return new PerEponentitalTowCal(baseValue);
            case 24:
                return new SinEpontitalOneNegavity(baseValue);
            case 25:
                return new CosEpontitalNegavity(baseValue);
            case 26:
                return new TanExponentitalNegavity(baseValue);
            case 27:
                return new SinCal(baseValue);
            case 28:
                return new CalPerCosUnti(baseValue);
            case 29:
                return new CalTan(baseValue);
            case 30:
                return new CalSinh(baseValue);
            case 31:
                return new CoshPerCal(baseValue);
            case ' ':
                return new CalTanh(baseValue);
            case '!':
                return new CalPi(baseValue);
            case '\"':
                return new CalRand(baseValue);
            default:
                return null;
        }
    }
}
