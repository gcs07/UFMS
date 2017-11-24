
public class Fila {
	private No primeiro = null;
	private No ultimo = null;
	private int size = 0;
	//Utilizada para inverter a ordem de inclusão/retirada
	boolean inverter = false;

	public Fila() {

	}

	public Fila(boolean inverter) {
		this.inverter = inverter;
	}

	public void inserir(No item) {
		if (inverter) {
			if (ultimo == null) {
				ultimo = item;
				primeiro = item;
			} else {
				item.proximo= primeiro;
				primeiro = item;
			}
		} else {
			if (primeiro == null) {
				primeiro = item;
				ultimo = item;
			} else {
				ultimo.proximo = item;
				ultimo = item;
			}
		}
		size++;

	}

	public No remover() {
		No retornar = null;
		if (inverter) {
			No percorre = primeiro;
			No anterior = null;
			while (percorre != null) {
				if (percorre.proximo == null) {
					retornar = percorre;
				} else {
					anterior = percorre;
				}
				percorre = percorre.proximo;
			}
			if (anterior != null)
				anterior.proximo = null;
			else
				primeiro = null;
			ultimo = anterior;
		} else {
			retornar = primeiro;

			if (primeiro == null)
				ultimo = null;
			else
				primeiro = primeiro.proximo;
		}
		size--;
		return retornar;
	}

	public int getSize() {
		return this.size;
	}

	public boolean isEmpty() {
		return primeiro == null;
	}

	public String toString() {
		String retornar = "";
		if (primeiro != null) {

			No percorre = primeiro;
			while (percorre != null) {
				retornar += percorre.chave + " ";

				percorre = percorre.proximo;
			}
		}
		return retornar;
	}
}
