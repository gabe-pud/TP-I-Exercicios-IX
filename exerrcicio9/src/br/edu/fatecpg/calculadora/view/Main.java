package br.edu.fatecpg.calculadora.view;

import br.edu.fatecpg.calculadora.model.Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		
		System.out.println(c.somar(1, 1));
		System.out.println(c.somar(1, 1, 1));
		System.out.println(c.somar(1.5, 1.5));
		
	}

}
