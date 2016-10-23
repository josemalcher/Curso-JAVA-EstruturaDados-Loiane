package pilhas.teste;

import java.util.Stack;

import pilhas.Pilha;

public class Aula18 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();

		Stack<Integer> stack = new Stack<Integer>();

		System.out.println(stack.isEmpty());//estaVazio

		stack.push(1);//adicionar elemento - Empilhar
		stack.push(2);
		stack.push(3);

		System.out.println(stack.isEmpty());
		
		System.out.println(stack.size());//tamanho da pilha
		
		System.out.println(stack);//toString

		System.out.println(stack.peek()); //espiar/ver pilha

		System.out.println(stack.pop());//Desempilhar

		System.out.println(stack);

	}

}
