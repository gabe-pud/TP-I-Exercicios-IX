package br.edu.fatecpg.veiculo.view;

import br.edu.fatecpg.veiculo.model.Bicicleta;
import br.edu.fatecpg.veiculo.model.Carro;

public class Main {

	public static void main(String[] args) {
		Carro c = new Carro();
		Bicicleta b = new Bicicleta();
		
		c.mover();
		b.mover();
	}

}
