package br.com.gm.livraria.teste;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.gm.livraria.Autor;
import br.com.gm.livraria.ComparadorPorNome;
import br.com.gm.livraria.produtos.Livro;
import br.com.gm.livraria.produtos.LivroFisico;

public class NovidadesDoJava8 {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("Java O.O.");
		Livro java8 = new LivroFisico(autor);
		java8.setNome("Java 8 Prático");
		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de Ruby");
		List<Livro> livros = Arrays.asList(javaoo, java8, ruby);
		
		livros.sort(new Comparator<Livro>() {
			@Override
			public int compare(Livro l1, Livro l2) {
			return l1.getNome().compareTo(l2.getNome());
			}
			});
		
		for (Livro livro : livros) {
			System.out.println(livro.getNome());
		}
	}

}
