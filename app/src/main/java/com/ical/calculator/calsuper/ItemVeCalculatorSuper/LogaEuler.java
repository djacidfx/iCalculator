package com.ical.calculator.calsuper.ItemVeCalculatorSuper;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerUnaryOperation;
import com.ical.calculator.calsuper.OperationSuperCalculator;

public class LogaEuler extends PerUnaryOperation implements OperationSuperCalculator {
    public LogaEuler(double value) {
        super(value);
    }

    public double getResultCal() {
        if (this.value > 1.0d) {
            return Math.log(this.value);
        }
        return -1.0d;
    }
}
