
public class CalculadoraDeEstoque {

	public static void main(String[] args) {

		double soma = 0;
		int contador = 0;

		while (contador < 35) {
			double valorDoLivro = 59.90;
			soma = soma + valorDoLivro;
			contador++;
		}

		System.out.println("O total em estoque ?: " + soma);

		if (soma < 150) {
			System.out.println("Seu estoque está muito baixo!");
		} else if (soma >= 2000) {
			System.out.println("Seu estoque está muito alto!");
		} else {
			System.out.println("Seu estoque está bom");
		}

		do {
			System.out.println("ola");
		} while (soma < 100);

		for (int i = 0; i < soma; i++) {

		}

		for (int i = 0; i <= 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.println(i);
		}
	}
}
