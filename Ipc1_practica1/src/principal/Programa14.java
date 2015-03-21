package principal;

import java.util.Scanner;

public class Programa14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese la longitud del cuadrado:");
		n= s.nextInt();
		for(int m=n;m>0;m--)
			System.out.print("* ");
		System.out.println();
		
		for(int f=n-2;f>0;f--){			 //f son filas 
			System.out.print("* ");
		for(int es=n-2;es>0;es--)
			System.out.print("  ");
		System.out.print("*");
		System.out.println();
		}
		
		for(int y=n;y>0;y--){
			System.out.print("* ");
		
	}
		
	}
}
