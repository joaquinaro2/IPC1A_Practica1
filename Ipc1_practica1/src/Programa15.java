import static java.lang.Math.*; 

import java.util.Scanner;
public class Programa15{
     public static void main(String args[]){
    		int n=0;
			System.out.println("Ingrese número");
			@SuppressWarnings("resource")
			Scanner s=new Scanner (System.in);
			n=s.nextInt(); 
    	 
int i=0;
int j=0;
int div=0;
int raiz=0;
		 for (i=1;i<n;i++)    { 
			 div=0; 
			 raiz=(int)sqrt(i);
			 for (j=1;j<=raiz;j++)    { 
				 if (i%j==0)
				 div++;
			 }
			 if (div<=1)
				System.out.println (i + " es número primo" );
		 }
	 }
 } 