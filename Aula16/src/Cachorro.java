
public class Cachorro extends Animal{
	private boolean corre;
	

	public Cachorro(String nome, int idade, boolean corre) {
		super(nome, idade);
		this.corre = corre;
		
	}

	
	public boolean isCorre() {
		return corre;
	}
	public void setCorre(boolean corre) {
		this.corre = corre;
	}
	
	
	public void emiteSom() {
		System.out.println("Au!");
	}

}
