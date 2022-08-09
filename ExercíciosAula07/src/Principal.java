
public class Principal {

	public static void main(String[] args) {
		 Elevador e = new Elevador(10, 15);
		 
		 Data d = new Data(23, 02, 2022);
		 Data c = new Data(23, 02, 2022);
		 
		 
		 System.out.println(d.fullData());
		 System.out.println(d.compareData(c));
		 System.out.println(d.vemAntes(c));
		
		 for (int i = 0; i < 1000; i++) {
			 double sorteio = Math.random();
			 
			 if (sorteio <= 0.25) {
				 e.sobe();
			 } else if (sorteio <= 0.5) {
				 e.desce();
			 } else if (sorteio <= 0.75) {
				 e.entra();
			 } else {
				 e.sai();
			 }
			 e.status();
		 }
		 

	}

}
