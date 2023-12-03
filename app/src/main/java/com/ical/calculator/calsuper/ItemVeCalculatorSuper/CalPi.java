package com.ical.calculator.calsuper.ItemVeCalculatorSuper;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerUnaryOperation;
import com.ical.calculator.calsuper.OperationSuperCalculator;

public class CalPi extends PerUnaryOperation implements OperationSuperCalculator {
    public CalPi(double value) {
        super(value);
    }

    public double getResultCal() {
        this.value = 3.141592653589793d;
        return this.value;
    }
}
