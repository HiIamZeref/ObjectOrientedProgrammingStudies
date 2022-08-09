
public class Cavalo extends Animal {
	private boolean hipismo;

	public Cavalo(String nome, int idade, boolean hipismo) {
		super(nome, idade);
		this.hipismo = hipismo;
	}
	

	public boolean isHipismo() {
		return hipismo;
	}
	public void setHipismo(boolean hipismo) {
		this.hipismo = hipismo;
	}


	@Override
	public void emiteSom() {
		System.out.println("Irra!");

	}

}
