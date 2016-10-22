package pilhas.teste;

import pilhas.Pilha;

public class Aula15 {

	public static void main(String[] args) {
		
		
		Pilha<Integer> pilha = new Pilha<Integer>();

		System.out.println(pilha.estaVazia()); //true
		
		for (int i = 0; i < 10; i++) {
			pilha.empilha(i);
		}
		System.out.println(pilha.estaVazia()); //fase
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
	}

}
