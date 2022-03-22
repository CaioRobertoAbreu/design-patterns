package br.com.caio.patterns.comportamental.strategy.calculator.after;

import br.com.caio.patterns.comportamental.strategy.calculator.after.strategy.DivCalculatorImpl;
import br.com.caio.patterns.comportamental.strategy.calculator.after.strategy.MultCalculatorImpl;
import br.com.caio.patterns.comportamental.strategy.calculator.after.strategy.SubCalculatorImpl;
import br.com.caio.patterns.comportamental.strategy.calculator.after.strategy.SumCalculatorImpl;

public class Client {

	public static void main(String[] args) {

		Calculator calc = new Calculator(10, 2);

		System.out.println(calc.getResult(new SumCalculatorImpl()));
		System.out.println(calc.getResult(new SubCalculatorImpl()));
		System.out.println(calc.getResult(new MultCalculatorImpl()));
		System.out.println(calc.getResult(new DivCalculatorImpl()));
	}
}
