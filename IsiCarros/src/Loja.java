
public class Loja {
	public static void main (String[] args) {
		Carro c1, c2;

		c1 = new Carro();
		c2 = new Carro();

		c1.marca = "Pórxy";
		c1.modelo = "Kaineni";
		c1.ano = 2021;
		c1.cor = "Preto";
		c1.preco = 780000;
		
		c2.marca = "Xevrolé";
		c2.modelo = "Corça";
		c2.ano = 1997;
		c2.cor = "Prata meio gasto";
		c2.preco = 7500;
		
		c1.exibirInfo();
		c2.exibirInfo();

		c1.aplicarDesconto(10.0);
		c2.aplicarDesconto(5.0);
		
		c1.exibirInfo();
		c2.exibirInfo();
		
		double ipvac1 = c1.calcularIPVA();
		double ipvac2 = c2.calcularIPVA();
		
		System.out.println("IPVA c1: "+ipvac1);
		System.out.println("IPVA c2: "+ipvac2);
		}
}
