package br.com.ftathiago.algordenacao.teste;
import org.junit.Test;

import br.com.ftathiago.algordenacao.*;

public class SortTest {

	@Test
	public void testBubleSort() {
		int [] vetor = {5, 20,13,21,3,4};
		System.out.println("BubleSort");
		new BubleSort(vetor);
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}
		System.out.println("");
		
	}
	@Test
	public void testSelectionSort() {
		int [] vetor = {5, 20,13,21,3,4};
		System.out.println("SelectionSort");
		new SelectionSort(vetor);
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}
		System.out.println("");
		
	}
	
	@Test
	public void testQuickSort() {
		int [] vetor = {5, 20,13,21,3,4};
		System.out.println("QuickSort");
		new SelectionSort(vetor);
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}
		System.out.println("");
		
	}
	@Test
	public void testInsertionSort() {
		int [] vetor = {5, 20,13,21,3,4};
		System.out.println("InsertionSort");		
		new InsertionSort(vetor, vetor.length);
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}
		System.out.println("");
		
	}		
}
