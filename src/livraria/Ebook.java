package livraria;

public class Ebook extends Livro{

	private String waterMark;
	
	public Ebook(Autor autor) {
		super(autor);//o Super � para delegar a responsabilidade para a superclasse que j� tem esse comportamente bem definido.
	}
	
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public String getWaterMark() {
		return waterMark;
	}
}
