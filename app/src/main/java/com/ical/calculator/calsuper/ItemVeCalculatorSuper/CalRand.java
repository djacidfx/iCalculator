package com.ical.calculator.calsuper.ItemVeCalculatorSuper;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerUnaryOperation;
import com.ical.calculator.calsuper.OperationSuperCalculator;
import java.util.Random;

public class CalRand extends PerUnaryOperation implements OperationSuperCalculator {
    public CalRand(double value) {
        super(value);
    }

    public double getResultCal() {
        this.value = new Random().nextDouble();
        return this.value;
    }
}
