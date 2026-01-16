package tema1;

import java.util.Scanner;

public class ConsoleInOut {

	private Scanner scanner;
	
	public ConsoleInOut() {
		scanner = new Scanner(System.in);	

	}
	
	public void close() {
		scanner.close();
	}

	public void write(String msg) {
		System.out.println(msg);
	}
	
	
	public Integer readInteger(String msg) {
		write(msg);
		Integer numero = scanner.nextInt();
		scanner.nextLine();
		return numero;
	}
	
	public Integer readInteger(String msg, Integer min, Integer max) {
		write(msg);
		Integer numero = scanner.nextInt();
		while (numero < min || numero > max) {
			numero = scanner.nextInt();
		}
		scanner.nextLine();
		return numero;
	}
	
	public Double readDouble(String msg) {
		write(msg);
		Double numero = scanner.nextDouble();
		scanner.nextLine();
		return numero;
	}
	
	public Double readDouble(String msg, Double min, Double max) {
		write(msg);
		Double numero = scanner.nextDouble();
		while (numero < min || numero > max) {
			numero = scanner.nextDouble();
		}
		scanner.nextLine();
		return numero;
	}
	
	public String readString(String msg) {
		write(msg);
		String texto;
		do {
			texto = scanner.nextLine();
		} while (texto.isEmpty());
		return texto;
	}
	
	
	public void waitEnter() {
		write("Pulse ENTER para continuar...");
		scanner.nextLine();
	}
	
	
	public Boolean isContinue() {
		write("¿Desea continuar (S/N)?");
		while(true) {
			String respuesta = scanner.nextLine();
			if (respuesta.equalsIgnoreCase("S")) {
				return true;
			}
			if (respuesta.equalsIgnoreCase("N")) {
				return false;
			}
		}
	}

}
