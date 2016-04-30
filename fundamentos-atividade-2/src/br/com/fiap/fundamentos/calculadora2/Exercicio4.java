package br.com.fiap.fundamentos.calculadora2;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String [] args) {

		Calculadora calculadora = new Calculadora();		
		String somaStr = JOptionPane.showInputDialog("Digite a operação de soma (ex: 1+1)");

		try {			
			String [] arr = somaStr.split(Pattern.quote("+"));			
			float opt1 = Float.valueOf(Float.valueOf(arr[0]));
			float opt2 = Float.valueOf(Float.valueOf(arr[1]));

			float soma = calculadora.somar(opt1, opt2);
			System.out.println( soma );

		} catch (NumberFormatException e) {
			System.out.println("Ops, parece que você não digitou um número válido.");			
		} catch (NumeroInvalidoException e) {
			System.out.println("Ops, o primeiro número não pode ser 0.");			
		} catch (Exception e) {
			System.out.println("Ops, parece que algo não previsto aconteceu.");
		}

	}		
}


