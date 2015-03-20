package principal;

public class Programa1 {
	public static void main(String[] args) {
		for (int filas=1; filas<6; filas++) { 
			for (int espacios=5;espacios>filas; espacios--)
				System.out.print(" ");
            for (int asterIz=0; asterIz<filas; asterIz++)  //asteriscos por la izquierda
                System.out.print ("*"); 
            for  (int asterDe=0; asterDe<filas-1; asterDe++)  //asteriscos por la derecha
            System.out.print ("*");    
             
            System.out.println(); 
            
        }
		for (int filas2=1; filas2<6; filas2++) { 
			for (int espacios2=1;espacios2<(filas2+1); espacios2++)
				System.out.print(" ");
            for (int asterIz2=5; asterIz2>filas2; asterIz2--)  
                System.out.print ("*"); 
            for  (int asterDe2=5; asterDe2>filas2+1; asterDe2--)  
            System.out.print ("*");    
             
            System.out.println(); 
    } 
} 
}