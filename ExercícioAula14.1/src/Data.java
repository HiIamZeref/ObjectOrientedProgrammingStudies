
public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	public int getDia() {
		return this.dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	public String fullData() {
		return (dia + "/" + mes + "/" + ano);
	}
	
	
	public boolean compareData(Data c) {
		return this.dia == c.dia && this.mes == c.mes && this.ano == c.ano;
	}
	
	
	public boolean vemAntes(Data c) {
		if (this.ano <= c.ano) {
			if (this.mes <= c.mes) {
				if (this.dia <= c.dia) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
