
public class SelectionSort {
	/*
	 * SelectionSort
	 * Varre o inteiro em busca do menor elemento, guardando a posição dele em uma variável
	 * Quando termina a varredura, troca a posição do menor com o início do vetor.
	 * 
	 */
	public SelectionSort(int[] vetor) {
		for (int i = 0; i < vetor.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[min]) {
					min = j;
				}
			}
			int aux = vetor[min];
			vetor[min] = vetor[i];
			vetor[i] = aux;
		}
	}
}
