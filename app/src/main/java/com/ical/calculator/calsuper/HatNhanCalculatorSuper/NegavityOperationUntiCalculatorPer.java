package com.ical.calculator.calsuper.HatNhanCalculatorSuper;

import com.ical.calculator.calsuper.OperationSuperCalculator;

public class NegavityOperationUntiCalculatorPer extends PerUnaryOperation implements OperationSuperCalculator {
    double valueFinsih;

    public NegavityOperationUntiCalculatorPer(double value) {
        super(value);
    }

    public double getResultCal() {
        this.valueFinsih = this.value * -1.0d;
        return this.valueFinsih;
    }
}
