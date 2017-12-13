package Logica1;
//Desenvolvido por Ulisses Messias
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		FormulaMisteriosa f = new FormulaMisteriosa();
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Entre com um valor");
		String valor = entrada.nextLine();
		f.calculoMisterioso(valor);
		
	}}
		
		
	

