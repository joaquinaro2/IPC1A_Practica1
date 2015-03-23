import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Menú {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String salir; 	

		@SuppressWarnings("resource")
		Scanner sca = new Scanner(System.in);
		
		do 
		{ 
		
char opcion=' ';

BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
try {
	
	System.out.println("Ingrese la letra del programa");
	System.out.println("  Nivel 1");
	System.out.println("     > Programa 1 (a)");
	System.out.println("     > Programa 2 (b)");
	System.out.println("     > Programa 3 (c)");
	System.out.println("     > Programa 4 (d)");
	System.out.println("     > Programa 5 (e)");
	System.out.println("  Nivel 2");
	System.out.println("     > Programa 6 (f)");
	System.out.println("     > Programa 7 (g)");
	System.out.println("     > Programa 8 (h)");
	System.out.println("     > Programa 9 (i)");
	System.out.println("     > Programa 10 (j)");
	System.out.println("     > Programa 11 (k)");
	System.out.println("     > Programa 12 (l)");
	System.out.println("     > Programa 13 (m)");
	System.out.println("     > Programa 14 (n)");
	System.out.println("     > Programa 15 (o)");
	
	
opcion= teclado.readLine().charAt(0);


} catch(IOException variablerror) {System.out.println("error de captura "); }

switch(opcion){
case 'a': 
	nivel1_1 menu1=new nivel1_1();
menu1.main(args);
	
case 'b': 
	nivel1_2 menu2=new nivel1_2();
menu2.main(args);

case 'c': 
	nivel1_3 menu3=new nivel1_3();
	menu3.main(args);
	
case 'd': 
	nivel1_4 menu4=new nivel1_4();
menu4.main(args);

case 'e': 
	nivel1_5 menu5=new nivel1_5();
	menu5.main(args);
	
case 'f': 
	nivel2_6 menu6=new nivel2_6();
	menu6.main(args);
	
case 'g': 
	nivel2_7 menu7=new nivel2_7();
	menu7.main(args);
	
case 'h':
	nivel2_8 menu8=new nivel2_8();
	menu8.main(args);
	
case 'i':
	nivel2_9 menu9=new nivel2_9();
	menu9.main(args);
	
case 'j': 
	nivel2_10 menu10=new nivel2_10();
	menu10.main(args);
	
case 'k': 
	nivel2_11 menu11=new nivel2_11();
	menu11.main(args);
	
case 'l': 
	nivel2_12 menu12=new nivel2_12();
	try {
		menu12.main(args);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
case 'm': 
	nivel2_13 menu13=new nivel2_13();
	menu13.main(args);
	
case 'n':
	nivel2_14 menu14=new nivel2_14();
	menu14.main(args);
	
case 'o':	
	nivel2_15 menu15=new nivel2_15();
	menu15.main(args);
	
default: System.out.println("La letra ingresada no corresponde a ninguna opción");};

System.out.println('\n');
System.out.println("Presione S para salir o cualquier letra para continuar");	
salir = sca.next(); 
} 
while (!salir.equals("S"));
		
	}
}