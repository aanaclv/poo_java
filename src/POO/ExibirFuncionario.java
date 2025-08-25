package POO;

public class ExibirFuncionario {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("Ana", 3000);
		Gerente g = new Gerente("Carlos", 4000, 1000);
		
		System.out.printf("%s salário: R$ %.2f%n", f.nome, f.salario);
		System.out.printf("%s Salário: R$ %.2f%n", g.nome, g.CalcularSalarioTotal());
	}

}
