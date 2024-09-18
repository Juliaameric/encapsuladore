package encapsulando;

public class ObjetoContaBancaria {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(100000.00);
		
		//saldo inicial
		System.out.println(conta.getSaldo());
		
		//deposito
		conta.depositor(500);
		conta.depositor(1000);
		
		//mostrar saldo apos 2 depositos
		System.out.println(conta.getSaldo());
		
		//saque
		conta.sacar(15000);
		
		//mostrar apos saque
		System.out.println(conta.getSaldo());
	}

}
