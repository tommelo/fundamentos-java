package br.com.fiap.fundamentos.calculadora2;

public class Calculadora implements CalculadoraBasica{

	@Override
	public float somar(float opt1, float opt2) throws NumeroInvalidoException {
		if (opt1 == 0)
			throw new NumeroInvalidoException("opt1 não pode ser 0");
		
		return opt1 + opt2;
	}

	@Override
	public float subtrair(float opt1, float opt2) throws NumeroInvalidoException {
		if (opt1 == 0)
			throw new NumeroInvalidoException("opt1 não pode ser 0");
		
		return opt1 - opt2;
	}

	@Override
	public float dividir(float opt1, float opt2) throws NumeroInvalidoException {
		if (opt2 == 0)
			throw new NumeroInvalidoException("divisão por 0 não permitida");
		
		return opt1 / opt2;
	}

	@Override
	public float multiplicar(float opt1, float opt2) throws NumeroInvalidoException {
		if (opt1 == 0)
			throw new NumeroInvalidoException("opt1 não pode ser 0");
		
		return opt1 * opt2;
	}

}


