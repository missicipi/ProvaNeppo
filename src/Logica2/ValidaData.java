package Logica2;
//Desenvolvido por Ulisses Messias

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ValidaData {
	
	void calculaData(int dia, int mes, int ano){
		
		boolean valid;
		if((ano % 100 == 0)&&(ano % 400 != 0 )||(ano % 4==0)){
			//System.out.println("Esse ano é bissexto :");
			if((mes == 2)&&(dia == 29)){
			valid = true;
			System.out.println(valid);}
			if((mes == 1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
				if((dia >= 1)&&(dia <=31)){
					valid = true;
					System.out.println(valid);
				}else{
					valid = false;
					System.out.println(valid);
				}
				
			}if(mes == 2){
				if((dia >=1)&&(dia <=29)){
					 valid = true;
					System.out.println(valid);
				}else{
					valid = false;
					System.out.println(valid);
				}
			}
			if((mes == 4)||(mes==6)||(mes==9)||(mes==11)){
				if((dia>=1)&&(dia<=30)){
					valid = true;
					System.out.println(valid);
				}else{
					valid = false;
					System.out.println(valid);
				}
			}
		}else{
			//System.out.println("Esse ano não é bissexto");
			if((mes == 1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
				if((dia >= 1)&&(dia <=31)){
					valid = true;
					System.out.println(valid);
				}else{
					valid = false;
					System.out.println(valid);
				}
				
			}if(mes == 2){
				if((dia >=1)&&(dia <=28)){
					 valid = true;
					System.out.println(valid);
				}else{
					valid = false;
					System.out.println(valid);
				}
			}
			if((mes == 4)||(mes==6)||(mes==9)||(mes==11)){
				if((dia>=1)&&(dia<=30)){
					valid = true;
					System.out.println(valid);
				}else{
					valid = false;
					System.out.println(valid);
				}
			}
		}
		
		
	}

}
