package com.ical.calculator.calsuper.ItemVeCalculatorSuper;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerUnaryOperation;
import com.ical.calculator.calsuper.OperationSuperCalculator;

public class SinEpontitalOneNegavity extends PerUnaryOperation implements OperationSuperCalculator {
    public SinEpontitalOneNegavity(double value) {
        super(value);
    }

    public double getResultCal() {
        if (0.0d > this.value || this.value > 1.0d) {
            return 0.0d;
        }
        if (this.value == 1.0d) {
            return 90.0d;
        }
        if (this.value == 0.5d) {
            return 30.0d;
        }
        if (this.value == 0.0d) {
            return 180.0d;
        }
        if (this.value == 0.5d || this.value == 0.0d || this.value == 1.0d) {
            return 0.0d;
        }
        return (180.0d * Math.asin(this.value)) / 3.141592653589793d;
    }
}
