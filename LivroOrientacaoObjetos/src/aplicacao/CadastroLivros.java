package aplicacao;

import entidades.Livro;

public class CadastroLivros {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-6225-46-6");
		
		livro.mostrarDetalhes();
		

	}

}
