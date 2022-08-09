
public class Conta {
	private String nome;
	private int id;
	private double saldo;
	
	
	public Conta(String n, int i, double s) {
		nome = n;
		id = i;
		saldo = s;
		
	
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	public String getNome() {
		return nome;
	}
	public int getId() {
		return id;
	}
	
	
	public void setNome(String n) {
		nome = n;
	}
	public void setId(int i) {
		id = i;
	}
	public void setSaldo(double s) {
		saldo = s;
	}
	
	
	public double bonif(){
		return saldo*0.1;
	}
	
	
	public void saque(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
		}
		else {
			System.out.println("Valor maior que o saldo.");
		}
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void dados() {
		System.out.println("Nome: " + nome);
		System.out.println("Conta: " + id);
		System.out.println("Saldo: R$" + saldo);
		System.out.println("Bonificação: R$" + bonif());
	}

}
