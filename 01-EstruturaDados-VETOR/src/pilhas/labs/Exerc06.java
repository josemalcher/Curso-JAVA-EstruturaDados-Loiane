package pilhas.labs;
//https://github.com/loiane/estrutura-dados-algoritmos-java/blob/master/src/com/loiane/estruturadados/pilha/labs/Exer06.java
//https://www.youtube.com/watch?v=48cA5eoPLVE
import pilhas.Pilha;

public class Exerc06 {
	public static void main(String[] args) {

		imprimeResultado("A + B");
		imprimeResultado("A + B + (C - D)");
		imprimeResultado("{[()]}[](){()}");
		imprimeResultado("{[(]}[](){()}");
		imprimeResultado("A + B + C - D)");
	}

	public static void imprimeResultado(String expressao) {
		System.out.println(expressao + " est� balanceado? " + verificaSimbolosBalanceados(expressao));
	}

	final static String ABRE = "([{";
	final static String FECHA = ")]}";

	public static boolean verificaSimbolosBalanceados(String expressao) {

		Pilha<Character> pilha = new Pilha<Character>();
		int index = 0;
		char simbolo, topo;

		while (index < expressao.length()) {
			simbolo = expressao.charAt(index);

			if (ABRE.indexOf(simbolo) > -1) {
				pilha.empilha(simbolo);

			} else if (FECHA.indexOf(simbolo) > -1) {

				if (pilha.estaVazia()) {
					return false;
				} else {
					topo = pilha.desempilha();

					if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;
					}
				}
			}

			index++;
		}

		return true;
	}
}
