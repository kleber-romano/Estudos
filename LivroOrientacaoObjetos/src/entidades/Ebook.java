package entidades;

public class Ebook extends Livro{
	private String waterMark;

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public Ebook() {
		
	}
	
	
	public Ebook(Autor autor) {
		super(autor);
	}
	@Override
	public boolean aplicaDescontos(double porcentagem) {
		if (porcentagem > 0.15) {
			System.out.println("Desconto não pode ser maior que 15% para ebooks");
			return false;
		}else {double desconto = this.getValor() * porcentagem;
			this.setValor(this.getValor() - desconto);
			return true;}
		}
		
	}

