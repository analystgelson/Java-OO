package livraria;

public class Livro {
	
	//sempre que possível usar 'private', pois pode furgir do encapsulamento
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor; //Chamar uma classe como atributo, é conhecido como composição
	private boolean impresso;
	
	public Livro(Autor autor) { //método construtor
		this();//Estou chamando aqui o construtor Livro()
		this.autor = autor;
		this.impresso = true;
	}
	
	public Livro() { //Uma classe pode sim, ter mais de um construtor. Isso se chama sobrecarga (overloaded) do construtor
		this.isbn = "000-00-00000-00-0"; //definindo um valor padrão para não retornar null
	}
	
	public double getValor(){
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	boolean temAutor(){
		return this.autor != null;
	}

	void adicionarValor(double valor) {
		this.valor = valor;
	}
	
	double retornarValor() {
		return this.valor;
	}
	
	void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro");;
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		
		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}
		
		System.out.println("--");
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.3) {
			return false;
		}
		System.out.println("aplicando desconto no Livro");
		this.valor -= this.valor * porcentagem;
		return true;
	}
}
