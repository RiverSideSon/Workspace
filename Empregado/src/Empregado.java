public class Empregado {
	String nome;
	String cargo;
	double salario;
	
	void imprimir() {
		System.out.println("Nome: "+nome);
		System.out.println("Cargo: "+cargo);
		System.out.println("Salario: "+salario);
}
	
	double aumentarSalario (double percentual) {
		salario = salario + salario * percentual / 100;
		return salario;
	}

}