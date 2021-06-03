package aplicacao;

import entidades.Autor;
import entidades.Ebook;
import entidades.Livro;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro livro = new Livro(autor);
		livro.setValor(59.90);
		
		if(!livro.aplicaDescontos(0.3)) {
			System.out.println("Desconto no livro n�o pode ser maior do que 30%");
		}else {
			System.out.println("Valor do livro com desconto: " + livro.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if(!ebook.aplicaDescontos(0.3)) {
			System.out.println("Desconto no ebook n�o pode ser maior do que 15%");
		}else {
			System.out.println("Valor do livro com desconto: " + ebook.getValor());
		}
		

	}

}
