package com.br.gabriel.numericsystemconverter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Conversores conversores = new Conversores();
		int opcao = 0;

		do {
			System.out.println("\n--- Menu ---");
			System.out.println("1. Decimal -> Binário");
			System.out.println("2. Decimal -> Octal");
			System.out.println("3. Decimal -> Hexadecimal");
			System.out.println("4. Sair");
			System.out.print("Escolha uma opção: ");

			try {
				opcao = scanner.nextInt();
				if (opcao >= 1 && opcao <= 3) {
					System.out.print("Digite um número decimal: ");
					int numero = scanner.nextInt();

					switch (opcao) {
					case 1:
						System.out.println("Binário: " + conversores.decimalToBinario(numero));
						break;
					case 2:
						System.out.println("Octal: " + conversores.decimalToOctal(numero));
						break;
					case 3:
						System.out.println("Hexadecimal: " + conversores.decimalToHexadecimal(numero));
						break;
					}
				} else if (opcao != 4) {
					System.out.println("\nOpção inválida! Tente novamente.");
				}
			} catch (InputMismatchException e) {
				System.out.println("\nEntrada inválida! Tente novamente.");
				scanner.nextLine();
			}
		} while (opcao != 4);

		System.out.println("\nPrograma encerrado.");
		scanner.close();
	}

}
