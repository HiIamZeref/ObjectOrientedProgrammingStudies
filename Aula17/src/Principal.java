import java.util.Scanner;

import pacotinho.Apartamento;
import pacotinho.Casa;
import pacotinho.Imovel;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		Imovel[] imoveis = new Imovel[n];
		
		for (int i = 0; i < n; i++) {
			double random = Math.random();
			
			if(random <= 0.5) {
				double tamanho = s.nextDouble();
				int qntQuartos = s.nextInt();
				double precoCompra = s.nextDouble();
				boolean quintal = s.nextBoolean();
				
				imoveis[i] = new Casa(tamanho, qntQuartos, precoCompra, quintal);
			} else {
				double tamanho = s.nextDouble();
				int qntQuartos = s.nextInt();
				double precoCompra = s.nextDouble();
				boolean piscina = s.nextBoolean();
				
				imoveis[i] = new Apartamento(tamanho, qntQuartos, precoCompra, piscina);
			}
		}

	}

}
