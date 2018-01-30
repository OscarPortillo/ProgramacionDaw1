public class Libro {
	private String titulo;
	private Autor [] autores;
	private Double precio;
	private Integer cantidad;

	public Libro(String titulo, Autor [] autores, Double precio) {
		this.titulo = titulo;
		this.autores = autores;
		this.precio = precio;
		cantidad = 0;
	}

	public Libro(String titulo, Autor [] autores, Double precio, Integer cantidad) {
		this.titulo = titulo;
		this.autores = autores;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public String cadenaLibro() {
		int indiceAutor;
		String cadena = "Libro [titulo = " + titulo + ",\n";
		String stringAutores = " { ";
		for(indiceAutor = 0; indiceAutor < autores.length; indiceAutor++){
			;
			stringAutores = stringAutores + autores[indiceAutor].cadenaAutor() + ",\n ";
		}
		stringAutores = stringAutores + "}";
		cadena = cadena + stringAutores + "\n Precio = " + precio + "\n Cantidad = "	+ cantidad + "]";
		return cadena;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getTitulo() {
		return titulo;
	}

	public Autor[] getAutores() {
		return autores;
	}

}// Libro
