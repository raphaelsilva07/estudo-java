package livraria.testes;

import livraria.modelo.Autor;

public class ComparandoReferencias {

	public static void main(String[] args) {

		Autor a1 = new Autor();
		a1.setNome("Rodrigo Turini");
		a1.setEmail("rodrigo.turini@caelum.com.br");
		a1.setCpf("123.456.789.10");

		Autor a2 = new Autor();
		a2.setNome("Rodrigo Turini");
		a2.setEmail("rodrigo.turini@caelum.com.br");
		a2.setCpf("123.456.789.10");

		// if (a1 == a2) {
		if (a1.equals(a2)) {
			System.out.println("Iguais, mesmo autor!");
		} else {
			System.out.println("Diferentes!");
		}
	}
}
