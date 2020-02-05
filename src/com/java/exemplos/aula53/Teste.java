package com.java.exemplos.aula53;

public class Teste {
	
	public static void main(String[] args) {
		
		usandoConstantes();
		
		System.out.println("--------------------------");
		
		usandoEnum();
	}
	
	//m�todo utilizando constantes
	private static void usandoConstantes() {
		
		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;
		
		System.out.println("Teste utilizando constantes no Java:");
		imprimeDiaSemanaCase(segunda);
		imprimeDiaSemanaCase(terca);
		imprimeDiaSemanaCase(quarta);
		imprimeDiaSemanaCase(quinta);
		imprimeDiaSemanaCase(sexta);
		imprimeDiaSemanaCase(sabado);
		imprimeDiaSemanaCase(domingo);
	}
	
	//m�todo para impress�o com case
	public static void imprimeDiaSemanaCase(int dia) {
		switch (dia) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Ter�a-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("S�bado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		}
	}
	
	//m�todo utlizando Enum
	private static void usandoEnum() {
		
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println("Teste utilizando enum no Java:");
		
		imprimeDiaSemanaEnum(segunda);
		imprimeDiaSemanaEnum(terca);
		imprimeDiaSemanaEnum(quarta);
		imprimeDiaSemanaEnum(quinta);
		imprimeDiaSemanaEnum(sexta);
		imprimeDiaSemanaEnum(sabado);
		imprimeDiaSemanaEnum(domingo);
	}
	
	//m�todo para impress�o com case
		public static void imprimeDiaSemanaEnum(DiaSemana dia) {
			switch (dia) {
			case SEGUNDA:
				System.out.println("Segunda-feira");
				break;
			case TERCA:
				System.out.println("Ter�a-feira");
				break;
			case QUARTA:
				System.out.println("Quarta-feira");
				break;
			case QUINTA:
				System.out.println("Quinta-feira");
				break;
			case SEXTA:
				System.out.println("Sexta-feira");
				break;
			case SABADO:
				System.out.println("S�bado");
				break;
			case DOMINGO:
				System.out.println("Domingo");
				break;
			}
		}

}
