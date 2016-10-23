package fila;

import base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{

	public Fila() {
		super();
	}

	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileira(T elemento){
		/*this.elementos[this.tamanho] = elemento;
		this.tamanho++;*/
		
		//this.elementos[this.tamanho++] = elemento;
		
		this.adiciona(elemento); //reutilizando código do pai
	}

	//Aula 21 
	public T espiar(){
		
		if(this.estaVazia()){
			return null;
		}
		
		return this.elementos[0];
	}
	
	//Aula 22
	public T desenfileirar(){
		
		final int POS = 0;
		
		if(this.estaVazia()){
			return null;
		}
		
		T elementoASerRemovido = this.elementos[POS];
		
		/*for (int i = POS; i < tamanho - 1; i++) {
			elementos[i] = elementos[i+1];
		}
		tamanho--;*/
		this.remove(POS); //reaproveitando codigo
		
		return elementoASerRemovido;
		
	}
	
	
	

	
	
	
}
