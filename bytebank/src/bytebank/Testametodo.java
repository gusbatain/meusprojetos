package bytebank;

public class Testametodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 50;
		conta.deposita(50);
		System.out.println(conta.saldo);

		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);

		Conta conta2 = new Conta();
		conta2.deposita(1000);
		boolean sucessoTransferencia = conta2.transfere(300, conta);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("erro ao transferir");
		}
		System.out.println(conta2.saldo);
		System.out.println(conta.saldo);
		
		conta.titular = "gustavo batain";
		System.out.println(conta.titular);

	}


}
