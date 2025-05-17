package br.edu.fatecpg.pagamento.model;
import java.util.Random;
public class Boleto extends IPagamento {
	
	public Boleto(double v) {
		super(v);

	}

	private Random rd = new Random();

	@Override
	public String processar() {
		Long boleto = rd.nextLong(100000000000000000l, 999999999999999999l);
		return "Pagamento em boleto: " +boleto + "No valor de: " + this.getValor();
	}

}
