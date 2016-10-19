package vetores;

public class VetorObjetos {

	private Object[] elementos;
	private int tamanho = 0;

	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
	}

	/*
	 * public void adiciona(String elemento){ for(int i = 0 ; i <
	 * this.elementos.length ; i++){ if(this.elementos[i] == null){
	 * this.elementos[i] = elemento; break; } } }
	 */

	/*
	 * public void adiciona(String elemento)throws Exception{ if(this.tamanho <
	 * this.elementos.length){ this.elementos[this.tamanho] = elemento;
	 * this.tamanho++; }else{ throw new Exception(
	 * "Vetor Cheio, n�o � possivel adicionar mais!"); } }
	 */

	public boolean adiciona(Object elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
	}

	// 0 1 2 3 4 5 6 = tamanho � 5
	// B C E F G + +
	public boolean adiciona(int posicao, Object elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
			// return false
		}
		this.aumentaCapacidade();

		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	public int tamanho() {
		return this.tamanho;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();

		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

	public Object busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		return this.elementos[posicao];

	}

	public int busca(Object elemento) {
		// Busca sequencial:
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1; // posi��o que n�o existe no vetor
	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			Object[] elementosNovos = new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	// B D E F F -> posi��o a ser removida � 1 (G)
	// 0 1 2 3 4 -> tamanho � 5
	// vetor[1] = vetor[2]
	// vetor[2] = vetor[3]
	// vetor[3] = vetor[4]
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

}
