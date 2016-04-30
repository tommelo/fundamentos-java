package br.com.fiap.fundamentos.cachorro;

public class Exercicio3 {

	public static void main(String [] args) {
		ChowChow chowChow = new ChowChow();
		Boolean valor = chowChow instanceof Cachorro;
		System.out.println("Verdadeiro ou Falso: "+valor);
		System.out.println("Verdadeiro ou Falso: " + (chowChow instanceof ChowChow));
		
		
		Cachorro cachorro = new Cachorro();
		valor = cachorro instanceof ChowChow;
		System.out.println("Verdadeiro ou Falso: "+valor);
	}
	
}
