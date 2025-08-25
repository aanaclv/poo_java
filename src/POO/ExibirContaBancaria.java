package POO;

public class ExibirContaBancaria {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		c1.depositar(500);
		c1.sacar(200);
		System.out.println("Saldo atual: R$" + c1.getSaldo());

	}

}
