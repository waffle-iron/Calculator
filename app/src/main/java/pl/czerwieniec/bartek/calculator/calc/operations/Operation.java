package pl.czerwieniec.bartek.calculator.calc.operations;

/**
 * Project "Calculator"
 * <p>
 * Created by Lukasz Marczak
 * on 16.11.2016.
 */

public interface Operation {
    double operate(double number1, double number2);
    String operationSymbol();
}
