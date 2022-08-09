import java.util.ArrayList;
import veiculos.*;

public class Administracao {
	private ArrayList<Veiculo> veiculos;
	
	public Administracao() {
		veiculos = new ArrayList<Veiculo>();
	}

	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
	
	public void add(Veiculo v) {
		veiculos.add(v);
	}
	
	public void remove(Veiculo v) {
		for (int i = 0; i < veiculos.size(); i++) {
			Veiculo r = veiculos.get(i);
			
			if (r.getClass() == v.getClass()) {
				if (r.equals(v)) {
					veiculos.remove(i);
				}			
			}
		}
	}
	
	public void removerParados() {
		for (int i = 0; i < veiculos.size() ; i++) {
			if (veiculos.get(i).getVelocidadeAtual() == 0) {
				veiculos.remove(i);
				i--;
			}
		}
	}
	
	public ArrayList<Veiculo> velocidadeSuperior(double valor){
		ArrayList<Veiculo> retorno = new ArrayList<Veiculo>();
		
		for (int i = 0; i < veiculos.size(); i++) {
			if (veiculos.get(i).getVelocidadeAtual() > valor) {
				retorno.add(veiculos.get(i));
			}
		}
		
		return retorno;
	}
	

}
