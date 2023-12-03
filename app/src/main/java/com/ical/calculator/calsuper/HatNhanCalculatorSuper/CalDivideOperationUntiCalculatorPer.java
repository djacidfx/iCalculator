package com.ical.calculator.calsuper.HatNhanCalculatorSuper;

import com.ical.calculator.calsuper.OperationSuperCalculator;

public class CalDivideOperationUntiCalculatorPer extends CalBinaryOperation implements OperationSuperCalculator {
    public CalDivideOperationUntiCalculatorPer(double baseValue, double secondValue) {
        super(baseValue, secondValue);
    }

    public double getResultCal() {
        return this.baseValue / this.secondValue;
    }
}
