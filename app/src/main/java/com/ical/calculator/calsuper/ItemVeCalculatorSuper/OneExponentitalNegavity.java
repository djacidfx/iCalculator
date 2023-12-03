package com.ical.calculator.calsuper.ItemVeCalculatorSuper;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerUnaryOperation;
import com.ical.calculator.calsuper.OperationSuperCalculator;

public class OneExponentitalNegavity extends PerUnaryOperation implements OperationSuperCalculator {
    public OneExponentitalNegavity(double value) {
        super(value);
    }

    public double getResultCal() {
        if (this.value != 0.0d) {
            return 1.0d / this.value;
        }
        return -1.0d;
    }
}
