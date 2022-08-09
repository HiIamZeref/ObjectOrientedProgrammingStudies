
public class Superclasse implements PrimeiraInterface, SegundaInterface{
	
	private int atributo1;
	private int atributo2;
	
	public Superclasse(int atributo1, int atributo2) {
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
	}

	public int getAtributo1() {
		return atributo1;
	}
	public void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;
	}

	public int getAtributo2() {
		return atributo2;
	}
	public void setAtributo2(int atributo2) {
		this.atributo2 = atributo2;
	}

	@Override
	public int primeiroMetodo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void segundoMetodo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double terceiroMetodo(int d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void quartoMetodo(int d) {
		// TODO Auto-generated method stub
		
	}
	
	

}
