package br.edu.fatecpg.produto.model;

public class Produto {
	public String produto;
	public Double preco;
	public int estoque;
	
	public Produto(String produto) {
		this.produto = produto;
	}
	
	public Produto(String produto, Double preco) {
		this.produto = produto;
		this.preco = preco;
	}
	
	public Produto(String produto, Double preco, int estoque) {
		super();
		this.produto = produto;
		this.preco = preco;
		this.estoque = estoque;
	}
	
}
