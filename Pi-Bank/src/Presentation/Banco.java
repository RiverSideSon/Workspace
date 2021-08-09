package Presentation;

import coreCliente.Conta;
import coreCliente.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
		Conta c1, c2;
		
		c1 = new Conta ("Eduardo","123.456.789-10",1234);
		c2 = new ContaEspecial ("Asdrubal","198.765.432-10",8765,200);

		System.out.println(c1.exibirInfo());
		c1.creditar(100);
		System.out.println(c1.exibirInfo());
		
		if (c1.debitar(200)) {
			System.out.println("Debito aprovado.");
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
		System.out.println(c1.exibirInfo());
		
		System.out.println(c2.exibirInfo());
		c2.creditar(30);
		System.out.println(c2.exibirInfo());

		if (c2.debitar(200)) {
			System.out.println("Debito aprovado.");
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
		System.out.println(c2.exibirInfo());
	}
}
