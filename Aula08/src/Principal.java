import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = 100;
		String[] nomes = new String[n];
		int [] idades = new int[n];
		double [] medias = new double[n];
		
		for (int i = 0; i < 0; i++) {
			nomes[i] = s.next();
			idades[i] = s.nextInt();
			medias[i] = s.nextDouble();
		}
		
		Turma t = new Turma(nomes, idades, medias);
		

	}

}
