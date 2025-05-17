package br.edu.fatecpg.conversor.view;

import br.edu.fatecpg.conversor.model.Conversor;

public class Main {

	public static void main(String[] args) {
		Conversor c = new Conversor();
		
		System.out.println("°C -> °F: "+c.converter(22));
		System.out.println("quilometro -> milha: "+ String.format("%.2f",c.converter(1.61)));
		System.out.println("maiusculo -> minusculo: "+c.converter("TESTE"));
	}

}
