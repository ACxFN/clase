package tema1.Ejercicio19;

public class Semaforo {

	public static final String ROJO = "Rojo";
	public static final String AMBAR = "Ambar";
	public static final String VERDE = "Verde";

	private String color;
	private Boolean parpadeando;
	

	public Semaforo() {
		color = ROJO;
		parpadeando = false;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.equals(ROJO) || color.equals(AMBAR) || color.equals(VERDE)) {
			this.color = color;
		}
		//if hace que si no se escogue el color ROJO, AMBAR o VERDE no se modificara 
	}

	public Boolean getParpadeando() {
		return parpadeando;
	}

	public void setParpadeando(Boolean parpadeando) {
		if(color.equals(AMBAR)) {
			this.parpadeando = parpadeando;
		}
	}

	@Override
	public String toString() {
		if(AMBAR.equals(color) && parpadeando) {
			return "Semaforo en AMBAR parpadeando";
		}else {
			return "Semaforo en " + color.toUpperCase();
			//toUpperCase para que el codigo quede mas limpio y salga el color en mayusculas
		}
	}
	
	public void cambiarEstado() {
		if(VERDE.equals(color)) {
			color = AMBAR;
			parpadeando = false;
		} else if(AMBAR.equals(color))
	}
	
	
	
	
}
