package br.com.ftathiago.algordenacao;

public class HeapSort {
	/*
	 * Todo o lance do Heap está no padrão matemático estabelecido por ele. O
	 * pai de qqr nó (ou posição do vetor) sempre será: (posição -1) / 2 Se você
	 * tem o pai, você tem como descobrir os dois filhos. Da direita: 2 *
	 * posição + 2; Da esquerda: 2 * posição + 1; Apenas preste atenção para que
	 * a condição de existência dos filhos seja considerada. Ou seja: esquerda e
	 * direita NÃO PODEM SER MAIOR do que o tamanho do array que está sendo
	 * considerado.
	 */
	public HeapSort(int vetor[], int tam) {
		/*
		 * Varre o array do fim para o início.
		 */
		for (int i = tam - 1; i >= 0; i--) {
			/*
			 * Organiza o array, criando a pilha. Note que, a cada iteração, i é
			 * diminuído. Desta forma, estou falando para a pilha que o meu
			 * array está diminuindo, ou ainda que eu desejo que ela considere
			 * um intervalo menor. Isto porque, a cada iteração, estou colocando
			 * o maior número no final do array. Assim, não preciso calcular
			 * tudo de novo. E veja: este é o motivo pelo qual é preciso avaliar
			 * a condição de existência do nó.
			 */
			heap(vetor, i);
			int tmp = vetor[0];
			vetor[0] = vetor[i];
			vetor[i] = tmp;

		}
	}

	private void heap(int[] vetor, int tam) {
		// Aqui encontro o nó pai
		for (int i = (tam - 1) / 2); i >= 0; i--) {
			organizaNo(vetor, i, tam);
			tam--;
		}
	}

	private void organizaNo(int[] vetor, int i, int tam) {
		// Aqui eu encontro os filhos, de acordo com o nó pai.
		int posMaior = i;
		int esq = 2 * i + 1;
		int dir = 2 * i + 2;
		/*
		 * Verifica a condição de existência de esq e direita É importante que a
		 * condição de existência seja uma operação matemática e não v[dir] !=
		 * null. v[dir] não será null quando dir >=0 e dir < metade do array.
		 * Por isso é importante fazer as contas abaixo nos if's
		 */

		if (esq <= tam) {
			// Além da condição de existência, já vejo qual o nó filho que é
			// maior
			if ((dir <= tam) && (vetor[esq] < vetor[dir])) {
				posMaior = dir;
			} else {
				posMaior = esq;
			}
		}
		if ((posMaior != i) && (vetor[posMaior] > vetor[i])) {
			int tmp = vetor[i];
			vetor[i] = vetor[posMaior];
			vetor[posMaior] = tmp;
		}
	}
}
