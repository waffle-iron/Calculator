package pl.czerwieniec.bartek.calculator.calc.operations;

/**
 * Project "Calculator"
 * <p>
 * Created by Lukasz Marczak
 * on 16.11.2016.
 */

public class Multiply implements Operation {
    @Override
    public String operationSymbol() {
        return "*";
    }
    @Override
    public double operate(double number1, double number2) {
        return number1 * number2;
    }


}
