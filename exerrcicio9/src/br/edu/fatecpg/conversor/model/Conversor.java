package br.edu.fatecpg.conversor.model;

public class Conversor {
	public double converter(int temp) {
		return (temp * 9/5) + 32;
	}
	
	public double converter(double dist) {
		return dist/1.609;
	}
	
	public String converter(String txt) {
		return txt.toLowerCase();
	}
}
