package livraria.testes;

import livraria.modelo.Livro;

public class RegrasDeDesconto {

	public static void main(String[] args) {

		Livro livro = new Livro(null);
		livro.setValor(59.90);

		System.out.println("Valor atual: " + livro.getValor());

		if (!livro.aplicaDescontoDe(0.31)) {
			System.out.println("Desconto não pode ser maior do que 30%");
		} else {
			System.out.println("Valor com desconto: " + livro.getValor());
		}
	}
}
