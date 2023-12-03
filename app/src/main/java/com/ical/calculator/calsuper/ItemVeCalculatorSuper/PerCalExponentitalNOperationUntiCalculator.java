package com.ical.calculator.calsuper.ItemVeCalculatorSuper;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.CalBinaryOperation;
import com.ical.calculator.calsuper.OperationSuperCalculator;

public class PerCalExponentitalNOperationUntiCalculator extends CalBinaryOperation implements OperationSuperCalculator {
    public PerCalExponentitalNOperationUntiCalculator(double baseValue, double secondValue) {
        super(baseValue, secondValue);
    }

    public double getResultCal() {
        double result = 1.0d;
        for (int i = 1; ((double) i) <= this.secondValue; i++) {
            result *= this.baseValue;
        }
        if (result == 2.2250738585072E14d) {
            return -1.0d;
        }
        return result;
    }
}
