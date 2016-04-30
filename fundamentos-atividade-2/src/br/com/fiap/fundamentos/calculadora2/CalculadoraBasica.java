package br.com.fiap.fundamentos.calculadora2;

public interface CalculadoraBasica {

	public float somar(float opt1, float opt2) throws NumeroInvalidoException ;
	public float subtrair(float opt1, float opt2) throws NumeroInvalidoException;
	public float dividir(float opt1, float opt2) throws NumeroInvalidoException;
	public float multiplicar(float opt1, float opt2) throws NumeroInvalidoException;
	
}

