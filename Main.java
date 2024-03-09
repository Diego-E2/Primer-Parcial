package Lista_Examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lista_Entero lista = new Lista_Entero();
		
		while (true) {
			System.out.println("\nOpciones:");
			System.out.println("1. Insertar Numero Entero ");
			System.out.println("2. Imprimir lista con Numeros Repetidos");
			System.out.println("3. Imprimir lista sin Repetidos");
			System.out.println("4. Salir");
			System.out.println("Seleccione una opcion");
			int opcion = scanner.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.print("Ingrese el numero entero: ");
				int elementoInicio = scanner.nextInt();
				lista.insertarNumeroEntero(elementoInicio);
				break;	
			case 2:
				lista.imprimirLista();
				break;
			case 3:
				lista.imprimirLista2();
				break;
			case 4:
				System.out.println("Saliendo del programa...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Opcion invalida. Por favor, selecciona una opcion valida");
			}
		}

	}

}
