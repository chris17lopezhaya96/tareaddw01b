package senati.ddw.ciclo3.tareaddw01b;
import java.util.Scanner;

public class Ejercicio007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int nota1=0;
		int nota2=0;
		int nota3=0;
		int nota4=0;
		
		
		
		
		
		System.out.println("Introduzca la nota 1");
		nota1=sc.nextInt();
		
		System.out.println("Introduzca la nota 2");
		nota2=sc.nextInt();
		
		System.out.println("Introduzca la nota 3");
		nota3=sc.nextInt();
		
		System.out.println("Introduzca la nota 4");
		nota4=sc.nextInt();
		
		
		System.out.println("Promedio:" + (nota1+nota2+nota3+nota4)/4);
		
		
	}

}
