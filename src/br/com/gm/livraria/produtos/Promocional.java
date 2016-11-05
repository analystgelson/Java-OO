package br.com.gm.livraria.produtos;

@FunctionalInterface //quando se tem um único método abstrato
public interface Promocional {

	boolean aplicaDescontoDe(double porcentagem); //método abstrato
	
	//o default começou a partir do java 1.8, ele já leva automaticamente este método para class filha
	default boolean aplicaDescontoDe10Porcento() {
		return aplicaDescontoDe(0.1);
	}
}
