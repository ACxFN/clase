package Ejercicio21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio21 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Alumno> alumnos = new ArrayList<>();
		
		Curso curso = new Curso();
		curso.setIdentificador(1L);
		curso.setDescripcion("DAM-DAW");
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Datos del alumno " + (i+1));
			Alumno alumno;
			do {
				System.out.println(">> Dime el DNI");
				String dni = sc.nextLine();
				alumno = new Alumno(dni);
			}
			while(!alumno.validarDni());
			
			alumnos.add(alumno);
			
			System.out.println(">> Dime el nombre");
			String nombre = sc.nextLine();
			alumno.setNombre(nombre);
			System.out.println(">> Dime la nota");
			Double nota = sc.nextDouble();
			alumno.setNota(nota);
			System.out.println(">> Dime la edad");
			Integer edad = sc.nextInt();
			alumno.setEdad(edad);
			alumno.setCurso(curso);
		}
		
		if (alumnos.get(0).equals(alumnos.get(1))
				|| alumnos.get(0).equals(alumnos.get(2))
				|| alumnos.get(1).equals(alumnos.get(2))) {
			System.out.println("Hay alumnos repetidos");
		}
		else {
			System.out.println("Todos los alumnos son distintos");
		}
		
		Boolean todosOk = true;
		for (Alumno alumno : alumnos) {
			if (!alumno.validar()) {
				todosOk = false;
				System.out.println("Alumno no válido: " + alumno);
			}
		}
		if (todosOk) {
			System.out.println("Todos los alumnos OK");
		}
		
		sc.close();
		
		
	}

	
}
