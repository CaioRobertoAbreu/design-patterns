package br.com.caio.patterns.comportamental.strategy.calculator.before;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult("+"));
		System.out.println(calc.getResult("-"));
		System.out.println(calc.getResult("*"));
		System.out.println(calc.getResult("/"));
	}
}
