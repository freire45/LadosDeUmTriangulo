package br.com.erickfreire.ladosdeumtriangulo;

import java.util.Scanner;

/**
 * Programa em Java que determina se tr�s valores formam um tri�ngulo
 * @author Erick Freire
 * @version 1 - Criado em 11-04-2021
 */

public class LadosDeUmTriangulo {
	public static void main(String[] args) {
		int lado1;
		int lado2;
		int lado3;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que verifica se tr�s valores formam um tri�ngulo: ");
		
		System.out.print("Digite o primeiro valor: ");
		lado1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		lado2 = entrada.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		lado3 = entrada.nextInt();
		
		if(lado1 + lado2 > lado3) {
			if(lado1 + lado3 > lado2) {
				if(lado2 + lado3 > lado1) {
					System.out.println("� um tri�ngulo");
				}else {
					System.out.println("N�o � um tri�ngulo");
				}
			}
		} 
	
		
	
		 }
			
	

}
