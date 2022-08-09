import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//PARTE 1	
		double preco = s.nextDouble();
		int origem = s.nextInt();
		String transporte = s.next();
		boolean perigosa = s.nextBoolean();
		
		//PARTE 2
		double imposto;
		if (preco <= 100) {
			imposto = 0.05 * preco;
		} else {
			imposto = 0.10 * preco;
		}
		
		//PARTE 3
		double valorTransporte;
		if (perigosa == true) {
			if (origem == 1) {
				valorTransporte = 50;
			} else if (origem == 2) {
				valorTransporte = 21;
			} else {
				valorTransporte = 24;
			}
		} else {
			if (origem == 1) {
				valorTransporte = 12;
			} else if (origem == 2) {
				valorTransporte = 21;
			} else {
				valorTransporte = 60;
			}
		}
		
		//PARTE 4
		double seguro;
		if (origem != 2 || transporte.equals("A")) {
			seguro = imposto/2;
		} else {
			seguro = valorTransporte * 2;	
		}
		
		//PARTE 5
		double precoFinal = preco + imposto + valorTransporte + seguro;
		
		System.out.println(precoFinal);
	}

}

/* equivalencias do JS para Java
 *variaveis: int, double(float), boolean
 *condicionais if e else são iguais
 *NÃO EXISTE EQUIVALENCIA ENTRE STRINGS, para isso se usa a função .equals
 *document.write == System.out.println(), sendo o ln colocado para automatico pular linha (pode usar syso)*/
