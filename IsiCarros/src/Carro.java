
public class Carro {
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;
	
	void exibirInfo() {
		System.out.println("Automóvel: "+marca+" - "+modelo);
		System.out.println("      Ano: "+ano);
		System.out.println("      Cor: "+cor);
		System.out.println("    Preço: R$ "+preco+"\n");
	}
	
	void aplicarDesconto (double percentual) {
		preco = preco - preco * percentual / 100;
	}

	double calcularIPVA () {
		double valorIPVA;
		if (ano < 2000) {
			valorIPVA = 0.0;
		}
		else {
			valorIPVA = preco * 0.02;
		}
		return valorIPVA;
	}
}
