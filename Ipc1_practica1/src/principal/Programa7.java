package principal;

import java.util.Scanner;

public class Programa7 {

	public static void main(String[] args) {
		int num;
		Scanner s= new Scanner (System.in);
		System.out.println("Tabla de Multiplicar de:");
		num =s.nextByte();
		for(int mult=10;mult>0;mult--){
			System.out.println(num+" x "+mult+" = "+(num*mult));
		}
			

	}

}
