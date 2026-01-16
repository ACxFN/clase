package tema1;

public class AppConsole {
	public static void main(String[] args) {
		ConsoleInOut consola = new ConsoleInOut();
		Calculadora calculadora = new Calculadora();
		Double resultado = calculadora.getValor();
		Double numero = 0.0;

		consola.write("Indica una operación: (si quieres terminar, escribe FIN)");
		do {
			String operacion = consola.readString("Indica operación");
			if (operacion.equalsIgnoreCase("fin")) {
				break;
			}
			String signo = operacion.substring(0, 1);
			if (signo.equals("0")) {
				calculadora.cero();
				Double valor2 = calculadora.getValor();
				resultado = valor2;
			}
			else {
				numero = Double.parseDouble(operacion.substring(1));
			}
			if (signo.equals("+")) {
				resultado = calculadora.sumar(numero);
			}
			else if (signo.equals("-")) {
				resultado = calculadora.restar(numero);
			}
			else if (signo.equals("*")) {
				resultado = calculadora.multiplicar(numero);
			}
			else if (signo.equals("/")) {
				resultado = calculadora.dividir(numero);
			}
			consola.write("Resultado: " + resultado);
			
		}
		while(true);
		
		consola.close();
		
		
	}

}


