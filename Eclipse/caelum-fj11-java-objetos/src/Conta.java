
public class Conta {
	int numero;
	String dono;
	double saldo;
	double limite;

	public boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}

}
