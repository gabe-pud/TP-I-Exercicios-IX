package br.edu.fatecpg.pagamento.model;

public abstract class IPagamento {

private double valor;

public double getValor() {
	return valor;
}

public void setValor(double valor) {
	this.valor = valor;
}

public IPagamento(double v) {
	this.valor = v;
}
	
	public String processar() {
	return null;
	}

}
