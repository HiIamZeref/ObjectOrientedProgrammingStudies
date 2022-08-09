package universidade;

public class Estudante {
	private int matricula;
	private int ano;
	private String curso;
	
	public Estudante(int matricula, int ano, String curso) {
		super();
		this.matricula = matricula;
		this.ano = ano;
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public double copia(int n) {
		return n*0.1;
	}
	
	
	
	

}
