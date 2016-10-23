package pilhas;

import base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha() {
		super();
	
	}

	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	
	public void empilha(T elemento){
		//this.aumentaCapacidade();
		//this.elementos[tamanho++] = elemento;
		//tamanho ++;
		//reusando o código
		super.adiciona(elemento);
	}
	
	public T topo(){
		
		if(this.estaVazia()){
			return null;
		}
		
		return this.elementos[tamanho-1];
	}
	
	public T desempilha(){
		if(this.estaVazia()){
			return null;
		}
		/*T elemento = this.elementos[tamanho -1];
		tamanho--;
		
		return elemento;*/
		//ou
		return this.elementos[--tamanho];
	}

	
	
}
