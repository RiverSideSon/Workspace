
public abstract class Veiculo {
	String marca;
	String modelo;

	public Veiculo(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public abstract void acelerar();
	public abstract void frear();
}
