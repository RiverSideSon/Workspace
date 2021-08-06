import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	
		int opcao;
		double valor;
		
		cc cc1;
		
		cc1 = new cc();
		cc1.setNumeroCC(12345);
		cc1.setDigVerificador(6);
		cc1.setNomeTitular("Eduardo Ribeiro");
		cc1.setCpfTitular("123.456.789-10");
		cc1.setSaldoCC(2048.02);
		
		do {
			System.out.println("Bem vindo ao Isitaú - Seu banco na VDI");
			System.out.println("Selecione uma opção: 1 - Info / 2 - Deposito / 3 - Saque / 0 - Sair");

			opcao = keyboard.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println(cc1.exibir());
				break;
			case 2:
				System.out.println("[2 - Deposito] Digite o valor: ");
				valor = keyboard.nextDouble();
				cc1.deposito(valor);
				break;
			case 3:
				System.out.println("[3 - Saque] Digite o valor: ");
				valor = keyboard.nextDouble();
				if (cc1.saque(valor)) {
					System.out.println("Saque autorizado");
				}
				else {
					System.out.println("Saque não autorizado - Saldo insuficiente");
				}
				break;
			case 0:
				System.out.println("[0 - Sair] Bye Bye");
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}

		} while (opcao !=0);

		System.out.println("Opção selecionada: 0 - Sair");
		
		keyboard.close();
	}
}
