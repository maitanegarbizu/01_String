import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		//creamos un objeto para leer del teclado
		Scanner lector = new Scanner(System.in);
		
		//leemos del teclado
		System.out.println("Escribe tu nombre:");
		String nombre;
		nombre = lector.nextLine();
		
		System.out.println(nombre);
		
		System.out.println("Escribe tu apellido1:");
		String apellido1;
		apellido1 = lector.nextLine();
		
		System.out.println("Escribe tu apellido2:");
		String apellido2 = lector.nextLine();
		
		
		//concatenacion de strings
		System.out.println("Hola " + apellido1 + ", " + apellido2 + " " + nombre);
		
		System.out.println("Cuántos años tienes?");
		//int edad = Integer.parseInt(lector.nextLine());
		int edad = lector.nextInt();
		
		
		if (edad<18){
		System.out.println("Eres menor");
		}
			
		else {
			System.out.println("Mayor de edad");
		}
			
			
		
	}

}
