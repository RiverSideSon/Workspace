import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		
		Produto p = new Produto();
		
		int _Id;
		String _Nome, _strId, _strPreco;
		double _Preco;
		
		System.out.println("Digite o ID: ");
		_strId = keyb.nextLine();
		_Id = Integer.parseInt(_strId);
		p.setId(_Id);
		
		System.out.println("Digite o Nome: ");
		_Nome = keyb.nextLine();
		p.setNome(_Nome);
		
		System.out.println("Digite o Preco: ");
		_strPreco = keyb.nextLine();
		_Preco = Double.parseDouble(_strPreco);
		p.setPreco(_Preco);
		
		System.out.println("Produto cadastrado!");
		System.out.println(p.getId()+" - "+p.getNome()+" - "+p.getPreco());
	}
}
