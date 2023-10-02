
public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular = new Cliente();

	public void deposita(double valor) {
		saldo += valor;

	}

	public boolean saca(double valor) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
		} 	else {
				return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				destino.deposita(valor);
				return true;
		}
			return false;
	}

		public double saldo(){
			return this.saldo;
	}


}
