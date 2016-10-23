package pilhas.labs;

import java.util.Scanner;

import pilhas.Pilha;

public class Exerc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha<Integer> pilha = new Pilha<Integer>();

		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			System.out.println("Entre com um n�mero:");

			int num = scan.nextInt();

			if (num % 2 == 0) {

				System.out.println("Empilhando o n�mero " + num);
				pilha.empilha(num);
			} else {

				Integer desempilhado = pilha.desempilha();

				if (desempilhado == null) {
					System.out.println("Pilha est� vazia");
				} else {
					System.out.println("N�mero �mpar, desempilhando um elemento da pilha: " + desempilhado);
				}
			}
		}

		System.out.println("Todos os n�mero foram lidos, desempilhando n�meros da pilha");

		while (!pilha.estaVazia()) {

			System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
		}

		System.out.println("Todos os elementos foram desempilhados");

	}

}
