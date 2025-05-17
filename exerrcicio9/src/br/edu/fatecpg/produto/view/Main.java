package br.edu.fatecpg.produto.view;

import br.edu.fatecpg.produto.model.Produto;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("teclado");
		Produto p2 = new Produto("mouse", 90.99);
		Produto p3 = new Produto("monitor", 450.80, 8);
		
		System.out.println("produto 1\nnome: "+p1.produto+"\n");
		
		System.out.println("produto 2\nnome: "+p2.produto +"\npreço: "+ p2.preco+"\n");
		
		System.out.println("produto 3\nnome: "+p3.produto +"\npreço: "+
							p3.preco+"\nestoque: "+p3.estoque);
	}
	
}
