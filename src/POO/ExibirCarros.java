package POO;
//classe e objeto
public class ExibirCarros {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.marca = "Toyota";
		c1.modelo = "Corolla";
		c1.ano = 2020;
		c1.exibirInfo();
	}

}
