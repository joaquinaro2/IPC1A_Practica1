package principal;

import java.util.Scanner;


class Programa4 {

public static void main(String[] args) {
	String x;
	int l;
	int r;
	int la;
	double h;
	Scanner s= new Scanner(System.in);
System.out.println("Ingrese C, T, U: ");
x= s.nextLine();


switch (x){
case("u"):
	System.out.println("Ha elejido cuadrado \n Ingrese la longitud de un lado:");
	l=s.nextInt();
	System.out.println("El �rea del cuadrado es de "+(l*l));
	System.out.println("El per�metro del cuadrado es de "+(l*4));
case("c"):
	System.out.println("Ha elejido c�rculo \n Ingrese radio:");
	r=s.nextInt();
	System.out.println("El �rea del c�rculo es de "+((Math.PI)*r*r));
	System.out.println("El per�metro del cuadrado es de "+(2*r*Math.PI));
case("t"):
	System.out.println("Ha elejido c�rculo \n Ingrese longitud de lado:");
	la=s.nextInt();
	h=(Math.sqrt(3)*la)/2;
	System.out.println("El �rea del triangulo es de "+(la));
	System.out.println("El per�metro del triangulo es de "+(la*3));
}



}
}