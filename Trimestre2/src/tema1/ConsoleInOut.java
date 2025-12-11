package tema1;

import java.util.Scanner;

public class ConsoleInOut {

	private Scanner sc;
	
	public ConsoleInOut() {
		sc = new Scanner(System.in);	

	}
	
	 public void close() {
		 sc.close();
	 }
	 
	 public void write(String palabra) {
		 System.out.println(palabra);
	 }
	 
	 public Integer readInteger(String read) {
		 System.out.println(read);
		 Integer numero = sc.nextInt();
		 return numero;
	 }
	 
	 
}
