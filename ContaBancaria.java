package encapsulando;

public class ContaBancaria {
//Atributo privado
	private double saldo;
	
	// Construtor para inicializar o saldo
	public ContaBancaria (double saldoInicial) {
		if (saldoInicial>=0) {
			this.saldo=saldoInicial;
		}
		else{
			this.saldo=0;
		}
	}
	//getter para saldo
	public double getSaldo() {
		return saldo;
	}
	//metodo para depositar dinheiro (so aceita valores positivos)
	public void depositor(double valor) {
		if(valor>0) {
			saldo += valor;
		}
		else {
			System.out.println("valor de deposito invalido!");
		}
	}
	//metodo para sacar dinheiro (nao pode mais do que o saldo)
	public void sacar(double valor) {
		if (valor> 0 && valor <= saldo) {
			saldo-= valor;
		}
		else {
			System.out.println("saque invalido! verifique o valor");
		}
	}	
	
}
