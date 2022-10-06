package ejercicio5_nºmayor_es;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("ingresa numero 1 ");
		numero1= sc.nextInt();
		System.out.println("ingresa numero 2 ");
		numero2= sc.nextInt();
		
		if (numero1>numero2) {
			System.out.println("el numero mayor es: "+ numero1);
		}else {
			System.out.println("el numero mayor es: " + numero2);
		}
	}

}
