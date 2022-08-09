package Ingressos;

public abstract class Ingresso {
	protected String nome;
	protected boolean ehMeia;
	protected double preco;
	protected int lote;
	
	public Ingresso(String nome, boolean ehMeia, double preco, int lote) {
		this.nome = nome;
		this.ehMeia = ehMeia;
		this.preco = preco;
		this.lote = lote;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isEhMeia() {
		return ehMeia;
	}
	public void setEhMeia(boolean ehMeia) {
		this.ehMeia = ehMeia;
	}

	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	
	public abstract double calculaReembolso();
	
	
	
	

}
