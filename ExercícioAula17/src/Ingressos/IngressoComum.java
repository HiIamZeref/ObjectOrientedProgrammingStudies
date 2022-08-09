package Ingressos;

public class IngressoComum extends Ingresso {

	public IngressoComum(String nome, boolean ehMeia, double preco, int lote) {
		super(nome, ehMeia, preco, lote);
		
	}

	@Override
	public double calculaReembolso() {
		if (this.ehMeia == false || this.lote == 1) {
			return 0.05*this.preco;
		} else {
			return 0.03*this.preco;
		}
	}

}
