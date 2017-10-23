package br.com.ftathiago.algordenacao.teste;

import org.junit.Test;

import br.com.ftathiago.algordenacao.BubleSort;
import br.com.ftathiago.algordenacao.BucketSort;
import br.com.ftathiago.algordenacao.InsertionSort;
import br.com.ftathiago.algordenacao.MergeSort;
import br.com.ftathiago.algordenacao.SelectionSort;
import br.com.ftathiago.algordenacao.ShellSort;

public class SortTest {

	@Test
	public void testBubleSort() {
		int[] vetor = { 5, 20, 13, 21, 3, 4 };
		System.out.println("BubleSort");
		new BubleSort(vetor);
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}
		System.out.println("");

	}

	@Test
	public void testSelectionSort() {
		int[] vetor = { 5, 20, 13, 21, 3, 4 };
		System.out.println("SelectionSort");
		new SelectionSort(vetor);
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}
		System.out.println("");

	}

	@Test
	public void testQuickSort() {
		int[] vetor = { 5, 20, 13, 21, 3, 4 };
		System.out.println("QuickSort");
		new SelectionSort(vetor);
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}
		System.out.println("");

	}

	@Test
	public void testInsertionSort() {
		int[] vetor = { 5, 20, 13, 21, 3, 4 };
		System.out.println("InsertionSort");
		new InsertionSort(vetor, vetor.length);
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}
		System.out.println("");
	}

	@Test
	public void testMergeSort() {
		int[] vetor = { 5, 20, 13, 21, 3, 4 };
		// int[] vetor = { 67, 23, 9, 54 };
		System.out.println("MergeSort");
		new MergeSort(vetor, 0, vetor.length - 1);
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}
		System.out.println("");
	}

	@Test
	public void testShellSort() {
		int[] vetor = { 5, 20, 13, 21, 3, 4 };
		// int[] vetor = { 67, 23, 9, 54 };
		System.out.println("ShellSort");
		new ShellSort(vetor, vetor.length);
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}
		System.out.println("");
	}

	@Test
	public void testBucketSort() {
		int[] vetor = { 5, 20, 5, 13, 21, 3, 4 };
		// int[] vetor = { 67, 23, 9, 54 };
		System.out.println("BucketSort");
		new BucketSort(vetor, vetor.length, 67);
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}
		System.out.println("");
	}
}
