package POO;
//encapsulamento
public class ContaBancaria {
	private double saldo;
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}
