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
	
	@Override //Usando @Override, o compilador nos ajudar� a validar que esse m�todo � realmente uma reescrita.
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		System.out.println("aplicando desconto no Ebook");
		return super.aplicaDescontoDe(porcentagem); //No super, estou dizendo que vou executar a fun��o aplicaDescontoDe da class pai
	}
}
