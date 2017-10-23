package br.com.ftathiago.algordenacao;

public class BucketSort {
	public BucketSort(int[] vetor, int tam, int maxVal) {
		/*
		 * Ele precisa saber o maior valor do vetor (maxVal). De posse dessa
		 * informação, ele cria um vetor variando de 0 até maxVal e inicializa
		 * com zeros Depois ele identifica quais o valores existentes no vetor
		 * original, e incrementa, no balde, a determinada posição. Quando ele
		 * vai "ordenar" o vetor, ele na verdade o recria, usando as informações
		 * do bucket como mapa.
		 */
		// Cria o bucket com um item a mais que o maxVal
		int[] bucket = new int[maxVal + 1];

		// Inicializa com zero
		for (int i = 0; i < maxVal + 1; i++) {
			bucket[i] = 0;
		}
		/*
		 * A ideia do bucket é: Guarda na posição i quantas vezes o número x
		 * está no vetor. A posição em si já é ordenada {0, 1, 2, 3, n}. Se eu
		 * sei o valor máximo do vetor e também sei quantas vezes determinado
		 * número aparece, então eu já tenho a receita para poder reconstuir o
		 * vetor. Se no vetor original aparecer o número 5 duas vezes, teremos:
		 * bucket[5] = 2 Se no vetor original aparecer o número 7 uma vez,
		 * teremos: bucket[7] = 1 Para os números que não estão no vetor
		 * original e estão entre 0 e maxVal, temos: bucket[0 -> maxVal] = 0;
		 * 
		 */

		for (int i = 0; i < tam; i++) {
			bucket[vetor[i]]++;
		}

		/*
		 * "pos" controla a posição atual do vetor original. "i" controla a
		 * posição do bucket e "j" controla o número de ocorrências de um
		 * determinado número, repetindo-o no vetor original
		 */
		int pos = 0;
		for (int i = 0; i < maxVal + 1; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				vetor[pos++] = i;
			}
		}
	}

}
