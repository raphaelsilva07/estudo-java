
public class Livro {

	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;

	@Override
	public String toString() {
		return "-------------------------------------" + "\nNome: " + nome + "\nDescricao: " + descricao + "\nValor: "
				+ valor + "\nIsbn: " + isbn + "\n" + "-----\n" + autor + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		return result;
	}

}
