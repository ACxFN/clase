package tema1.ejercicio3;

import tema1.ConsoleInOut;

public class App {

	
	 public static void main(String[] args) {
		
		 ConsoleInOut console = new ConsoleInOut();
		 String titulo = console.readString("Dime el titulo");
		 String autor = console.readString("Dime el autor");
		 Integer totalPag = console.readInteger("Dime el total de paginas");
		 Libro libro = new Libro(autor, titulo, totalPag);
		 Integer opcion;
		 do {
		 console.write("¿Como vas con el libro?");
		 opcion = console.readInteger("1.He avanzado\n2.He retrocedido\n3.He abandonado");
		 if (opcion == 1 || opcion == 2) {
		  Integer paginas = console.readInteger("¿Cuantas paginas?");
		  if (opcion == 1) {
			  libro.Leer(paginas);
		  }
		  else if (opcion == 2) {
			  libro.Retroceder(paginas);
		  }
		  console.write("Llevas un " + libro.Progreso() + "% del libro");
		}
	}	
		 while (opcion != 3 && libro.Progreso()!=100);
		 console.write("Bye. progreso que has alcanzado: " + libro.Progreso() + "%");
		 console.close();
	}
}
