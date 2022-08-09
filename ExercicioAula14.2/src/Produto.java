
public class Produto {
	private String id;
	private String nome;
	private double valor;
	private int qnt;
	
	public Produto(String id, String nome, double valor, int qnt) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.qnt = qnt;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	
	
	public void imprime() {
		System.out.println("Identificador: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Valor" + valor);
		System.out.println("Quantidade em estoque: " + qnt);
	}
	
	
	
	
	
}
