package cargo;

public class Presidente extends Funcionario{
	
	private int qntAcoes;

	public Presidente(String nome, String cpf, double salario, int qntAcoes) {
		super(nome, cpf, salario);
		this.qntAcoes = qntAcoes;
	}

	
	public int getQntAcoes() {
		return qntAcoes;
	}
	public void setQntAcoes(int qntAcoes) {
		this.qntAcoes = qntAcoes;
	}
	
	@Override
	public double bonus() {
		return salario*0.1;
	}

}
