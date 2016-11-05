package br.com.gm.livraria.produtos;

import br.com.gm.livraria.Autor;

public class Ebook extends Livro implements Promocional{

	private String waterMark;

	public Ebook(Autor autor) {
		super(autor);//o Super � para delegar a responsabilidade para a superclasse que j� tem esse comportamente bem definido.
	}
	
	@Override //Usando @Override, o compilador nos ajudar� a validar que esse m�todo � realmente uma reescrita.
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("aplicando desconto no Ebook");
		return true;
	}
	
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public String getWaterMark() {
		return waterMark;
	}
	
	@Override
	public String toString() {
		return "Eu sou um Ebook";
	}
}
