package com.ical.calculator.calsuper.ItemVeCalculatorSuper;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerUnaryOperation;
import com.ical.calculator.calsuper.OperationSuperCalculator;

public class TanExponentitalNegavity extends PerUnaryOperation implements OperationSuperCalculator {
    public TanExponentitalNegavity(double value) {
        super(value);
    }

    public double getResultCal() {
        if (this.value == 1.0d) {
            return 45.0d;
        }
        if (this.value == 3.14d) {
            return 90.0d;
        }
        if (this.value == -1.0d) {
            return 135.0d;
        }
        if (this.value == 0.0d) {
            return 180.0d;
        }
        if (this.value == 0.5d || this.value == 0.0d || this.value == 1.0d) {
            return 0.0d;
        }
        return (180.0d * Math.atan(this.value)) / 3.141592653589793d;
    }
}
