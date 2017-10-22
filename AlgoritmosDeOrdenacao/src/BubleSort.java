public class BubleSort {
	public BubleSort(int [] vetor) {
		/*
		 * Buble sort: 
		 * Percorre o vetor, comparando os elementos até que o maor deles esteja na
		 * última posição.
		 */
		for (int i = vetor.length -1; i>0; i--) { // Percorre o vetor de trás pra frente
			for (int j = 0; j < i; j++) {//Compara os elementos, considerando i o final do vertor
				if (vetor[j] > vetor[j+1])  {
					int temp = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = temp;
				}
			}				
		}
	}
}
