package pacotinho;

public abstract class Imovel {
	protected double tamanho;
	protected int qntQuartos;
	protected double precoCompra;
	
	public Imovel(double tamanho, int qntQuartos, double precoCompra) {
		this.tamanho = tamanho;
		this.qntQuartos = qntQuartos;
		this.precoCompra = precoCompra;
	}

	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public int getQntQuartos() {
		return qntQuartos;
	}
	public void setQntQuartos(int qntQuartos) {
		this.qntQuartos = qntQuartos;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}
	
	public abstract double precoVenda();
	
	
	
	

}
