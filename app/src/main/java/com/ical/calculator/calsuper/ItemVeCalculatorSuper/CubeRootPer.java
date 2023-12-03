package com.ical.calculator.calsuper.ItemVeCalculatorSuper;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerUnaryOperation;
import com.ical.calculator.calsuper.OperationSuperCalculator;

public class CubeRootPer extends PerUnaryOperation implements OperationSuperCalculator {
    public CubeRootPer(double value) {
        super(value);
    }

    public double getResultCal() {
        if (this.value <= 0.0d) {
            return -1.0d;
        }
        return Math.pow(this.value, Math.pow(3.0d, -1.0d));
    }
}
