public class cc {
	private int numeroCC;
	private int digVerificador;
	private String nomeTitular;
	private String cpfTitular;
	private double saldoCC;
	
	public String exibir() {
		return 	"CC/Digito  : "+numeroCC+"/"+digVerificador+"\n"+
		        "Titular    : "+nomeTitular+" ("+cpfTitular+")"+"\n"+
		        "Saldo      : R$ "+saldoCC;
	}
	
	public void deposito (double valor) {
		saldoCC += valor;
	}
	
	public boolean saque (double valor) {
		if (saldoCC >= valor) {
			saldoCC -= valor;
			return true;
		}
		return false;
	}

	public int getNumeroCC() {
		return numeroCC;
	}

	public void setNumeroCC(int numeroCC) {
		this.numeroCC = numeroCC;
	}

	public int getDigVerificador() {
		return digVerificador;
	}

	public void setDigVerificador(int digVerificador) {
		this.digVerificador = digVerificador;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public double getSaldoCC() {
		return saldoCC;
	}

	public void setSaldoCC(double saldoCC) {
		this.saldoCC = saldoCC;
	}
}
