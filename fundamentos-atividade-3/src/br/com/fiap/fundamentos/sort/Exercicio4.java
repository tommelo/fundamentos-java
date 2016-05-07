package br.com.fiap.fundamentos.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercicio4 {

	public static void main(String [] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Jo�o Garcia", 20, 'M', "AIK Enterprises"));
		pessoas.add(new Pessoa("Maria Martins", 44, 'F', "Simples"));
		pessoas.add(new Pessoa("Henrique Fernando", 43, 'M', "AIK Enterprises"));
		pessoas.add(new Pessoa("In�cio Lu�s", 33, 'M', "Magazine Andr�"));
		pessoas.add(new Pessoa("Fernando Ferreira", 87, 'M', "Casas Recife"));
		
		for (Pessoa pessoa : pessoas)
			System.out.println(pessoa.toString());
		
		Collections.sort(pessoas);
		
		System.out.println();
		for (Pessoa pessoa : pessoas)
			System.out.println(pessoa.toString());
		
		Collections.sort(pessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa p1, Pessoa p2) {
				return p1.getNome().compareTo(p2.getNome());
			}
		});
		
		System.out.println();
		for (Pessoa pessoa : pessoas)
			System.out.println(pessoa.toString());
		
		Collections.sort(pessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa p1, Pessoa p2) {
				return p2.getNome().compareTo(p1.getNome());
			}
		});
		
		System.out.println();
		for (Pessoa pessoa : pessoas)
			System.out.println(pessoa.toString());
	}
	
}
