import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int tamanho = s.nextInt();		
		double[] notas = new double[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			notas[i] = s.nextDouble();
		}
		
		//SOMATÓRIO
		double soma = 0;
		for (int i = 0; i < tamanho; i++) {
			soma = soma + notas[i];
		}
		System.out.println("Média é " + soma/tamanho);
		
		
		//CONTAGEM
		int cnt = 0;
		for (int i = 0; i < tamanho; i++) {
			if (notas[i] > 6) {
				cnt++; 
			}
		}
		System.out.println("Notas maiores do que 6 " + cnt);
		
		
		//MAIOR ELEMENTO
		double maximo = notas[0];
		for (int i = 0; i < tamanho; i++) {
			if (notas[i] > maximo) {
				maximo = notas[i];
			}
		}
		System.out.println("Maior elemento é " + maximo);
		
		
		//MENOR ELEMENTO
		double minimo = notas[0];
		for (int i = 0; i < tamanho; i++) {
			if (notas[i] < minimo)	{
				minimo = notas[i];
			}
		}
		System.out.println("Menor elemento é " + minimo);

	}

}
