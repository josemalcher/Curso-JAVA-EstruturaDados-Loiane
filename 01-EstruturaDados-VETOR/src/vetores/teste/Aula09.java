package vetores.teste;

import vetores.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");

		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		System.out.println("Removendo Elmento E ");
		int posic = vetor.busca("E");
		if(posic > -1){
			vetor.remove(posic);
		}else{
			System.out.println("Elemento não existe no vetor");
		}
		System.out.println(vetor);
	}

}
