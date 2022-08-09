
public class Email implements Segurança, SegurancaEmail {
	private String nome;
	private String email;
	private String senha;
	private String celular;
	
	public Email(String nome, String email, String senha, String celular) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.celular = celular;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public void login(String e, String s) {
		if (verificaEmail(e) && verificaSenha(s)) {
			mensagemSucesso();
		} else {
			mensagemFracasso();
		}
	}
	
	@Override
	public boolean verificaEmail(String e) {
		return this.email.equals(e);
	}

	@Override
	public boolean verificaSenha(String senha) {
		
		return this.senha.equals(senha);
	}
	@Override
	public void mensagemSucesso() {
		System.out.println("Acesso concedido!");
		
	}
	@Override
	public void mensagemFracasso() {
		System.out.println("Acesso negado.");
		
	}

	@Override
	public boolean verificaCelular(String c) {
		return this.celular.equals(c);
	}

}
