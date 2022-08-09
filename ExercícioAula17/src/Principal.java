import java.util.Scanner;

import Ingressos.*;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		Ingresso[] ingressos = new Ingresso[n];
		
		for (int i = 0; i < n; i++) {
			double sorteio = Math.random();
			
			if (sorteio <= 0.5) {
				String nome = s.next();
				boolean ehMeia = s.nextBoolean();
				double preco = s.nextDouble();
				int lote = s.nextInt();
				
				ingressos[i] =  new IngressoComum(nome, ehMeia, preco, lote);
			} else {
				String nome = s.next();
				boolean ehMeia = s.nextBoolean();
				double preco = s.nextDouble();
				int lote = s.nextInt();
				
				ingressos[i] = new IngressoVip(nome, ehMeia, preco, lote);
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(ingressos[i].calculaReembolso());
		}
		
		
		

	}

}
