package principal;

import java.util.Scanner;

public class Programa2 {
	private static Scanner s;

	public static void main (String []args){
		System.out.println("-----------------------------------------");
		System.out.println("PROGRAMA 2");
		int nota1,nota2,nota3,nota4,nota5,nota6,media;
		System.out.println("Ingrese las 6 notas:");
		s = new Scanner (System.in);
		nota1=s.nextInt();
		nota2=s.nextInt();
		nota3=s.nextInt();
		nota4=s.nextInt();
		nota5=s.nextInt();
		nota6=s.nextInt();
		System.out.println("La media del estudiante es de:"+((nota1+nota2+nota3+nota4+nota5+nota6)/6));
		media=(nota1+nota2+nota3+nota4+nota5+nota6)/6;
		System.out.println();
		System.out.println("Media    Puntuación");
		System.out.println("90-100    A");
		System.out.println("82- 89    B");
		System.out.println("70- 79    C");
		System.out.println("60- 69    D");
		System.out.println(" 0 -59    F");
		
		System.out.println();
		if(media>0 && media<60)
			System.out.println("Tiene una F como puntuación");
		if(media>59 && media<70)
			System.out.println("Tiene una D como puntuación");
		if(media>69 && media<80)
			System.out.println("Tiene una C como puntuación");
		if(media>79 && media<90)
			System.out.println("Tiene una B como puntuación");
		if(media>89 && media<100)
			System.out.println("Tiene una A como puntuación");
	}
	
	
	
	
	
	
	
	
}
