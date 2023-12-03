package com.ical.calculator.calsuper.ItemVeCalculatorSuper;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerUnaryOperation;
import com.ical.calculator.calsuper.OperationSuperCalculator;

public class CalPerSquareRoot extends PerUnaryOperation implements OperationSuperCalculator {
    public CalPerSquareRoot(double value) {
        super(value);
    }

    public double getResultCal() {
        if (this.value > 0.0d) {
            return Math.sqrt(this.value);
        }
        return -1.0d;
    }
}
