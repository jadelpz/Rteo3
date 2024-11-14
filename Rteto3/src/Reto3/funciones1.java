package Reto3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class funciones1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LocalDate fecha1 = dimeFecha("Dime la primera fecha:", sc);
		LocalDate fecha2;
		do {
			 fecha2 = dimeFecha("Dime la segunda fecha:", sc);
		}while(!fecha1.isBefore(fecha2));
		

		System.out.println(fecha2);

		// Si no son del mismo año, calcula la media de los días mensuales que van de una fecha a otra, incluye el mes
		//de la primera fecha, pero no el el mes de la segunda fecha. Ademas, muestra las consonantes del mes de la
		//segunda fecha separadas por comas. (Ej April -> p,r,l)
		//Por ejemplo, si las fechas son: 1/1/2023 y 1/2/2024, hay que calcular la media de 31 (enero 2023), 28
		//(febrero 2023), 31 (marzo 2023), 30 (abril), ...31 (diciembre 2023), 31 (enero 2024).
		//La suma de los días de todos los meses: 31+28+31+…+31=396 días. Media = 396 días/13 meses=30.46

	}

	public static LocalDate dimeFecha(String texto, Scanner sc) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		do {
			try {
				System.out.println(texto);
				String textoFecha = sc.nextLine();
				LocalDate fecha = LocalDate.parse(textoFecha, formato);
				return fecha;

			} catch (Exception e) {
				System.out.println("Formato incorrecto");
			}
		} while (true);
	}

}
