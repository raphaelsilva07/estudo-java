package livraria.modelo;

public class Livro {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;

	// construtor
	public Livro(Autor autor) {
		this.isbn = "000-00-00000-00-0";
		this.autor = autor;
	}

	// mostrando detalhes do Livro
	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro ");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);

		System.out.println("---");

		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}

		System.out.println("\n=========================");
	}

	// verificação se existe autor
	public boolean temAutor() {
		return this.autor != null;
	}

	// limitando o desconto a 30%
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.3) {
			return false;
		}

		this.valor -= this.valor * porcentagem;
		return true;
	}

	// ----------------------------------------------
	// getters e setters
	// ----------------------------------------------
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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}
