package com.ical.calculator.calsuper.ItemVeCalculatorSuper;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerUnaryOperation;
import com.ical.calculator.calsuper.OperationSuperCalculator;

public class ExponentitalThreeOperationUntiCalculatorPer extends PerUnaryOperation implements OperationSuperCalculator {
    public ExponentitalThreeOperationUntiCalculatorPer(double value) {
        super(value);
    }

    public double getResultCal() {
        double sum = this.value * this.value * this.value;
        if (sum >= 2.2250738585072E14d) {
            return -1.0d;
        }
        return sum;
    }
}
