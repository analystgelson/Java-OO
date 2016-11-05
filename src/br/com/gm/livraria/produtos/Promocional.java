package br.com.gm.livraria.produtos;

@FunctionalInterface //quando se tem um �nico m�todo abstrato
public interface Promocional {

	boolean aplicaDescontoDe(double porcentagem); //m�todo abstrato
	
	//o default come�ou a partir do java 1.8, ele j� leva automaticamente este m�todo para class filha
	default boolean aplicaDescontoDe10Porcento() {
		return aplicaDescontoDe(0.1);
	}
}
