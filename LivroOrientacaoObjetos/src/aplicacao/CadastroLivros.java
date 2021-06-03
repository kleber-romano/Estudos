package aplicacao;

import entidades.Autor;
import entidades.Ebook;
import entidades.Livro;

public class CadastroLivros {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rturini@caelum.com.br");
		autor.setCpf("123.456.789-00");
		
		Livro livro = new Livro();
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-6225-46-6");
		livro.setAutor(autor);
				
		livro.mostrarDetalhes();
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("Paulo Silveira");
		outroAutor.setEmail("psilveira@caelum.com.br");
		outroAutor.setCpf("123.654.987-11");
		
		Livro outroLivro = new Livro();
		outroLivro.setNome("Lógica de Programação");
		outroLivro.setDescricao("Crie seus primeiros programas");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978-75-6524-75-2");
		outroLivro.setAutor(outroAutor);
		outroLivro.mostrarDetalhes();
		
		Ebook ebook = new Ebook();
		ebook.setNome("Algoritmos em Java");
		ebook.setAutor(outroAutor);
		ebook.setDescricao("Algoritmos e estruturas de dados em java");
		ebook.setIsbn("123-45-6789-00-1");
		ebook.setValor(39.99);
		ebook.mostrarDetalhes();
		
		

	}

}
