import java.util.ArrayList;

public class Academia {
	private ArrayList<Cliente> clientes;

	public Academia(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Academia() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	public void cadastro(Cliente c) {
		clientes.add(c);
	}
	
	public void remover(Cliente c) {
		int idRemove = c.getId();
		
		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			
			if (cliente.getId() == idRemove) {
				clientes.remove(i);
			}
		}
	}
	
	public int returnQntClientes() {
		return clientes.size();
	}
	
	public ArrayList<Cliente> clientes2000() {
		ArrayList<Cliente> clientes2000 = new ArrayList<Cliente>();
		
		for (int i = 0; i < clientes.size(); i++) {
			Cliente c = clientes.get(i);
			
			if (c.getAno() > 2000) {
				clientes2000.add(c);
			}
		}
		return clientes2000;
	}
	
	public void remove1990() {
		for (int i = 0; i < clientes.size(); i++) {
			Cliente c = clientes.get(i);
			
			if (c.getAno() < 1990) {
				clientes.remove(i);
				i--;
			}
		}
	}
	
	

}
