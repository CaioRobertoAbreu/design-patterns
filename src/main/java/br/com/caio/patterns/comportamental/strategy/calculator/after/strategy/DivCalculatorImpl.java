package br.com.caio.patterns.comportamental.strategy.calculator.after.strategy;

public class DivCalculatorImpl implements CalculatorStrategy {

    @Override
    public int calc(int num1, int num2) {
        return num1 / num2;
    }
}
