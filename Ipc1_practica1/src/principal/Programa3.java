package principal;

import java.util.Scanner;

public class Programa3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String salir; 	
		
		
System.out.println("HORAS")	;	
	 

Scanner sc=new Scanner(System.in); 
String hora; 
int horas,minutos; 
System.out.println("Ingrese hora en formato 24hrs:"); 
hora=sc.nextLine(); 

horas=Integer.parseInt(hora.substring(0, hora.indexOf(":"))); 
minutos=Integer.parseInt(hora.substring (hora.indexOf(":")+1,hora.length() )); 

if (horas>24){
	System.out.println("La hora ingresada no es correcta");
	}else if(minutos>60){
		System.out.println("La hora ingresada no es correcta");
	}else if(horas==0){ 
		System.out.println((horas+12)+":"+ minutos+" AM"); 
	}else if(horas==12){ 
		System.out.println(horas+":"+ minutos+" PM"); 
	}else if(horas>=0 && horas<12){ 
		System.out.println(horas+":"+ minutos+" AM"); 
	}else{ 
		System.out.println((horas-12)+":"+ minutos+" PM"); 
		} 

} 

}
