package principal;

import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------");
		System.out.println("PROGRAMA 10");
		// TODO Auto-generated method stub
		int n;
		int m;
		Scanner s= new Scanner (System.in);
				System.out.println("Piramide Invertica de:");
		n=s.nextInt();
		m=n;
		for (int f=1; f<n+1; f++) { 
			for (int es=1;es<f; es++)
				System.out.print(" ");
            for (int ast=n+1; ast>f; ast--)  
                System.out.print (m-n+1+" "); 
             ++m;
             
            System.out.println(); 
    }
		
	}

}
