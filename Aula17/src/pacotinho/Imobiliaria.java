package pacotinho;

public class Imobiliaria {
	private Imovel[] imoveis;

	public Imobiliaria(Imovel[] imoveis) {
		this.imoveis = imoveis;
	}

	
	public Imovel[] getImoveis() {
		return imoveis;
	}
	public void setImoveis(Imovel[] imoveis) {
		this.imoveis = imoveis;
	}
	
	
	public double mediaPrecoCompra() {
		double soma = 0;
		
		for (int i = 0; i < imoveis.length; i++) {
			soma += imoveis[i].precoCompra;
		}
		
		double media = (soma/imoveis.length);
		return media;
	}
	
	public int qntCasas() {
		int qntCasas = 0;
		
		for (int i = 0; i < imoveis.length; i++) {
			if (imoveis[i] instanceof Casa) {
				qntCasas++;
			}
		}
		
		return qntCasas;
	}
	
	public int qntApts() {
		int qntApts = 0;
		
		for (int i = 0; i < imoveis.length; i++) {
			if (imoveis[i] instanceof Apartamento) {
				qntApts++;
			}
		}
		
		return qntApts;
	}
	
	public Imovel maiorPrecoVenda() {
		Imovel maiorPrecoVenda = imoveis[0];
		
		for (int i = 0; i < imoveis.length; i++) {
			if (maiorPrecoVenda.precoVenda() < imoveis[i].precoVenda()) {
				maiorPrecoVenda = imoveis[i];
			}
		}
		
		return maiorPrecoVenda;
	}
	
	public int qntPiscinas() {
		int qntPiscinas = 0;
		
		for (int i = 0; i < imoveis.length; i++) {
			if (this.imoveis[i] instanceof Apartamento) {
				Apartamento check = (Apartamento) imoveis[i];
				
				if (check.isPiscina()) {
					qntPiscinas++;
				}
				
			}
		}
		
		return qntPiscinas;
	}
	
	

}
