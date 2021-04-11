package br.com.erickfreire.ladosdeumtriangulo;

import java.util.Scanner;

/**
 * Programa em Java que determina se três valores formam um triângulo
 * @author Erick Freire
 * @version 1 - Criado em 11-04-2021
 */

public class LadosDeUmTriangulo {
	public static void main(String[] args) {
		int lado1;
		int lado2;
		int lado3;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que verifica se três valores formam um triângulo: ");
		
		System.out.print("Digite o primeiro valor: ");
		lado1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		lado2 = entrada.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		lado3 = entrada.nextInt();
		
		if(lado1 + lado2 > lado3) {
			if(lado1 + lado3 > lado2) {
				if(lado2 + lado3 > lado1) {
					System.out.println("É um triângulo");
				}else {
					System.out.println("Não é um triângulo");
				}
			}
		} 
	
		
	
		 }
			
	

}
