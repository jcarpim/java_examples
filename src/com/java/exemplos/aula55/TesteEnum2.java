package com.java.exemplos.aula55;

import com.java.exemplos.aula53.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {
		
		System.out.println(Enum.valueOf(DiaSemana.class, "SEXTA"));

		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
		System.out.println(dia);
	}

}
