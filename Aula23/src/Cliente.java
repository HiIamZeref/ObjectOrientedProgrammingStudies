
public class Cliente {
	private int id;
	private String nome;
	private int ano;
	private int telefone;
	
	public Cliente(int id, String nome, int ano, int telefone) {
		this.id = id;
		this.nome = nome;
		this.ano = ano;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	

}
