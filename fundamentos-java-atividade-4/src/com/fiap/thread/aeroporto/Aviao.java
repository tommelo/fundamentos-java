package com.fiap.thread.aeroporto;

public class Aviao extends Thread {

	private String nome;
	private Aeroporto aeroporto;
	
	public Aviao(String nome, Aeroporto aeroporto) {
		this.nome = nome;
		this.aeroporto = aeroporto;
	}
	
	@Override
	public void run() {
		
		System.out.println("Avi�o " + nome + " solicitando disponibilidade da pista!");
		aeroporto.aguardarPistaDisponivel();
		decolar();
		voar();
		aeroporto.aguardarPistaDisponivel();
		aterrissar();
		
	}
	
	public void decolar() {
		System.out.println("Avi�o " + nome + " est� decolando!");
	}
	
	public void voar() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Avi�o " + nome + " voando!");
	}
	
	public void aterrissar() {
		System.out.println("Avi�o " + nome + " pousou!");
	}
	
	
	
	
}
