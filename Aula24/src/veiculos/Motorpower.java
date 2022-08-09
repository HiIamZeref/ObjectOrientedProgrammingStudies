package veiculos;

public class Motorpower extends Veiculo {
	private boolean suv;

	public Motorpower(double tanqueMax, boolean suv) {
		super(tanqueMax);
		this.suv = suv;
	}

	public boolean isSuv() {
		return suv;
	}
	public void setSuv(boolean suv) {
		this.suv = suv;
	}

	@Override
	public void controlarVelocidade(boolean areaUrbana) {
		if (!suv || velocidadeAtual < 25 || !areaUrbana) {
			setVelocidadeAtual(2*velocidadeAtual);
		}
		
	}

	@Override
	public void abastecer() {
		if (tanqueAtual < 10) {
			setTanqueAtual(tanqueMax);
		}
		
	}
	
	
	
	
	
	

}
