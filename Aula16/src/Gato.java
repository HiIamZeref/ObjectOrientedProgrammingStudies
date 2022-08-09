
public class Gato extends Animal {
	private boolean perigoso;
	
	public Gato(String nome, int idade, boolean perigoso) {
		super(nome, idade);
		this.perigoso = perigoso;
	}

	
	public boolean isPerigoso() {
		return perigoso;
	}
	public void setPerigoso(boolean perigoso) {
		this.perigoso = perigoso;
	}



	@Override
	public void emiteSom() {
		System.out.println("Meow!");

	}

}
