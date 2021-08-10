public class Carro extends Veiculo{
	String tipo;

	public Carro(String marca, String modelo, String tipo) {
		super(marca, modelo);
		this.tipo = tipo;
	}

	public void acelerar() {
		System.out.println("Acelerar Carro: "+tipo+" - "+marca+"/"+modelo);
		
	}

	public void frear() {
		System.out.println("Frear Carro: "+tipo+" - "+marca+"/"+modelo);
		
	}
}
