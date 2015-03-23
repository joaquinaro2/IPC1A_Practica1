package principal;

import java.util.Scanner;

public class Programa13 {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------");
		System.out.println("PROGRAMA 13");
		// TODO Auto-generated method stub
		int y=0,i=0;
		String x,l;
	Scanner s=new Scanner (System.in);
	System.out.println("Ingrese letra a adivinar: \n Abecedario: a b c d e f g h i j k l m n o p q r s t u v w x y z");
	x=s.nextLine();
	
	switch (x){
		case("a"):
			y=1;
		break;
		case("b"):
			y=2;
		break;
		case("c"):
			y=3;
		break;
		case("d"):
			y=4;
		break;
		case("e"):
			y=5;
		break;
		case("f"):
			y=6;
		break;
		case("g"):
			y=7;
		break;
		case("h"):
			y=8;
		break;
		case("i"):
			y=9;
		break;
		case("j"):
			y=10;
		break;
		case("k"):
			y=11;
		break;
		case("l"):
			y=12;
		break;
		case("m"):
			y=13;
		break;
		case("n"):
			y=14;
		break;
		case("o"):
			y=15;
		break;
		case("p"):
			y=16;
		break;
		case("q"):
			y=17;
		break;
		case("r"):
			y=18;
		break;
		case("s"):
			y=19;
		break;
		case("t"):
			y=20;
		break;
		case("u"):
			y=21;
		break;
		case("v"):
			y=22;
		break;
		case("w"):
			y=23;
		break;
		case("x"):
			y=24;
		break;
		case("y"):
			y=25;
		break;
		case("z"):
			y=26;
		break;
	}
	System.out.println("Adivene la letra:");
	l=s.nextLine();
	switch (l){
	case("a"):
		i=1;
	break;
	case("b"):
		i=2;
	break;
	case("c"):
		i=3;
	break;
	case("d"):
		i=4;
	break;
	case("e"):
		i=5;
	break;
	case("f"):
		i=6;
	break;
	case("g"):
		i=7;
	break;
	case("h"):
		i=8;
	break;
	case("i"):
		i=9;
	break;
	case("j"):
		i=10;
	break;
	case("k"):
		i=11;
	break;
	case("l"):
		i=12;
	break;
	case("m"):
		i=13;
	break;
	case("n"):
		i=14;
	break;
	case("o"):
		i=15;
	break;
	case("p"):
		i=16;
	break;
	case("q"):
		i=17;
	break;
	case("r"):
		i=18;
	break;
	case("s"):
		i=19;
	break;
	case("t"):
		i=20;
	break;
	case("u"):
		i=21;
	break;
	case("v"):
		i=22;
	break;
	case("w"):
		i=23;
	break;
	case("x"):
		i=24;
	break;
	case("y"):
		i=25;
	break;
	case("z"):
		i=26;
	break;
	}
	
			
	do{
		if(i>y)
		System.out.println("Esta antes");
		
		if(i<y) 
		System.out.println("Esta despues");	
		
		if(i==y){
			System.out.println("Descubriste la letra oculta "+"\""+x+"\"");
		break;
		}
		System.out.println("Ingrese letra a adivinar:");
		
		l=s.nextLine();
		switch (l){
		case("a"):
			i=1;
		break;
		case("b"):
			i=2;
		break;
		case("c"):
			i=3;
		break;
		case("d"):
			i=4;
		break;
		case("e"):
			i=5;
		break;
		case("f"):
			i=6;
		break;
		case("g"):
			i=7;
		break;
		case("h"):
			i=8;
		break;
		case("i"):
			i=9;
		break;
		case("j"):
			i=10;
		break;
		case("k"):
			i=11;
		break;
		case("l"):
			i=12;
		break;
		case("m"):
			i=13;
		break;
		case("n"):
			i=14;
		break;
		case("o"):
			i=15;
		break;
		case("p"):
			i=16;
		break;
		case("q"):
			i=17;
		break;
		case("r"):
			i=18;
		break;
		case("s"):
			i=19;
		break;
		case("t"):
			i=20;
		break;
		case("u"):
			i=21;
		break;
		case("v"):
			i=22;
		break;
		case("w"):
			i=23;
		break;
		case("x"):
			i=24;
		break;
		case("y"):
			i=25;
		break;
		case("z"):
			i=26;
		break;
		}
		if(i==y){
			System.out.println("Descubriste la letra oculta "+"\""+x+"\"");
		}
		}while (y!=i);
	
	}
}


