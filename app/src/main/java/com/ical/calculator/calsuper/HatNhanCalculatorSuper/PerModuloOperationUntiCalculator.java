package com.ical.calculator.calsuper.HatNhanCalculatorSuper;

import com.ical.calculator.calsuper.OperationSuperCalculator;

public class PerModuloOperationUntiCalculator extends CalBinaryOperation implements OperationSuperCalculator {
    public PerModuloOperationUntiCalculator(double baseValue, double secondValue) {
        super(baseValue, secondValue);
    }

    public double getResultCal() {
        if (this.secondValue != 0.0d) {
            return this.baseValue / this.secondValue;
        }
        return 0.0d;
    }
}
