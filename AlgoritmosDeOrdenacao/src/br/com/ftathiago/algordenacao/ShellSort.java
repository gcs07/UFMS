package br.com.ftathiago.algordenacao;

public class ShellSort {
	/*
	 * Exotérico demais pra mim
	 */
	public ShellSort(int[] vetor, int tam) {
		int h = 1;
		int aux, j;
		while (h < tam) {
			h = h * 3 + 1;
		}
		h = h / 3;
		while (h > 0) {
			for (int i = h; i < tam; i++) {
				aux = vetor[i];
				j = i;
				while (j >= h && vetor[j - h] > aux) {
					vetor[j] = vetor[j - h];
					j = j - h;

				}
				vetor[j] = aux;
			}
			h = h / 2;
		}
	}

}
