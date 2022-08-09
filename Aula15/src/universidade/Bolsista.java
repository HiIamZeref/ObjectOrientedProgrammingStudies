package universidade;

public class Bolsista extends Estudante{
	
	private double bolsa;

	public Bolsista(int matricula, int ano, String curso, double bolsa) {
		super(matricula, ano, curso);
		this.bolsa = bolsa;
	}

	
	public double getBolsa() {
		return bolsa;
	}
	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
	
	
	@Override
	public double copia(int n) {
		return n*0.07;
	}
	
	public double qntCopias() {
		double qntCopias = bolsa/0.07;
		return Math.floor(qntCopias);
	}
	

}
