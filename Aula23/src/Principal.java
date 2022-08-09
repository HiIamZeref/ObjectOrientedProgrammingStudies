import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Academia c = new Academia();
		
		Cliente c1 = new Cliente(10, "Felipe", 2001, 12345);
		Cliente c2 = new Cliente(20, "Gaby", 2002, 12345);
		Cliente c3 = new Cliente(30, "Coimbra", 1980, 67890);
		
		c.cadastro(c1);
		c.cadastro(c2);
		c.cadastro(c3);
		
		c.remover(c2);
		
		

	}

}
