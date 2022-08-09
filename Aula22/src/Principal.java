import java.util.*;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(10);
		lista.add(30);
		lista.add(10);
		int x = 20;
		lista.add(x);
		System.out.println(lista);
		
		
		System.out.println(lista.size());
		double soma = 0;
		
		for (int i = 0; i < lista.size(); i++) {
			soma += lista.get(i);
		}
		
		double media = soma/lista.size();
		
		System.out.println(media);
		
		int elemento = 20;
		boolean has = lista.contains(elemento);
		System.out.println(has);
		
		while (lista.contains(10)){
			lista.remove((Object)10);
		}
		
		System.out.println(lista);
	
	}

}
