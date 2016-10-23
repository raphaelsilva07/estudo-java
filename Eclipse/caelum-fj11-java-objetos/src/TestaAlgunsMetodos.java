
public class TestaAlgunsMetodos {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.dono = "Duke";
		c.saldo = 1000;

		c.saca(200);

		c.deposita(500);

		System.out.println(c.saldo);
	}
}
