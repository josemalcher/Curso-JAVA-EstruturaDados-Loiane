package fila.teste;

import fila.Fila;

public class Aula22 {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<>();

		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);

		System.out.println(fila.estaVazia()); // false
		System.out.println(fila.tamanho()); // 3

		System.out.println(fila.toString());

		System.out.println(fila.espiar());

		System.out.println(fila.desenfileira());

		System.out.println(fila.toString());
		System.out.println(fila.desenfileira());

		System.out.println(fila.toString());

	}

}
