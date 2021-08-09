package ui;

import core.Estudante;
import core.Pessoa;

public class AppQueUsaJava {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setNome("Eduardo");
		p.setEmail("edu@itau.com.br");
		
		p.exibir();
		
		Estudante e = new Estudante();
		
		e.setNome("Jose");
		e.setEmail("jose@meail.com.br");
		e.setNumMatricula(1234);
		e.setCurso("Computacao");
		
		e.exibir();
	}
}
