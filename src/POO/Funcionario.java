package POO;

public class Funcionario {
	String nome;
	double salario;
	
	Funcionario(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
}

class Gerente extends Funcionario {
	double bonus;
	
	Gerente(String nome, double salario, double bonus){
		super(nome, salario);
		this.bonus = bonus;
	}
	
	double CalcularSalarioTotal() {
		return salario + bonus;
	}
}


