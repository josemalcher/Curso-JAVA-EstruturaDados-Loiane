package vetores.teste;

import vetores.Lista;
import vetores.VetorObjetos;

public class Aula11 {

	public static void main(String[] args) {
		
		
/*		VetorObjetos vetor = new VetorObjetos(2);
		
		vetor.adiciona(1);
		vetor.adiciona("Elemento String");
		
		System.out.println(vetor);*/
		
		Lista<String> vetor = new Lista<String>(1);
		
		vetor.adiciona("teste");
		
		System.out.println(vetor);
		
		Lista<Contato> listaContato = new Lista<>(3);
		Contato c1 = new Contato("Contato 01", "1234-4321","contato_1@gmail.com");
		Contato c2 = new Contato("Contato 02", "1554-4321","contato_2@gmail.com");
		Contato c3 = new Contato("Contato 03", "1664-4321","contato_3@gmail.com");
		
		listaContato.adiciona(c1);
		listaContato.adiciona(c2);
		listaContato.adiciona(c3);
		
		System.out.println(listaContato);
		

	}

}
