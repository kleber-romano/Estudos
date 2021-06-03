package entidades;

public class Livro {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	private boolean impresso;
	
	
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public Livro() {
		
	}
	
	public Livro (Autor autor) {
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
		this.impresso = true;
	}
	
	public void mostrarDetalhes() {
		System.out.println("Detalhes do Livro: ");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: R$ " + valor);
		System.out.println("ISBN: " + isbn);
		
		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}
		System.out.println("--");
	}
	
	public boolean aplicaDescontos(double porcentagem) {
		if (porcentagem > 0.3) {
			System.out.println("Desconto não pode ser maior que 30%");
		}
		this.valor -= this.valor * porcentagem;
		return true;
	}
	
	public boolean temAutor() {
		return this.autor != null;
	}
	
}
