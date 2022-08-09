import cargo.Funcionario;
import cargo.Presidente;
import universidade.Bolsista;
import universidade.Estudante;

public class Principal {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("Danilo", "222222", 100);
		Presidente p = new Presidente("Obama", "1111111", 1000, 30);
		
		System.out.println(f.bonus());
		
		System.out.println(p.bonus());
		
		System.out.println(p.getNome());
		
		
		Estudante e = new Estudante(111111, 2022, "Engenharia da Computação");
		Bolsista b = new Bolsista(22222, 2021, "Ciência da Computação", 400);
		
		System.out.println(e.copia(10));
		
		System.out.println(b.copia(10));
		
		System.out.println(b.qntCopias());
		
		

	}

}
