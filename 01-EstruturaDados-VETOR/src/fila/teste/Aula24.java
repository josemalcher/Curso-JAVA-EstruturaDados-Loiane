package fila.teste;

import fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {
		
		
		FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
		System.out.println(fila);

		fila.enfileira(1);
		
		System.out.println(fila);

	}

}
