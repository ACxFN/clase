package tema1;

public class Calculadora {

	private Double valor;

	// no se pone nada en los parentesis cuando no reciba parametros
	public Calculadora() {
		valor = 0.0;
	}

	public Double sumar(Double numero) {
		valor += numero;
		return valor;
	}

	public Double restar(Double numero) {
		valor -= numero;
		return valor;
	}

	public Double multiplicar(Double numero) {
		valor *= numero;
		return valor;
	}

	public Double dividir(Double numero) {
		if (numero != 0) {
			valor /= numero;
		}

		return valor;

	}

	public void cero() {
		valor = 0.0;
	}

	public Double getValor() {
		return valor;
	}

}
