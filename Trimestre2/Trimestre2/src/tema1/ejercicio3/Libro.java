package tema1.ejercicio3;

public class Libro {

	private String titulo;
	private String autor;
	private Integer paginasLeidas;
	private Integer totalPaginas;
	
	public Libro(String titulo, String autor, Integer totalPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		paginasLeidas = 0;

	}

	
	public Integer Leer(Integer paginas) {
		paginasLeidas += paginas;
		if(totalPaginas > paginasLeidas) {
			paginasLeidas = totalPaginas;
		}
		return paginasLeidas;

	}
		
		public int Retroceder(int paginas) {
			paginasLeidas -= paginas;
			if(paginasLeidas < 0) {
				paginasLeidas = 0;
			}
			return paginasLeidas;
			
		}
		
		public void Reiniciar() {
			paginasLeidas = 0;
		}
		public Double Progreso() {
			return (paginasLeidas *100.0) / totalPaginas;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			autor = autor;
		}
	}
	
	
