package com.ical.calculator.calsuper.HatNhanCalculatorSuper;

import com.ical.calculator.calsuper.OperationSuperCalculator;

public class PercentOperationUntiCalculatorPer extends PerUnaryOperation implements OperationSuperCalculator {
    public PercentOperationUntiCalculatorPer(double value) {
        super(value);
    }

    public double getResultCal() {
        return this.value / 100.0d;
    }
}
