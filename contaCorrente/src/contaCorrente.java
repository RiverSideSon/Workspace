public class contaCorrente {
	int numeroCC;
	int digVerifica;
	String nomeTitular;
	String cpfTitular;
	double saldoCC;
	
	void exibirCC() {
		System.out.println("CC/Digito  : "+numeroCC+"/"+digVerifica);
		System.out.println("Titular    : "+nomeTitular+" ("+cpfTitular+")");
		System.out.printf("Saldo      : %.2f\n", saldoCC);
	}
	
	void depositoCC (double valor) {
		saldoCC = saldoCC + valor;
	}

	void saqueCC (double valor) {
		if (saldoCC - valor < 0) {
			System.out.println("Saldo insuficiente.");
		}
		else {
			saldoCC = saldoCC - valor;
		}
	}
	
}