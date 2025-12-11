package prueba1;

public class Fecha {
	// Atributos
		private Integer dia;
		private Integer mes;
		private Integer año;
		private String separador;
		
		// Constructores
		public Fecha() {
			dia = 0;
			mes = 0;
			año = 0;
			separador = "-";
		}
		
		
		
		public Fecha(Integer dia, Integer mes, Integer año) {
			this.dia = dia;
			this.mes = mes;
			this.año = año;
			separador = "-";
		}



		public void print() {
			String fechaCompleta = getFechaCompleta();
			System.out.println(fechaCompleta);
		}
		
		public String getFechaCompleta() {
			return  dia + separador + mes + separador + año;
		}

		public Integer getDia() {
			return dia;
		}

		public void setDia(Integer dia) {
			this.dia = dia;
		}



		public Integer getMes() {
			return mes;
		}



		public void setMes(Integer mes) {
			this.mes = mes;
		}



		public Integer getAño() {
			return año;
		}



		public void setAño(Integer año) {
			this.año = año;
		}



		public String getSeparador() {
			return separador;
		}



		public void setSeparador(String separador) {
			this.separador = separador;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



