package coreCliente;

public class Conta {
	protected String nomeTitular;
	protected String cpfTitular;
	protected int numeroConta;
	protected float saldo;
	
	public Conta(String nomeTitular, String cpfTitular, int numeroConta) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.numeroConta = numeroConta;
		this.saldo = 0;
	}

	public String exibirInfo() {
		return "Conta: "+numeroConta+" - "+nomeTitular+" ("+cpfTitular+") R$ "+String.format("%.2f", saldo);
	}
	
	public void creditar(float valor) {
		this.saldo += valor;
	}
	
	public boolean debitar(float valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
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
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}
}
