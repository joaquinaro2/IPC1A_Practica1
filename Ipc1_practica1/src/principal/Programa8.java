package principal;

import java.util.Random;
import java.util.Scanner;

public class Programa8 {
	
	public static void main (String [] args){
		System.out.println("-----------------------------------------");
		System.out.println("PROGRAMA 8");
	Scanner s=new Scanner (System.in);
	int li;
	int ls;
	int b;
    Random rnd = new Random();
   
    
	System.out.println("Ingrese limite inferior y limite superior, para generar un numero aleatorio:");
	li=s.nextInt();
	ls=s.nextInt();
	
	 b = (rnd.nextInt(ls-li+1) + li);

	System.out.println("Número aleatorio:"+b); 
	}
}
