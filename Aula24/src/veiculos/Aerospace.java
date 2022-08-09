package veiculos;

public class Aerospace extends Veiculo {
	private boolean bagageiro;

	public Aerospace(double tanqueMax, boolean bagageiro) {
		super(tanqueMax);
		this.bagageiro = bagageiro;
	}

	public boolean isBagageiro() {
		return bagageiro;
	}
	public void setBagageiro(boolean bagageiro) {
		this.bagageiro = bagageiro;
	}

	@Override
	public void controlarVelocidade(boolean areaUrbana) {
		if (!bagageiro && velocidadeAtual < 30 && areaUrbana) {
			setVelocidadeAtual(1.5*velocidadeAtual);
		}
		
	}

	@Override
	public void abastecer() {
		if (tanqueAtual < 20) {
			setTanqueAtual(tanqueMax);
		}
		
	}
	
	

}
