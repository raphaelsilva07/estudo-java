
public class TestaMetodoSemRetorno {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.saldo = 1000;

		if (c.saca(2000)) {
			System.out.println("Consegui sacar");
		} else {
			System.out.println("Não consegui sacar");
		}
	}
}
