
public class Preguica extends Animal {
	private boolean escala;
	
	public Preguica(String nome, int idade, boolean escala) {
		super(nome, idade);
		this.escala = escala;
	}

	
	public boolean isEscala() {
		return escala;
	}
	public void setEscala(boolean escala) {
		this.escala = escala;
	}
	
	
	public void emiteSom() {
		System.out.println("???");
	}
	

}
