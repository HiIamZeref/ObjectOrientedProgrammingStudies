
public class Ponto2D {
	private int x;
	private int y;
	
	public Ponto2D (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public boolean compare(Ponto2D b) {
		return this.x == b.x && this.y == b.y;
	}
	
	public double distancia(Ponto2D b) {
		double distanciaX = this.x - b.x;
		double distanciaY = this.y - b.y;
		double distanciaTotal = Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
		return distanciaTotal;
	}
	

}
