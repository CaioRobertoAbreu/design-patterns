package br.com.caio.patterns.comportamental.strategy.calculator.after;

import br.com.caio.patterns.comportamental.strategy.calculator.after.strategy.CalculatorStrategy;

public class Calculator {
	private int num1;
	private int num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getResult(CalculatorStrategy calculatorStrategy) {

		return calculatorStrategy.calc(num1, num2);
	}
}
