public class Funcionario {
	private int funcional;
	private String nome;
	private String email;
	private double salario;
	
	public String exibirInfo() {
		return 	"Funcional : "+funcional+"\n"+
		        "Nome      : "+nome+"\n"+
		        "e-mail    : "+email+"\n"+
		        "Salario   : "+salario+"\n";
	}
	
	public void reajustarSalario(double percentual) {
		salario = salario + salario * percentual / 100;
	}
	
	public double calcularImposto() {
		if (salario > 2000) {
			if (salario <= 3000) {
				return salario * 0.15;
			}
			else if (salario <= 4500) {
				return salario * 0.25;
			}
			else return 2250;
		}
        else return 0;
	}
	
	public int getfuncional() {
		return funcional;
	}
	public void setfuncional(int funcional) {
		this.funcional = funcional;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public double getsalario() {
		return salario;
	}
	public void setsalario(double salario) {
		this.salario = salario;
	}
	
	
}
