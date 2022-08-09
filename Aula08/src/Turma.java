
public class Turma {
	private String[] nomes;
	private int[] idades;
	private double[] medias;
	
	
	public Turma (String[] nomes, int[] idades, double[] medias) {
		this.nomes = nomes;
		this.idades = idades;
		this.medias = medias;
	}
	
	
	public String[] getNomes() {
		return this.nomes;
	}
	public void setNomes(String [] nomes) {
		this.nomes = nomes;
	}
	
	public int[] getIdades() {
		return this.idades;
	}
	public void setIdades(int [] idades) {
		this.idades = idades;
	}
	
	public double[] getMedias() {
		return this.medias;
	}
	public void setMedias(double [] medias) {
		this.medias = medias;
	}
	
	
	public int idadeMaisVelho() {
		int maisVelho = idades[0];
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] > maisVelho) {
				maisVelho = idades[i];
			}
			
		}
		return maisVelho;
		
	}
	
	public String idadesMaisNovo() {
		int maisNovo = idades[0];
		String nomeMaisNovo = nomes[0];
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] < maisNovo) {
				nomeMaisNovo = nomes[i];
			}
			
		}
		return nomeMaisNovo;
				
	}
	
	public int aprovados() {
		int nAprovados = 0;
		
		for (int i = 0; i < medias.length; i++) {
			if (medias[i] >= 7) {
				nAprovados++;
			}
		}
		return nAprovados;
	}
	

}
