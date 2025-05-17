package br.edu.fatecpg.veiculo.model;

public class Carro implements IVeiculo{

	@Override
	public void mover() {
		System.out.println("O carro está dirigindo");
	}
	
}
