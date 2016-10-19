package vetores.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		//

		ArrayList<String> arrayList = new ArrayList<String>();
		
		//Adicionar
		arrayList.add("A");
		arrayList.add("C");

		System.out.println(arrayList);

		//Adicionar na posição
		arrayList.add(1, "B");

		System.out.println(arrayList);
		
		//Verificando se existe
		boolean existe = arrayList.contains("A");
		if (existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento não existe no array");
		}

		//Verificando se existe e qual posição
		int pos = arrayList.indexOf("B");
		if (pos > -1) {
			System.out.println("Elemento existe no array na pos " + pos);
		} else {
			System.out.println("Elemento não existe no array " + pos);
		}

		//busca por posição
		System.out.println(arrayList.get(2));

		//Remover Elementos - Indices ou objetos
		arrayList.remove(0);
		arrayList.remove("B");

		System.out.println(arrayList);

		//tamanho da Lista
		System.out.println(arrayList.size());

		// http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/6-b14/java/util/ArrayList.java
		
		// http://goo.gl/0FheJF <- Lista de exercícios
		
	}

}
