
public class ComparandoReferencias {

	public static void main(String[] args) {

		Autor a1 = new Autor();
		a1.nome = "Rodrigo Turini";
		a1.email = "rodrigo.turini@caelum.com.br";
		a1.cpf = "123.456.789.10";

		Autor a2 = new Autor();
		a2.nome = "Rodrigo Turini";
		a2.email = "rodrigo.turini@caelum.com.br";
		a2.cpf = "123.456.789.10";

		// if (a1 == a2) {
		if (a1.equals(a2)) {
			System.out.println("Iguais, mesmo autor!");
		} else {
			System.out.println("Diferentes!");
		}

		// ---------------------------------
		System.out.println();

		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";

		Livro livro = new Livro();
		livro.autor = autor;

		System.out.println(autor.nome);

		livro.autor.nome = "Guilherme Silveira";
		System.out.println(autor.nome);

	}
}
