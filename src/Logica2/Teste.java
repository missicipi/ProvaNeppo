package Logica2;
//Desenvolvido por Ulisses Messias
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ValidaData data = new ValidaData();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos validar a data ");
		System.out.println("Entre com o dia");
		int dia = entrada.nextInt();
		
		System.out.println("Entre com o mês");
		int mes = entrada.nextInt();
		
		System.out.println("Agora entre com o ano");
		int ano = entrada.nextInt();
		
		data.calculaData(dia, mes, ano);

	}

}
