import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = 5;
		
		Produto[] p = new Produto[n];
		

		for (int i = 0; i < n ; i++) {
			String id = s.next();
			String nome = s.next();
			double valor = s.nextDouble();
			int qnt = s.nextInt();
			
			p[i] = new Produto(id, nome, valor, qnt);
			
		}
		
		Loja l = new Loja(p);
		
		l.abastecer(0);
		
		l.vender(0);
		
		System.out.println(l.valorEstoque());

	}

}
