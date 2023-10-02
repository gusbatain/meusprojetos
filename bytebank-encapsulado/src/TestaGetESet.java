
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337,24226);
		
		Cliente paulo = new Cliente();
		// conta.titular = paulo;
		paulo.setNome("paulo silveira");

		conta.setTitular(paulo);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("programador");
		conta.getTitular().setCpf("123.345.678.99-99");
		
		// agora em duas linhas:
		
		Cliente titularDaConta = conta.getTitular();

		titularDaConta.setProfissao("programador");
		titularDaConta.setCpf("123.345.678.99-99");

		System.out.println(conta.getTitular().getProfissao());
		System.out.println(conta.getTitular().getCpf());

	}

}
