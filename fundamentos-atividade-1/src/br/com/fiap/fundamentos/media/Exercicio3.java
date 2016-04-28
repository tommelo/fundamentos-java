package br.com.fiap.fundamentos.media;

import javax.swing.JOptionPane;

import br.com.fiap.fundamentos.ExercicioExecutor;

public class Exercicio3 implements ExercicioExecutor {

	@Override
	public void execute() {
		/*
		 * Construa um programa que crie um vetor para coletar informa��es de sal�rios de
		 * determinados funcion�rios. O programa inicialmente dever� questionar a
		 * quantidade de funcion�rios que servir� para determinar o tamanho do vetor.
		 * Ap�s isso, ser� questionado o sal�rio para cada funcion�rio deste vetor. Ao final,
		 * o programa dever� informar a m�dia salarial da empresa.
		 * Nota: utilize o comando JOptionPane.showInputDialog para a entrada de dados.
		 * Como este comando retorna o tipo String, fa�a a convers�o de tipos apropriada
		 * (classes wrappers).
		 */
		
		String numeroFunctionariosStr = JOptionPane.
				showInputDialog("Informe a quantidade de funcion�rios");
				
		int funcionarios = Integer.valueOf(numeroFunctionariosStr);
		double totalSalario = 0;
		
		for (int i = 0; i < funcionarios; i++) {
			String salarioStr = JOptionPane.
					showInputDialog("Informe o sal�rio do funcion�rio " + i);
			
			double salario = Double.valueOf(salarioStr);
			totalSalario += salario;
		}
		
		double media = totalSalario / funcionarios;
		JOptionPane.showMessageDialog(null, "Media salarial da empresa: " + media);
			
	}

}
