package Logica3;
//Desenvolvido por Ulisses Messias

public class ConverteRomano {

	void calcularRomanos(int num){


		int alg1 = num/1000;
		int alg2 = (num%1000)/500 ;
		int alg3 = (num%1000)/100;
		int alg4 = (num%100)/50;
		int alg5 = (num%100)/10;
		int alg6 = (num%10)/5;
		int alg7 = (num%10);

		if((num >=1)&&(num <=3999)){


			for(int i=0; i<alg1;i++){
				if(alg1<=3){
					System.out.print("M");
				}
			}
			
			for(int i=0; i<alg2;i++){
				System.out.print("D");
			}
			
			for(int i=0; i<alg3; i++){	
				if((alg3>=1) && (alg3<4)){
					System.out.print("C");

				}

			}
			
			for(int i=6; i<=alg3; i++){
				if((alg3>=6) && (alg3<9)){
					System.out.print("C");

				}
			}
			
			if(alg3 == 4){
				System.out.print("CD");
				}

			if(alg3 == 9){
				System.out.print("CM");
			}

			for(int i=0; i<alg4;i++){
				System.out.print("L");
			}
			
			for(int i=0; i<alg5; i++){	
				if((alg5>=1) && (alg5<4)){
					System.out.print("X");

				}

			}
			for(int i=6; i<=alg5; i++){
				if((alg5>=6) && (alg5<9)){
					System.out.print("X");

				}
			}
			if(alg5 == 4){
				System.out.print("IL");}

			if(alg5 == 9){
				System.out.print("XC");
			}

			for(int i=0; i<alg6;i++){
				System.out.print("V");
			}

			for(int i=0; i<alg7; i++){	
				if((alg7>=1) && (alg7<4)){
					System.out.print("I");

				}

			}
			for(int i=6; i<=alg7; i++){
				if((alg7>=6) && (alg7<9)){
					System.out.print("I");

				}
			}
			
			if(alg7 == 4){
				System.out.print("IV");
				}

			if(alg7 == 9){
				System.out.print("IX");
			}

		}else{
			System.out.println("Esse número não pode ser convertido para Romanos");
		}
	}}

