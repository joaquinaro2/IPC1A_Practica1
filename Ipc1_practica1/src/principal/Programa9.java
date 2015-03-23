package principal;
import java.util.Scanner;  
public class Programa9 {
	
	
	    public static void main(String[] args) {  
	    	System.out.println("-----------------------------------------");
	    	System.out.println("PROGRAMA 9");
	      Scanner s=new Scanner(System.in);  
	      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};  
	      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};  
	      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};  
	      String Milenio[]={"", "M", "MM", "MMM"};
	      System.out.println("Ingrese el número arabico que desea convertir a romano:");  
	      int N = s.nextInt();  
	      int u=N%10;  
	      int d=(N/10)%10;  
	      int c=N/100;  
	      int m=(N/1000);
	      	if(N>=1000){          
	            System.out.println(Milenio[m]+Centena[c]+Decena[d]+Unidad[u]);  
	        }else if(N>=100){  
	                System.out.println(Centena[c]+Decena[d]+Unidad[u]);            
	        }else if(N>=10){
	            	System.out.println(Decena[d]+Unidad[u]);
	       	}else  
	            	System.out.println(Unidad[u]);
	                   
	          }            
	                  
	    }  
	 
	
