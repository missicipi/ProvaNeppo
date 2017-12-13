package Logica3;
//Desenvolvido por Ulisses Messias

public class ConverteInteiro {

	 void calculaInteiro(String rom){
		rom = rom.toUpperCase();

		int totalM = 1;
		int totalD = 1;
		int resultm = 0;
		int resultd = 0;

		for(int i=0;i < rom.length(); i++){


			if(rom.indexOf("M") != -1){
				if(i == 0){
					totalM ++;
					resultm = 1000;
					
				}else{
					resultm = 1000 * totalM;			
					totalM++;

				}
			}
		}


		//Converter D
		for(int i = 0 ;i < rom.length(); i++){
			if(rom.indexOf("D") != -1){
				if(i == 0){
					totalD ++;
					resultm = 1000;
				}else{
					resultd = 500 * totalD;
					totalD++;
				}
			}

		}

	}
}	










