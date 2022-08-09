import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nSup10 = 0;
		int anoAtual = 2022;
		int qntCasa = 0;
		int qntApt = 0;
		double somaNobre = 0;
		int qntNobre = 0;
		int nIPTU = 0;
		double precoMenorVenda = 0;
		double tamanhoMenorVenda = 0;
		
		
		System.out.println("Digite o tamanho do vetor: ");
		int n = s.nextInt();
		
		Imovel [] imoveis = new Imovel[n];
		for (int i = 0; i < n; i++) {
			imoveis[i].setAno(s.nextInt());
			imoveis[i].setProp(s.next());
			imoveis[i].setTamanho(s.nextDouble());
			imoveis[i].setNobre(s.nextBoolean());
			imoveis[i].setAno(s.nextInt());
			imoveis[i].setCompra(s.nextDouble());
		}
		
		precoMenorVenda = imoveis[0].precoVenda();
		
		for (int i = 0; i < n; i++) {
			System.out.println("IPTU " + (i+1) + ": " + imoveis[i].calculaIPTU());
			System.out.println("Valor de compra " + (i+1) + ": " + imoveis[i].precoVenda());
			
			if (imoveis[i].idade(anoAtual) > 10) {
				nSup10++;
			}
			
			
			if (imoveis[i].getTipo() == 1) {
				qntCasa++;
			} else if (imoveis[i].getTipo() == 2){
				qntApt++;
			}
			
			
			if (imoveis[i].getNobre() && imoveis[i].getTipo() == 2) {
				somaNobre += imoveis[i].getTamanho();
				qntNobre++;
			}
			
			
			if (imoveis[i].getTipo() == 1 && imoveis[i].getNobre() == false) {
				nIPTU++;
			}
			
			
			if (imoveis[i].precoVenda() < precoMenorVenda) {
				tamanhoMenorVenda = imoveis[i].getTamanho();
			}
		}
		
		
		String [] nomeSup10 = new String[nSup10];
		int indexSup10 = 0;
		
		for (int i = 0; i < n; i++) {
			if (imoveis[i].idade(anoAtual) > 10) {
				nomeSup10[indexSup10] = imoveis[i].getProp();
				indexSup10++;
			}
		}
		
		
		double [] listIPTU = new double [nIPTU];
		int indexIPTU = 0;
		
		for (int i = 0; i < nIPTU; i++) {
			if (imoveis[i].getTipo() == 1 && imoveis[i].getNobre() == false) {
				listIPTU[indexIPTU] = imoveis[i].calculaIPTU();
				indexIPTU++;
			}
		}
		
		double menorIPTU = listIPTU[0];
		for  (int i = 0; i < listIPTU.length; i++) {
			if (listIPTU[i] < menorIPTU) {
				menorIPTU = listIPTU[i];
			}
		}
		
		
		System.out.println("Nome dos proprietários de imóveis com mais de 10 anos: ");
		for (int i = 0; i < nomeSup10.length; i++) {
			System.out.println(nomeSup10[i]);
		}
		System.out.println("Quantidade de casas registradas: " + qntCasa);
		System.out.println("Quantidade de apartamentos registrados: " + qntApt);
		System.out.println("Média do tamanho de apartamentos em aréa nobre: " + (somaNobre/qntNobre));
		System.out.println("Menor IPTU de uma casa em uma área não nobre: " + menorIPTU);
		System.out.println("Tamanho do imóvel com menor preço de venda " + tamanhoMenorVenda);
		
	}

}
