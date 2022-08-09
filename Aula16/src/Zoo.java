
public class Zoo {
	private Animal[] animais;
	private String nome;
	
	public Zoo(Animal[] animais, String nome) {
		super();
		this.animais = animais;
		this.nome = nome;
	}

	
	public Animal[] getAnimais() {
		return animais;
	}
	public void setAnimais(Animal[] animais) {
		this.animais = animais;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double mediaIdade() {
		double soma = 0;
		for (int i = 0; i < animais.length; i++) {
			soma += animais[i].getIdade();
		}
		return (soma/animais.length);
	}
	
	public double mediaIdadeCavalo() {
		double soma = 0;
		int cnt = 0;
		
		for (int i = 0; i < animais.length; i++) {
			if (animais[i] instanceof Cavalo) {
				soma = soma + animais[i].getIdade();
				cnt++;
			}
		}
		double media = soma/cnt;
		return media;
	}
	
	
	

}
