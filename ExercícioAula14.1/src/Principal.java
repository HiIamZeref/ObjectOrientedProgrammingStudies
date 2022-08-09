
public class Principal {

	public static void main(String[] args) {
		Voo v = new Voo(06, 04, 2022, 10);
		
		System.out.println(v.verifica(5));
		
		v.ocupa(1);
		
		System.out.println(v.vagas());
		
		v.imprime();

	}

}
