
public class Loja {
	private Produto[] produtos;

	public Loja(Produto[] produtos) {
		this.produtos = produtos;
	}

	
	public Produto[] getProdutos() {
		return produtos;
	}
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	
	
	public void vender(int produto) {
		int qnt = produtos[produto].getQnt();
		produtos[produto].setQnt(qnt - 1);
	}
	
	public void abastecer(int produto) {
		int qnt = produtos[produto].getQnt();
		produtos[produto].setQnt(qnt + 1);
	}
	
	public double valorEstoque() {
		double total = 0;
		
		for (int i = 0 ; i < produtos.length ; i++) {
			total += produtos[i].getValor();
		}
		
		return total;
	}
	
	
	

}
