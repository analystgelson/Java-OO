package br.com.gm.livraria.teste;

import java.util.List;

import br.com.gm.livraria.Autor;
import br.com.gm.livraria.produtos.CarrinhoDeCompras;
import br.com.gm.livraria.produtos.Ebook;
import br.com.gm.livraria.produtos.LivroFisico;
import br.com.gm.livraria.produtos.Produto;

public class RegistroDeVendas {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Gelson Moraes");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		if ( fisico.aplicaDescontoDe10Porcento() ) {
			System.out.println("Valor agora é " + fisico.getValor() );
		}
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total: " + carrinho.getTotal());
		
		List<Produto> produtos = carrinho.getProdutos();
		
		for (Produto produto : produtos) {
			System.out.println(produto.getValor());
		}
	}

}
