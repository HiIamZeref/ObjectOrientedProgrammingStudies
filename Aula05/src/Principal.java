import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o valor de n");
		int n = s.nextInt();
		
		Produto[] vet = new Produto[n];
		
		
		int qntItem1 = 0;
		double somaP = 0;
		double soma10 = 0;
		int qnt10 = 0;
		
		for (int i = 0; i < n; i++) {
			vet[i] = new Produto();
			
			System.out.println("Digite o c�digo: ");
			vet[i].codigo = s.next();
			
			System.out.println("Digite o peso em kg: ");
			vet[i].peso = s.nextDouble();
			
			System.out.println("Digite o valor em reais: ");
			vet[i].valor = s.nextDouble();
			
			
			if (vet[i].peso > 10 && vet[i].valor < 50) {
				qntItem1++;
			}
			
			if (vet[i].peso > 10) {
				soma10 += vet[i].peso;
				qnt10++;		
			}
			
			
			somaP += vet[i].peso;
		}
		
		int menorIndex = 0;
		int maiorIndex = 0;
		
		for (int i = 0; i < n; i++) {
			if (vet[i].peso < vet[menorIndex].peso) {
				menorIndex = i;
			}
			
			if (vet[i].valor > vet[maiorIndex].valor) {
				maiorIndex = i;
			}
			
		}
		
		System.out.println("Essa � a quantidade de produtos do item 1: " + qntItem1);
		
		double mediaP = somaP/n;
		System.out.println("Essa � a m�dia dos pesos: " + mediaP);
		
		System.out.println("Esses s�o os dados do produto de menor peso: ");
		vet[menorIndex].dados();
		
		System.out.println("Esses s�o dos dados do produto de maior valor: ");
		vet[maiorIndex].dados();
		
		double media10 = soma10/qnt10;
		System.out.println("Essa � a m�dia do item 4: " + media10);

	}

}
