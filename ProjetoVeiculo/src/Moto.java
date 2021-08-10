public class Moto extends Veiculo{
	String tipo;

	public Moto(String marca, String modelo, String tipo) {
		super(marca, modelo);
		this.tipo = tipo;
	}

	public void acelerar() {
		System.out.println("Acelerar Moto: "+tipo+" - "+marca+"/"+modelo);
		
	}

	public void frear() {
		System.out.println("Frear Moto: "+tipo+" - "+marca+"/"+modelo);
		
	}

}
