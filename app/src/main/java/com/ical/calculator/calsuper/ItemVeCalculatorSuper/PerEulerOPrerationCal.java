package com.ical.calculator.calsuper.ItemVeCalculatorSuper;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerUnaryOperation;
import com.ical.calculator.calsuper.OperationSuperCalculator;

public class PerEulerOPrerationCal extends PerUnaryOperation implements OperationSuperCalculator {
    public PerEulerOPrerationCal(double value) {
        super(value);
    }

    public double getResultCal() {
        if (this.value == 0.0d) {
            this.value = 2.7182818284d;
            return this.value;
        }
        double valued = this.value * 2.7182818284d;
        if (valued >= 2.2250738585072E14d) {
            return -1.0d;
        }
        return valued;
    }
}
