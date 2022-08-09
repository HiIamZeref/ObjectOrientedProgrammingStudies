
public class Invoice {
	private String ident;
	private int qnt;
	private double preco;
	
	public Invoice(String i, int q, double p) {
		ident = i;
		
		if (q < 0) {
			qnt = 0;
		} else {
			qnt = q;
		}

		if (p < 0) {
			preco = 0;
		} else {
			preco = p;
		}

	}
	
	
	public String getId() {
		return ident;
	}
	public void setId(String i) {
		ident = i;
	}
	
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int q) {
		if (q < 0) {
			qnt = 0;
		}
		else {
			qnt = q;
		}
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double p) {
		if (p < 0) {
			preco = 0;
		}
		else {
			preco = p;
		}
	}
	
	
	public double calculaFatura() {
		return preco*qnt;
	}

}
