package br.com.ftathiago.algordenacao.teste;

import br.com.ftathiago.algordenacao.HeapSort;

public class MainSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = { 10, 9, 8, 3, 1, 5, 6, 2, 7, 4, 11 };
		// new QuickSort(vetor, 0, vetor.length - 1);

		new HeapSort(vetor, vetor.length);

		// heapSort(vetor, 9);
		//
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}
		System.out.println();

	}

}
