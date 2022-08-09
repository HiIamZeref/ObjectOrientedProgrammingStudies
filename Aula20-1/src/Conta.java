
public class Conta implements Segurança{
	private String cpf;
	private String senha;
	private double saldo;
	
	public Conta(String cpf, String senha, double saldo) {
		this.cpf = cpf;
		this.senha = senha;
		this.saldo = saldo;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	public void sacar(double valor, String s) {
		if (valor <= this.saldo && this.verificaSenha(s)) {
			saldo -= valor;
			this.mensagemSucesso();
		} else {
			this.mensagemFracasso();
		}
	}
	
	public void depositar(double valor, String s) {
		if (this.verificaSenha(s) && valor > 0) {
			this.saldo += valor;
			this.mensagemSucesso();
		} else {
			this.mensagemFracasso();
		}
	}


	@Override
	public boolean verificaSenha(String senha) {
		return senha.equals(this.senha);
	}

	@Override
	public void mensagemSucesso() {
		System.out.println("Operação realizada com sucesso!");
		
	}

	@Override
	public void mensagemFracasso() {
		System.out.println("Operação não realizada.");
		
	}

}
