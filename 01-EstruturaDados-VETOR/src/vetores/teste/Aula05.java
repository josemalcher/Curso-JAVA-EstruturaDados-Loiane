package vetores.teste;

import vetores.Vetor;

public class Aula05 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);

		vetor.adiciona("Elemento 01");
		vetor.adiciona("Elemento 02");
		vetor.adiciona("Elemento 03");

		System.out.println(vetor.busca(0));
		
		System.out.println(vetor.busca(15));


	}

}
