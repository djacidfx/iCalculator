package com.ical.calculator.calsuper.HatNhanCalculatorSuper;

import com.ical.calculator.calsuper.OperationSuperCalculator;

public class PerPowerOperationUntiCalculator extends CalBinaryOperation implements OperationSuperCalculator {
    public PerPowerOperationUntiCalculator(double baseValue, double secondValue) {
        super(baseValue, secondValue);
    }

    public double getResultCal() {
        double result = Math.pow(this.baseValue, this.secondValue);
        if (Double.isInfinite(result) || Double.isNaN(result)) {
            return 0.0d;
        }
        return result;
    }
}
