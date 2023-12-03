package com.ical.calculator.calsuper.ItemVeCalculatorSuper;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerUnaryOperation;
import com.ical.calculator.calsuper.OperationSuperCalculator;

public class CalTanh extends PerUnaryOperation implements OperationSuperCalculator {
    public CalTanh(double value) {
        super(value);
    }

    public double getResultCal() {
        if (this.value == 45.0d) {
            return 1.0d;
        }
        if (this.value == 90.0d) {
            return 3.14d;
        }
        if (this.value == 0.0d) {
            return 180.0d;
        }
        if (this.value == 135.0d) {
            return -1.0d;
        }
        if (this.value == 180.0d || this.value == 45.0d || this.value == 90.0d || this.value == 135.0d || this.value == 180.0d) {
            return 0.0d;
        }
        return Math.tanh((this.value * 3.141592653589793d) / 180.0d);
    }
}
