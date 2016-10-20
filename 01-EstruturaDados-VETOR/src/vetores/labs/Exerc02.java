package vetores.labs;

import java.util.ArrayList;

import vetores.Lista;

public class Exerc02 {
	public static void main(String[] args) {
		
		ArrayList<String> arraylist = new ArrayList<>(5);
		
		arraylist.add("A");
		arraylist.add("B");
		arraylist.add("A");
		
		System.out.println(arraylist.lastIndexOf("A"));
		
		Lista<String> lista = new Lista<>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");
		System.out.println(lista.ultimoIndice("A"));
		
	}
}
