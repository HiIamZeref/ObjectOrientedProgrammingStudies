
public class Imovel {
	private int tipo; // TIPO 1: CASA; TIPO 2: APT;
	private String prop; //
	private double tamanho; //
	private boolean nobre;//
	private int ano;//
	private double compra;
	
	public Imovel(int tipo, String proprietario, double tamanho, boolean nobre, int ano, double compra) {
		this.tipo = tipo;
		this.prop = proprietario;
		this.tamanho = tamanho;
		this.nobre = nobre;
		this.ano = ano;
		this.compra = compra;
	}
	
	
	public int getTipo() {
		return this.tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public String getProp() {
		return this.prop;
	}
	public void setProp(String prop) {
		this.prop = prop;
	}
	
	public double getTamanho() {
		return this.tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public boolean getNobre() {
		return this.nobre;
	}
	public void setNobre(boolean nobre) {
		this.nobre = nobre;
	}
	
	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public double getCompra() {
		return this.compra;
	}
	public void setCompra(double compra) {
		this.compra = compra;
	}
	
	
	public double calculaIPTU() {
		if (this.tipo == 1) {
			if (this.tamanho > 100) {
				return 0.03;
			} else {
				return 0.01;
			}
		} else {
			if (this.tamanho > 100) {
				return 0.05;
			} else {
				return 0.02;
			}
		}
	}
	
	public double precoVenda() {
		if (nobre) {
			if (this.tamanho > 100) {
				return compra*(180/100);
			} else {
				return compra*(110/100);
			}
		} else {
			if (this.tamanho > 100) {
				return compra*(120/100);
			} else {
				return compra*(105/100);
			}
		}
	}
	
	public int idade(int anoAtual) {
		return anoAtual - this.ano;
	}
	
	public void dados() {
		System.out.println("Tipo do imóvel: " + this.tipo);
		System.out.println("Proprietário: " + this.prop);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Bairro nobre: " + this.nobre);
		System.out.println("Ano de aquisição: " + this.ano);
		System.out.println("Valor de compra: " + this.compra);
		
	}
}
