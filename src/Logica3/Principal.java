package Logica3;
//Desenvolvido por Ulisses Messias

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		ConverteRomano rom = new ConverteRomano();
		ConverteInteiro num = new ConverteInteiro();
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Entre com o valor para ser convertido em Romanos ");
		int alg = entrada.nextInt();
		rom.calcularRomanos(alg);
	/*
		System.out.println("Digite o Algarismo Romano para converter em Inteiros ");
		 String a = entrada.nextLine();
		 num.calculaInteiro(a);
*/	}

}
