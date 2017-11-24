import java.util.Scanner;

public class FilaTeste {

	public static void exercicio1() {
		Fila fila1 = new Fila();
		Fila fila2 = new Fila();
		Fila fila3 = new Fila();

		fila1.inserir(new No(1));
		//fila1.inserir(new No(3));
		fila1.inserir(new No(5));
		fila1.inserir(new No(7));
		fila1.inserir(new No(9));

		fila2.inserir(new No(2));
		fila2.inserir(new No(3));
		fila2.inserir(new No(4));
		fila2.inserir(new No(6));
		fila2.inserir(new No(8));
		fila2.inserir(new No(10));

		System.out.println("Exercício 1:\n" + "Faça uma função que receba três filas, duas já preenchidas em ordem\n"
				+ "crescente e a terceira vazia. Preencha a terceira fila com os elementos da\n"
				+ "primeira e segunda, de maneira que a terceira fila também seja construída de\n"
				+ "forma crescente.");

		System.out.println("Fila 1:");
		System.out.println(fila1.toString());
		System.out.println("------------------------------------");

		System.out.println("Fila 2:");
		System.out.println(fila2.toString());
		System.out.println("------------------------------------");

		System.out.println("Fila 3:");
		System.out.println(fila3.toString());
		System.out.println("------------------------------------");

		mesclarFilas(fila1, fila2, fila3);

		System.out.println("Fila 1:");
		System.out.println(fila1.toString());
		System.out.println("------------------------------------");

		System.out.println("Fila 2:");
		System.out.println(fila2.toString());
		System.out.println("------------------------------------");

		System.out.println("Fila 3:");
		System.out.println(fila3.toString());
		System.out.println("------------------------------------");
	}

	public static void mesclarFilas(Fila primeira, Fila segunda, Fila terceira) {
		No f1 = null;
		No f2 = null;
		while (!primeira.isEmpty() || !segunda.isEmpty() || (f1 != null) || (f2 != null)) {

			if ((f1 == null) && (!primeira.isEmpty()))
				f1 = primeira.remover();
			if ((f2 == null) && (!segunda.isEmpty()))
				f2 = segunda.remover();

			if (((f1 != null) && (f2 == null)) || ((f1 != null) && (f2 != null) && (f1.chave < f2.chave))) {
				terceira.inserir(new No(f1.chave));
				f1 = null;
			} else if (((f1 == null) && (f2 != null)) || ((f1 != null) && (f2 != null) && (f1.chave > f2.chave))) {
				terceira.inserir(new No(f2.chave));
				f2 = null;
			}
		}
	}

	public static void exercicio2() {
		Scanner teclado = new Scanner(System.in);
		int controle = 0;
		Fila fila = new Fila();
		Pilha pilha = new Pilha();
		System.out.println("Exercício 2\n"
				+ "Considere uma pilha vazia e uma fila preenchida com n elementos (lida do\n"
				+ "usuário). Utilizando apenas os métodos tradicionais de enfileirar,\n"
				+ "desenfileirar (fila), empilhar e desempilhar (pilha), inverta a ordem dos\n" + "elementos da fila");
		do {
			System.out.println("Digite a chave:");
			controle = teclado.nextInt();
			if (controle != 0)
				fila.inserir(new No(controle));
		} while (controle != 0);
		System.out.println("Fila original " + fila.toString());
		inverteFila(fila, pilha);
		System.out.println("Fila invertida " + fila.toString());
	}

	public static void inverteFila(Fila fila, Pilha pilha) {
		while (!fila.isEmpty()) {
			No tmp = fila.remover();
			pilha.insere(tmp.chave);
		}
		while (!pilha.isEmpty()) {
			No tmp = pilha.remove();
			fila.inserir(new No(tmp.chave));
		}
	}

	public static void exercicio3() {
		System.out.println("Exercício 3 \n" + "Modifique a função inserir/remover na Fila para que agora asoperações\n"
				+ "sejam realizadas ao inverso, ou seja, inserir no início da Fila e remover no \n" + "seu final.\n\n"
				+ "Veja comentários no código");
		Fila fila1 = new Fila(true);

		fila1.inserir(new No(1));
		fila1.inserir(new No(3));
		fila1.inserir(new No(5));
		fila1.inserir(new No(7));
		fila1.inserir(new No(9));
		System.out.println(fila1.toString());
		No percorre = null;
		do {
			percorre = fila1.remover();
			if (percorre != null)
				System.out.println("Removido :" + percorre.chave);
		} while (percorre != null);
	}

	public static void main(String[] args) {
		exercicio1();
		System.out.println("");
		exercicio2();
		System.out.println("");
		exercicio3();
	}

}
