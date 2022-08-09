package pacotinho;
public class Apartamento extends Imovel {
	private boolean piscina;

	public Apartamento(double tamanho, int qntQuartos, double precoCompra, boolean piscina) {
		super(tamanho, qntQuartos, precoCompra);
		this.piscina = piscina;
	}

	public boolean isPiscina() {
		return piscina;
	}
	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}
	
	@Override
	public double precoVenda() {
		if (this.tamanho > 300 && piscina) {
			return this.precoCompra*1.5;
		} else {
			return this.precoCompra*1.1;
		}
	}

}
