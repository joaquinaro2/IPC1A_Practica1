package principal;

import java.util.Scanner;

public class Programa5 {

	public static void main(String[] args) {
		int df=0;
		int mf=0;
		int di=0;
		int mi=0;
		int m[]={0,30,60,90,120,150,180,210,240,270,300,330,360};
		int d=0;
		// TODO Auto-generated method stub

Scanner s=new Scanner (System.in);
System.out.println(" Mes    #mes\n enero      1 \n febrero    2 \n marzo      3 \n abril      4 \n mayo       5 \n julio      6 \n junio      7 \n agosto     8 \n septiembre 9 \n octubre    10 \n noviembre  11 \n diciembre  12");
System.out.println();
System.out.println("Ingrese fecha final en el formato: \n [#mes] \n [Día ] ");
System.out.println();

mf= s.nextInt();
df= s.nextInt();

System.out.println("Ingrese fecha inicial: ");

mi= s.nextInt();
di= s.nextInt();
d=(m[mf]+df)-(m[mi]+di);
System.out.println();
System.out.println("La diferencia de dias es de: "+((m[mf]+df)-(m[mi]+di)));
	}
}
