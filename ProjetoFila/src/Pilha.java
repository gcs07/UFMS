public class Pilha {
	No inicio;
	No ultimo;

	public Pilha() {
		inicio = null;		
	}

	boolean isEmpty() {
		if (inicio == null)
			return true;
		else
			return false;
	}

	void insere(int n) {
		No novo = new No(n);
		novo.proximo = inicio;
		inicio = novo;
	}

	public No remove() {
		No removido = inicio;
		inicio = inicio.proximo;
		return removido;
	}

	void imprime() {
		if (inicio == null) {
			System.out.println("Sua pilha está vazia!");
		} else {
			No percorre = inicio;

			do {
				System.out.println("Chave: " + percorre.chave);
				percorre = percorre.proximo;
			} while (percorre != null);
		}
	}

}