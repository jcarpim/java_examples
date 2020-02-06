package com.java.exemplos.aula54;

public class Formulario {
	
	enum Genero{
		FEMININO('F'), MASCULINO('M');
		
		private char valor;
		
		
		Genero(char valor){
			this.valor = valor;
		}
	}
	
	private String none;
	private Genero genero;

}
