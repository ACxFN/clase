package tema1.Ejercicio4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el DNI");
		String dni = sc.nextLine();
		Alumno alum = new Alumno(dni);
		
		System.out.println("Dime el nombre");
		String nombre = sc.nextLine();
		alum.setNombre(nombre);
		System.out.println("Dime la nota");
		Double nota = sc.nextDouble();
		alum.setNota(nota);
		System.out.println("Dime la edad");
		Integer edad = sc.nextInt();
		alum.setEdad(edad);
		
		
		System.out.println("Te imprimo los datos del alumno:");
		System.out.println("Nombre: " + alum.getNombre());
		System.out.println("DNI: " + alum.getDni());
		System.out.println("Nota: " + alum.getNota());
		System.out.println("Edad: " + alum.getEdad());
		
		System.out.println("Vamos a aprobar al alumno");
		alum.aprobar();
		System.out.println("Nota final: " + alum.getNota());

		Curso curso = new Curso();
		System.out.println("Dime el id del curso:");
		Long idCurso = sc.nextLong();
		curso.setIdentificador(idCurso);
		sc.nextLine();
		System.out.println("Dime el nombre del curso:");
		String nombreCurso = sc.nextLine();
		curso.setDescripcion(nombreCurso);

		alum.setCurso(curso);
		
		System.out.println("Datos del curso:");
		System.out.println("Id: " + alum.getCurso().getIdentificador());
		System.out.println("Desc: " + alum.getCurso().getDescripcion());
		
		
		
		Profesor profesor = new Profesor();
		
		
		System.out.println("Dime el nombre del profesor");
		String nombreProfe = sc.nextLine();
		profesor.setNombre(nombre);
		
		System.out.println("Dime la edad");
		Integer edadProfe = sc.nextInt();
		profesor.setEdad(edad);
		
		System.out.println("Te imprimo los datos del profesor:");
		System.out.println("Nombre " + profesor.getNombre());
		System.out.println("Edad " + profesor.getEdad());

		
		System.out.println(alum);
		System.out.println(profesor);
		
		
		sc.close();

			
	}
	
	
}
