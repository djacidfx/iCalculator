package com.ical.calculator.calsuper.ItemVeCalculatorSuper;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.CalBinaryOperation;
import com.ical.calculator.calsuper.OperationSuperCalculator;

public class NRoot extends CalBinaryOperation implements OperationSuperCalculator {
    public NRoot(double baseValue, double secondValue) {
        super(baseValue, secondValue);
    }

    public double getResultCal() {
        return Math.pow(this.baseValue, Math.pow(this.secondValue, -1.0d));
    }
}
