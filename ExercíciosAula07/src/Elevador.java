
public class Elevador {
	private int floor = 0;
	private int allFloors;
	private int capacidade;
	private int pessoas = 0;
	
	
	public Elevador(int allFloors, int capacidade) {
		if (allFloors > 0) {
			this.allFloors = allFloors;
		} else {
			this.allFloors = 0;
		}
		if (capacidade > 0) {
			this.capacidade = capacidade;
		} else {
			this.capacidade = 0;
		}
	}

	
	public int getFloor() {
		return this.floor;
	}
	public void setFloor(int floor) {
		if (floor > 0) {
			this.floor = floor;
		} else {
			this.floor = 0;
		}
	}
	
	public int getAllFloors() {
		return this.allFloors;
	}
	public void setAllFloors(int allFloors) {
		if (allFloors > 0) {
			this.allFloors = allFloors;
		} else {
			this.allFloors = 0;
		}
	}
	
	public int getCapacidade() {
		return this.capacidade;
	}
	public void setCapacidade(int capacidade) {
		if (capacidade > 0 ) {
			this.capacidade = capacidade;
		} else {
			this.capacidade = 0;
		}
	}
	
	public int getPessoas() {
		return this.pessoas;
	}
	public void setPessoas(int pessoas) {
		if (pessoas > 0) {
			this.pessoas = pessoas;
		} else {
			this.pessoas = 0;
		}
	}
	
	
	public void entra() {
		
		if (this.pessoas < this.capacidade) {
			this.pessoas++;
		} else {
			System.out.println("Capacidade cheia.");
		}
	}
	
	public void sai() {
		
		if (this.pessoas > 0) {
			this.pessoas--;
		} else {
			System.out.println("Não há ningúem no elevador.");
		}
	}
	
	
	public void sobe() {
		
		if (this.floor < this.allFloors) {
			this.floor++;
		} else {
			System.out.println("Ultimo andar atingido.");
		}
	}
	
	public void desce() {
		if (this.floor > 0) {
			this.floor--;
		} else {
			System.out.println("Térreo atingido.");
		}
	}
	
	public void status() {
		System.out.println("Andar atual: " + this.floor + " Capacidade atual: " + this.pessoas);
	}
}
