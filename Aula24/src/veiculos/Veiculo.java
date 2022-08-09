package veiculos;

public abstract class Veiculo {
	protected double velocidadeAtual;
	protected double tanqueAtual;
	protected double tanqueMax;
	
	public Veiculo(double tanqueMax) {
		this.tanqueMax = tanqueMax;
		this.tanqueAtual = tanqueMax;
		this.velocidadeAtual = 0;
	}

	
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getTanqueAtual() {
		return tanqueAtual;
	}
	public void setTanqueAtual(double tanqueAtual) {
		this.tanqueAtual = tanqueAtual;
	}

	public double getTanqueMax() {
		return tanqueMax;
	}
	public void setTanqueMax(double tanqueMax) {
		this.tanqueMax = tanqueMax;
	}
	
	public abstract void controlarVelocidade(boolean areaUrbana);
	public abstract void abastecer();
	
	public void partida(){
		setVelocidadeAtual(10);
	}
	
	public void parada() {
		setVelocidadeAtual(0);
	}
	
	
	

}
