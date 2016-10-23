package fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

	public static void main(String[] args) {
		
		//Queue<Integer> fila = new Queue<>();
		/* explicação - lembrete
		Interface1 c = new Classe1();
		c.adiciona();
		c.remove();
		c.teste(); //não existe na interface
		*/
		
		//Classe que implementa a classe fila (linkedList)
		Queue<Integer> fila = new LinkedList<>();//Lista encadeada
		fila.add(1);
		fila.add(2);
		fila.add(3);
		fila.add(4);
		
		System.out.println(fila);
		System.out.println(fila.peek());
		System.out.println(fila.remove());
		System.out.println(fila);
		System.out.println(fila.peek());
	}

}
