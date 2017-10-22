
public class QuickSort {
	
	private int particao(int[] vetor, int esq, int dir) {
		int i = esq, j = dir;
		int tmp;
		int pivo = vetor[(esq+dir)/2];
		while(i <= j) {
			while (vetor[i] < pivo)//Encontra o primeiro maior que o pivo
				i++;
			while(vetor[j] > pivo)//encontra o primeiro menor que o pivo
				j--;
			if (i<=j) {
				tmp=vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = tmp;
				i++;
				j--;
			}
		}
		return i; // retorna a posição atual do pivo
	}
	
	public QuickSort(int [] vetor, int esq, int dir){
		int indice = particao(vetor, esq, dir);
		if (esq < indice-1)
			new QuickSort(vetor, esq, indice -1);
		if (indice <dir)
			new QuickSort(vetor, indice, dir);
	}

}
