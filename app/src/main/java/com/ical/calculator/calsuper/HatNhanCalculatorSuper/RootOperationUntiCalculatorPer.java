package com.ical.calculator.calsuper.HatNhanCalculatorSuper;

import com.ical.calculator.calsuper.OperationSuperCalculator;

public class RootOperationUntiCalculatorPer extends PerUnaryOperation implements OperationSuperCalculator {
    public RootOperationUntiCalculatorPer(double value) {
        super(value);
    }

    public double getResultCal() {
        return Math.sqrt(this.value);
    }
}
