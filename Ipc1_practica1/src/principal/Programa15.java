package principal;

import java.util.Scanner;

public class Programa15 {
	public static boolean primo (int num){
		
		boolean prim=true;
		int divisor=2;
		while((prim)&&(divisor!=num)){
			if(num%divisor==0){
				prim=false;
			}else{
				divisor++;
		}
	}
		return prim;
}
	public static void main(String[] args) {
		System.out.println("-----------------------------------------");
		System.out.println("PROGRAMA 15");
			Scanner sc=new Scanner(System.in);
			int numero=0;
			boolean primo;
			System.out.println("Ingrese numero para ver primos anteriores:");
			numero=sc.nextInt();
			
			for( int numeros=numero;numero>0 ; numero--  ){
				primo=primo(numero); 
				if(primo){
					System.out.println(numero);
					
				}
				}
	
			
		
	}
}
