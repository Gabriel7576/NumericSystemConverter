package com.br.gabriel.numericsystemconverter;

public class Conversores {
	public final int baseDois = 2;
	public final int baseOito = 8;
	public final int baseDez = 10;
	public final int baseDezesseis = 16;

	public String decimalToBinario(int decimal) {

		int resto = 0;
		StringBuilder binario = new StringBuilder();

		do {
			resto = decimal % baseDois;
			decimal /= baseDois;

			binario.append(resto);
		} while (decimal != 0);

		return binario.reverse().toString();
	}

	public String decimalToOctal(int decimal) {

		int resto = 0;
		StringBuilder octal = new StringBuilder();

		do {
			resto = decimal % baseOito;
			decimal /= baseOito;

			octal.append(resto);
		} while (decimal != 0);

		return octal.reverse().toString();
	}

	public String decimalToHexadecimal(int decimal) {

		int resto = 0;
		StringBuilder hexadecimal = new StringBuilder();

		do {
			resto = decimal % baseDezesseis;
			decimal /= baseDezesseis;

			hexadecimal.append(switch (resto) {
			case 10 -> "A";
			case 11 -> "B";
			case 12 -> "C";
			case 13 -> "D";
			case 14 -> "E";
			case 15 -> "F";
			default -> resto;
			});
		} while (decimal != 0);

		return hexadecimal.reverse().toString();
	}

}
