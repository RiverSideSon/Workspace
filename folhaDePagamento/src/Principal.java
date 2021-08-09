
public class Principal {
	public static void main(String[] args) {
		Funcionario func1, func2, func3;
		
		func1 = new Funcionario(123456789,"Eduardo","edu@itau.com.br",1000);
		func2 = new Funcionario(987654321,"João","joao@itau.com.br",2500);
		func3 = new Funcionario(123459876,"Maria","maria@itau.com.br",10000);
/*
		func1.setfuncional(123456789);
		func1.setnome("Eduardo");
		func1.setemail("edu@itau.com.br");
		func1.setsalario(1000);
		
		func2.setfuncional(987654321);
		func2.setnome("João");
		func2.setemail("joao@itau.com.br");
		func2.setsalario(2500);
		
		func3.setfuncional(123459876);
		func3.setnome("Maria");
		func3.setemail("maria@itau.com.br");
		func3.setsalario(10000);
*/		
		func1.reajustarSalario(5);
		func2.reajustarSalario(20);
		func3.reajustarSalario(5);

		System.out.println(func1.padRight("Nome", 20, " ")+
		                   func1.padRight("Salario", 20, " ")+
		                   func1.padRight("Imposto", 20, " "));

		System.out.println(func1.padRight("", 19, "-")+" "+
                           func1.padRight("", 19, "-")+" "+
                           func1.padRight("", 19, "-"));
		
		System.out.println(func1.getnome()+func1.getsalario()+func1.calcularImposto()+"\n"+
				           func2.getnome()+func2.getsalario()+func2.calcularImposto()+"\n"+
				           func3.getnome()+func3.getsalario()+func3.calcularImposto());
	}
}
