import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Cachorro c = new Cachorro("Bob", 3, true);
		Preguica p = new Preguica("Tom", 10, true);
		
		c.emiteSom();
		p.emiteSom();
		
		Animal zoo[] = new Animal[10];
		
		for (int i = 0; i < 10; i++) {
			double sorteio = Math.random();
			
			if (sorteio <= 0.25) {
				String nome = s.next();
				int idade = s.nextInt();
				boolean corre = s.nextBoolean();
				zoo[i] = new Cachorro(nome, idade, corre);
			} else if (sorteio <= 0.5){
				String nome = s.next();
				int idade = s.nextInt();
				boolean escala = s.nextBoolean();
				zoo[i] = new Preguica(nome, idade, escala);
			} else if (sorteio <= 0.75) {
				String nome = s.next();
				int idade = s.nextInt();
				boolean perigoso = s.nextBoolean();
				zoo[i] = new Gato(nome, idade, perigoso);
			} else {
				String nome = s.next();
				int idade = s.nextInt();
				boolean hipismo = s.nextBoolean();
				zoo[i] = new Cavalo(nome, idade, hipismo);
			}
		}
		
		Zoo z = new Zoo(zoo, "Papiro");

	}

}
