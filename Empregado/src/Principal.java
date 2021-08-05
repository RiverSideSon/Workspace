public class Principal {
	public static void main(String[] args) {
		Empregado e1;
		
		e1 = new Empregado();

		e1.nome = "Isidro";
		e1.cargo = "Professor";
		e1.salario = 10000;
		
		System.out.println("-- Antes do aumento");
		
		e1.imprimir();

		e1.aumentarSalario(10);
		
		System.out.println("-- Depois do aumento");
		
		e1.imprimir();
	}
}
