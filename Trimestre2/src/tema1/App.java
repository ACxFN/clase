package tema1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calculadora calc = new Calculadora();
		Double resultado;
		Integer opciones;

		do {

			System.out.println("***" + " " + "MENU" + " " + "***");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Poner a 0");
			System.out.println("6. Terminar");
			System.out.println("Elige una opcion");
			opciones = sc.nextInt();

			if (opciones == 1) {
				System.out.println("Dime que quieres sumar");
				Double cantidadParaSumar = sc.nextDouble();
				resultado = calc.sumar(cantidadParaSumar);
				System.out.println("Resultado = " + resultado);

				System.out.println("Dime que quieres sumar");
				cantidadParaSumar = sc.nextDouble();
				resultado = calc.sumar(cantidadParaSumar);
				System.out.println("Resultado = " + resultado);

			} else if (opciones == 2) {
				System.out.println("Dime que quieres restar");
				Double cantidadParaRestar = sc.nextDouble();
				resultado = calc.restar(cantidadParaRestar);
				System.out.println("Resultado = " + resultado);

			} else if (opciones == 3) {
				System.out.println("Dime que quieres multiplicar");
				Double cantidadParaMultiplcar = sc.nextDouble();
				resultado = calc.multiplicar(cantidadParaMultiplcar);
				System.out.println("Resultado = " + resultado);

			} else if (opciones == 4) {
				System.out.println("Dime que quiers Dividir");
				Double cantidadParaDividir = sc.nextDouble();
				resultado = calc.dividir(cantidadParaDividir);
				System.out.println("Resultado =" + resultado);

			} else if (opciones == 5) {
				System.out.println("Vas a poner la calculadora a 0");
				calc.cero();

			} else if (opciones == 6) {
				System.out.println("La calculadora va a terminar");

			}

		} while (opciones != 6);
		System.out.println("Adios");
		sc.close();

	}

}
