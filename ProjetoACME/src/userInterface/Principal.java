package userInterface;

import java.util.ArrayList;

import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Funcionario;
import core.Horista;

public class Principal {
	public static void main(String[] args) {

		ArrayList<Funcionario> lista;
		lista = new ArrayList<Funcionario>();

		lista.add(new Chefe(1,"Chefe",8000,10,500));
		lista.add(new Comissionado(2,"Comissionado",5000,10));
		lista.add(new Horista(3,"Horista",25,160));
		lista.add(new Empreiteiro(4,"Empreiteiro",2000));

		for (Funcionario f : lista) {
			System.out.println(f.getNome()+" - Salario: "+f.calcularSalario());
		}
		System.out.println("");
		for (int c = lista.size() - 1; c >= 0; c--) {
			System.out.println(lista.get(c).getNome()+" - Salario: "+lista.get(c).calcularSalario());
		}
/*
		Funcionario lista[];
		
		lista = new Funcionario[4];
		
		lista[0] = new Chefe(1,"Chefe",8000,10,500);
		lista[1] = new Comissionado(2,"Comissionado",5000,10);
		lista[2] = new Horista(3,"Horista",25,160);
		lista[3] = new Empreiteiro(4,"Empreiteiro",2000);
		
		for (int c = 0; c < lista.length; c++) {
		  System.out.println(lista[c].getNome()+" - Salario: "+lista[c].calcularSalario());
		}
		
		Funcionario f1, f2, f3, f4;

		f1 = new Chefe(1,"Chefe",8000,10,500);
		f2 = new Comissionado(2,"Comissionado",5000,10);
		f3 = new Horista(3,"Horista",25,160);
		f4 = new Empreiteiro(4,"Empreiteiro",2000);

		System.out.println(f1.getNome()+" - Salario: "+f1.calcularSalario());
		System.out.println(f2.getNome()+" - Salario: "+f2.calcularSalario());
		System.out.println(f3.getNome()+" - Salario: "+f3.calcularSalario());
		System.out.println(f4.getNome()+" - Salario: "+f4.calcularSalario());
*/
	}
}
