
public class Voo extends Data{
	private int numAssentos;
	private boolean[] assentosOcupados; //TRUE == ASSENTO OCUPADO; FALSE == ASSENTO VAGO//
	

	public Voo(int dia, int mes, int ano, int numAssentos) {
		super(dia, mes, ano);
		this.numAssentos = numAssentos;
		assentosOcupados = new boolean[this.numAssentos]; //LEMBRAR DE DECLARAR O TAMANHO DO VETOR
		
		for (int i = 0; i < numAssentos; i++) {
			this.assentosOcupados[i] = false;
		}
		
	}


	public int getNumAssentos() {
		return numAssentos;
	}
	public void setNumAssentos(int numAssentos) {
		this.numAssentos = numAssentos;
	}

	public boolean[] getAssentosOcupados() {
		return assentosOcupados;
	}
	public void setAssentosOcupados(boolean[] assentosOcupados) {
		this.assentosOcupados = assentosOcupados;
	}
	
	
	public boolean verifica(int n) {
		if (assentosOcupados[n]) {
			return true;
		} else {
			return false;
		}
	}
	
	public void ocupa(int assento) {
		if (assentosOcupados[assento] == false) {
			assentosOcupados[assento] = true;
		} else {
			System.out.println("Assento já ocupado.");
		}
	}
	
	public int vagas() {
		int qntVagas = 0;
		for (int i = 0; i < numAssentos ; i++) {
			if (assentosOcupados[i] == false) {
				qntVagas++;
			}
		}
		
		return qntVagas;
	}
	
	public void imprime() {
		System.out.println("Dia do voo: " + fullData());
		System.out.println("Quantidade de assentos vagos: " + vagas());
	}
	
	

}
