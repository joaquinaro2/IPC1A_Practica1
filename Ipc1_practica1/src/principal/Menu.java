package principal;



import java.util.Scanner;

public class Menu {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int opcion;
		Scanner s = new Scanner(System.in);
		
	System.out.println("Ingrese el numero del programa:");
	
	System.out.println(" Programa 1");
	System.out.println(" Programa 2");
	System.out.println(" Programa 3");
	System.out.println(" Programa 4");
	System.out.println(" Programa 5");
	System.out.println(" Programa 6");
	System.out.println(" Programa 7");
	System.out.println(" Programa 8");
	System.out.println(" Programa 9");
	System.out.println(" Programa 10");	
	System.out.println(" Programa 13");
	System.out.println(" Programa 14");
	System.out.println(" Programa 15");
	System.out.println();
	
	opcion=s.nextInt();

switch(opcion){
case (1): 
	Programa1 menu1=new Programa1();
menu1.main(args);
case (2): 
	Programa2 menu2=new Programa2();
menu2.main(args);
case (3): 
	Programa3 menu3=new Programa3();
menu3.main(args);
case (4): 
	Programa4 menu4=new Programa4();
menu4.main(args);
case (5): 
	Programa5 menu5=new Programa5();
menu5.main(args);
case (6): 
	Programa6 menu6=new Programa6();
menu6.main(args);
case (7): 
	Programa7 menu7=new Programa7();
menu7.main(args);
case (8): 
	Programa8 menu8=new Programa8();
menu8.main(args);
case (9): 
	Programa9 menu9=new Programa9();
menu9.main(args);
case (10): 
	Programa10 menu10=new Programa10();
menu10.main(args);
case (13): 
	Programa13 menu13=new Programa13();
menu13.main(args);
case (14): 
	Programa14 menu14=new Programa14();
menu14.main(args);
case (15): 
	Programa15 menu15=new Programa15();
menu15.main(args);
	}
}
}

	