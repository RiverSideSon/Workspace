public class Concessionaria {
	public static void main(String[] args) {
		Veiculo v1,v2;
		
		v1 = new Carro("Volks","Fusca","Besouro");
		v2 = new Moto("Kawasaki","Ninja","Corrida");
		
		v1.acelerar();
		v1.frear();
		v2.acelerar();
		v2.frear();
	}
}
