package Ejercicio20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lista = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Dime la palabra " + i);
			lista.add(sc.nextLine());
		}
		System.out.println(lista);

		for (int i = 0; i < lista.size(); i++) {
			lista.set(i, lista.get(i).toUpperCase());
		}
		System.out.println(lista);

		if (lista.contains("")) {
			System.out.println("Hay alguna cadena vacía");
		} else {
			System.out.println("No hay ninguna cadena vacía");
		}

		Iterator<String> it = lista.iterator();
		while (it.hasNext()) {
			String palabra = it.next();
			if (palabra.length() < 6) {
				it.remove();
			}
		}

		sc.close();

	}

}
