package pacotinho;
public class Casa extends Imovel {
	private boolean quintal;

	public Casa(double tamanho, int qntQuartos, double precoCompra, boolean quintal) {
		super(tamanho, qntQuartos, precoCompra);
		this.quintal = quintal;
		
	}

	public boolean isQuintal() {
		return quintal;
	}
	public void setQuintal(boolean quintal) {
		this.quintal = quintal;
	}
	
	@Override
	public double precoVenda() {
		if (this.qntQuartos > 4 || quintal) {
			return precoCompra*1.3;
		} else {
			return precoCompra*1.15;
		}
	}

}
