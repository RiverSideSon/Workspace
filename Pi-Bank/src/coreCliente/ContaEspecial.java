package coreCliente;

public class ContaEspecial extends Conta{
	
	private float limite;

	public ContaEspecial(String nomeTitular, String cpfTitular, int numeroConta, float limite) {
		super(nomeTitular, cpfTitular, numeroConta);
		this.limite = limite;
	}
	
	public String exibirInfo() {
		return "Conta Especial: "+super.numeroConta+" - "+super.nomeTitular+" ("+super.cpfTitular+") R$ "+String.format("%.2f", super.saldo)+" Limite R% "+String.format("%.2f", this.limite);
	}
	
	public boolean debitar (float valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo -= valor;
			return true;
		}
		return false;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
}
