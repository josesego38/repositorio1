package hashmap1;

import java.util.*;
import java.io.*;

public class hashmap1 {

	public static void comprobar_hashmap(HashMap<String, Integer> mapa) {

		for (String i : mapa.keySet()) {
			System.out.println(i + " : " + mapa.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> mapa = new HashMap<String, Integer>();

		try {

			File archivo = new File("Evaluacion.txt");

			Scanner teclado_archivo = new Scanner(archivo);

			while (teclado_archivo.hasNext()) {

				mapa.put(teclado_archivo.next(), teclado_archivo.nextInt());

			}
		} catch (FileNotFoundException e) {
			System.out.println("Error cargar archivo");
		}

		comprobar_hashmap(mapa);

		int opc;

		do {

			System.out.println("1.Introducir una nueva nota");
			System.out.println("2.Calcular la media de la clase");
			System.out.println("3.Ver la lista de las notas");
			System.out.println("4.Ver que alumnos deberán ir a recuperación.");
			System.out.println("0.Salir");

			Scanner T = new Scanner(System.in);

			opc = T.nextInt();

			switch (opc) {

			case 1:

				System.out.println("Introduce el nombre del alumno");

				String nombre = T.next();

				System.out.println("Introduce su nota sin decimales");

				int nota = T.nextInt();

				mapa.put(nombre, nota);

				comprobar_hashmap(mapa);

				try {

					FileWriter guardar = new FileWriter("Evaluacion.txt", true);

					guardar.write(nombre + "\r\n" + nota+"\r\n");
					/*Cargar todo el archivo
					 * FileWriter guardar = new FileWriter("Evaluacion.txt");
					for (Sting i:notas.keySet()){
							guardar.write(nombre + "\r\n" + nota+"\r\n");
							}
					*/

					guardar.flush();

					guardar.close();

				} catch (Exception i) {
					System.out.println("Error al guardar el archivo");
				}
				break;

			case 2:

				float media = 0;

				for (String i : mapa.keySet()) {
					System.out.println(i + " : " + mapa.get(i));
					media = media + mapa.get(i);
				}

				media = media / mapa.size();

				System.out.println("La media de la clase es: " + media);

				break;

			case 3:

				comprobar_hashmap(mapa);

				break;

			case 4:

				for (String i : mapa.keySet()) {
					if (mapa.get(i) < 5) {
						System.out.println("El alumno " + i + " debe de recuperar la asignatura");
					}
				}

				break;
			case 0:

				System.out.println("Adios");

				break;
			default:

				System.out.println("Opcion no valida");

			}

		} while (opc != 0);

	}

}
