package pilhas.teste;

import pilhas.Pilha;

public class Aula16 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();

		System.out.println(pilha.estaVazia()); //true
		
		for (int i = 0; i < 10; i++) {
			pilha.empilha(i);
		}
		System.out.println(pilha.estaVazia()); //fase
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		
		System.out.println("Elemento no Topo");
		System.out.println(pilha.topo());
		
		

	}

}
