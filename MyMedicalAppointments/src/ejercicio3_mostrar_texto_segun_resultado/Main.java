package ejercicio3_mostrar_texto_segun_resultado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner (System.in);
		int calif =0;
		System.out.println("ingresa tu calificacion para evaluar");
		calif = scanner.nextInt();
		
		/*USANDO IF-ELSE
		if (calif<6)
					{System.out.println("estas reprobado... eres un poco donkey");
		}else if ( calif<10) {
					System.out.println("estas aprobado para continuar tus estudios");
		}else {
					System.out.println("FELICIDADES ERES GENIAL!!!");
		}
		*/
		
		//USANDO SWITCH: cuidado hay que poner todos los case 1-10
		 switch (calif) {
		 case 5:
			 System.out.println("reprobado");
			 	break;
		 case 8:
			 System.out.println("aprobado");
			 break;
			 
		 case 10:
			 System.out.println("FELICIDADES ERES GENIAL!!!");
			 break;
			 
			 
			 
		 }
		
	}

}
