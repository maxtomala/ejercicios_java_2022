package ejercicio2_sumar_nº;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1;
		int numero2;
		int sumaTotal;
		
		//almacenar numero 1
		Scanner scanner =new Scanner (System.in);
		System.out.println("Ingresa el primer numero para sumar: ");
		numero1 = scanner.nextInt();
		
		//almacenar numero 2
		System.out.println("ingresa el segundo numero para sumar: ");
		numero2 = scanner.nextInt();
		
		//realiza suma
		sumaTotal = numero1 + numero2;
		System.out.println("La suma de los dos numeros insertados es: " + sumaTotal);
		
	}

}
