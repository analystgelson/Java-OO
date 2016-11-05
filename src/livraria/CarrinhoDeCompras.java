package livraria;

public class CarrinhoDeCompras {

	private double total;
	
	public void adiciona(Livro livro) { //Polimorfismo
		System.out.println("Adicionando: " + livro);
		livro.aplicaDescontoDe(0.16);
		total +=livro.getValor();
	}
	
	public double getTotal() {
		return total;
	}
}
