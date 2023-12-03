package com.ical.calculator.calsuper.ItemVeCalculatorSuper;

import com.ical.calculator.calsuper.HatNhanCalculatorSuper.PerUnaryOperation;
import com.ical.calculator.calsuper.OperationSuperCalculator;

public class ExponentitalTenOperationUntiCalculatorPer extends PerUnaryOperation implements OperationSuperCalculator {
    public ExponentitalTenOperationUntiCalculatorPer(double value) {
        super(value);
    }

    public double getResultCal() {
        double sum = 1.0d;
        for (int i = 1; ((double) i) <= this.value; i++) {
            sum *= 10.0d;
        }
        if (sum >= 2.2250738585072E14d) {
            return -1.0d;
        }
        return sum;
    }
}
