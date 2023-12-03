package com.ical.calculator.calsuper.ItemVeCalculatorSuper;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerUnaryOperation;
import com.ical.calculator.calsuper.OperationSuperCalculator;

public class CalSinh extends PerUnaryOperation implements OperationSuperCalculator {
    public CalSinh(double value) {
        super(value);
    }

    public double getResultCal() {
        if (this.value == 90.0d) {
            return 1.0d;
        }
        if (this.value == 30.0d) {
            return 0.5d;
        }
        if (this.value == 0.0d) {
            return 0.0d;
        }
        if (this.value == 150.0d) {
            return 0.5d;
        }
        if (this.value == 180.0d || this.value == 90.0d || this.value == 30.0d || this.value == 150.0d || this.value == 180.0d || this.value == 0.0d) {
            return 0.0d;
        }
        return Math.sinh((this.value * 3.141592653589793d) / 180.0d);
    }
}
