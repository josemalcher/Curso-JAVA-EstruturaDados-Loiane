package vetores.teste;

import vetores.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
/*		vetor.adiciona(2);
		vetor.adiciona(5);
		vetor.adiciona(6);*/
		
		Contato c1 = new Contato("Contato 01", "1234-4321","contato_1@gmail.com");
		Contato c2 = new Contato("Contato 02", "1554-4321","contato_2@gmail.com");
		Contato c3 = new Contato("Contato 03", "1664-4321","contato_3@gmail.com");
		
		Contato c4 = new Contato("Contato 01", "1234-4321","contato_1@gmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int posicao = vetor.busca(c4);
		if(posicao > -1){
			System.out.println("Elemento Existe no vetor");
		}else{
			System.out.println("Elemento NÃO existe");
		}
		/*
		 * Elemento Existe no vetor
		 */
		
		System.out.println(vetor);

	}

}
