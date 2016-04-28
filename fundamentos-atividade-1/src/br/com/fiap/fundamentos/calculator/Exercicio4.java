package br.com.fiap.fundamentos.calculator;

import br.com.fiap.fundamentos.ExercicioExecutor;

public class Exercicio4 implements ExercicioExecutor {

	@Override
	public void execute() {		
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.execute(1, 1, ArithmeticSymbol.SUM));
		System.out.println(calculator.execute(2, 2, ArithmeticSymbol.SUBTRACTION));
		System.out.println(calculator.execute(2, 2, ArithmeticSymbol.MULTIPLICATION));
		System.out.println(calculator.execute(2, 2, ArithmeticSymbol.DIVISION));		
	}

}
