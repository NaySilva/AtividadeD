package br.edu.ifpi.d;

public class Item {

	private double valor;
	private String nome;
	
	public Item (int valor, String nome){
		this.valor = valor;
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
