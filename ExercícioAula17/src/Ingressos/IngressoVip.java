package Ingressos;

public class IngressoVip extends Ingresso {

	public IngressoVip(String nome, boolean ehMeia, double preco, int lote) {
		super(nome, ehMeia, preco, lote);
		
	}

	@Override
	public double calculaReembolso() {
		if (this.ehMeia == false || this.lote == 1) {
			return 0.1*this.preco;
		} else {
			return 0.06*this.preco;
		}
	}

}
