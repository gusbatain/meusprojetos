
public class testaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.saldo());
		
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
		contaDaMarcela.titular.cpf = "444.222.22.2";
		System.out.println(contaDaMarcela.titular.cpf);
				
	}

} 