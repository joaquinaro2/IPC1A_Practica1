package principal;

import java.util.Scanner;

public class Programa6 {

	private static Scanner s;

	public static void main(String[] args) {
		System.out.println("-----------------------------------------");
		System.out.println("PROGRAMA 6");
		String x;
		int n1;
		int n2;
		
		
		s = new Scanner(System.in);
	System.out.println("Ingrese dos n�meros:");
	n1=s.nextInt();
	n2=s.nextInt();
	
	x= s.nextLine();
	System.out.println("Ingrese la operacion que desea realizar: \"s\" para suma, \"r\" para resta, \"m\" para multiplicaci�n, \"d\" para divisi�n. ");
	x= s.nextLine();

	switch (x){
	case("s"):
		System.out.println("La suma de los dos numeros es igual a: "+(n1+n2));
	break;
	case("r"):
		System.out.println("La resta de los dos numeros es igual a: "+(n1-n2));
	break;
	case("m"):
		System.out.println("La multiplicaci�n de los dos numeros es igual a: "+(n1*n2));
	break;
	case("d"):
		System.out.println("La divisi�n de los dos numeros es igual a: "+(n1/n2));
	break;
	}



	}

}
