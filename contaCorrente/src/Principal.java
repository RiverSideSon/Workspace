public class Principal {
	public static void main(String[] args) {
		contaCorrente cc1;
		
		cc1 = new contaCorrente();

		cc1.nomeTitular = "Eduardo";
		cc1.cpfTitular = "123.456.789-10";
		cc1.numeroCC = 12345;
		cc1.digVerifica = 6;
		cc1.saldoCC = 5826.27;
		
		cc1.exibirCC();
		System.out.println("--------------------");
		cc1.depositoCC(1000);
		cc1.exibirCC();
		System.out.println("--------------------");
		cc1.saqueCC(8000);
		cc1.exibirCC();
		System.out.println("--------------------");
	}
}
