package br.edu.insper.desagil.alfandega;

public class ItemSemTarifa extends Item {
	
	public ItemSemTarifa(String nome, double valor, double rate) {
		super(nome, valor, rate);
	}
	
	@Override
	public double getPreco() {
		// Mesmo em itens sem tarifa, a alfândega cobra
		// uma taxa de 1% Por quê? Porque eles podem.
		return super.getValor() * 0.01;
	}
	
}
