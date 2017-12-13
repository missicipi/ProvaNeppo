package Logica1;
//Desenvolvido por Ulisses Messias

public class FormulaMisteriosa {
	
	
	void calculoMisterioso(String num){
		
		char a;
		a = num.charAt(0);
		int c = 0;
		int u = 0;
		
		while(1 != 0){
			if(u >= num.length()){
				System.out.print(c+ ""+a);
				break;
				
			}else{
				if(a == num.charAt(u)){
					c++;
					u++;
					
				}else{
					
					System.out.print(c+ ""+a);
					c =  0;
					a = num.charAt(u);
					
			}
				
		}
			
	}}}
		
		
		
	