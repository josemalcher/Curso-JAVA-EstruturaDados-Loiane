package vetores;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho = 0;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
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
	 * "Vetor Cheio, não é possivel adicionar mais!"); } }
	 */

	public boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
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

	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];

	}

	public int busca(String elemento) {
		// Busca sequencial:
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1; //posição que não existe no vetor
	}

}
