package core;

public class Estudante extends Pessoa {
	private int numMatricula;
	private String curso;
	
	public void exibir() {
		System.out.println("Estudante :"+nome+"/"+email+"/"+numMatricula+"/"+curso);
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
