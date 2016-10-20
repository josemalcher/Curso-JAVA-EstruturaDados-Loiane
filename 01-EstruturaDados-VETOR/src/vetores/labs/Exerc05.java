package vetores.labs;

import java.util.ArrayList;

import vetores.Lista;

public class Exerc05 {

	public static void main(String[] args) {

		ArrayList<String> arraylist = new ArrayList<>(5);
		arraylist.add("A");
		arraylist.add("B");
		arraylist.add("C");
		arraylist.add("D");
		arraylist.add("E");

		System.out.println(arraylist);
		arraylist.clear(); //limpa o array
		System.out.println(arraylist);

		System.out.println("*** Classe Lista ***");
		Lista<String> lista = new Lista<>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		System.out.println(lista);
		lista.limpar();
		System.out.println(lista);

	}

}
