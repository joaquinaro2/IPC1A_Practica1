package principal;

import java.util.Scanner;

public class Programa3 {
	private static Scanner s;

	public static void main(String[] args) {
		System.out.println("-----------------------------------------");
		System.out.println("PROGRAMA 3");
		// TODO Auto-generated method stub
		String h; 
		int hor,min; 
s = new Scanner(System.in); 

System.out.println("Ingrese hora en formato 24hrs:"); 
h=s.nextLine(); 

hor=Integer.parseInt(h.substring(0, h.indexOf(":"))); 
min=Integer.parseInt(h.substring (h.indexOf(":")+1,h.length() )); 

	 if(hor==0){ 
		System.out.println((hor+12)+":"+ min+" am"); 
	}else if(hor==12){ 
		System.out.println(hor+":"+ min+" pm"); 
	}else if(hor>=0 && hor<12){ 
		System.out.println(hor+":"+ min+" am"); 
	}else{ 
		System.out.println((hor-12)+":"+ min+" pm"); 
		} 

} 

}
