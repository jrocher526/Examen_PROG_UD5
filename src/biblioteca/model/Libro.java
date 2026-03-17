package biblioteca.model;

public class Libro extends ItemBiblioteca{

	// Atributos 
	private Autor[] autores;
	private int numeroPaginas;
	
	// Constructor
	public Libro(int id, String titulo, int anioPublicacion, int numeroPaginas, Autor[] autores) {
		super(id, titulo, anioPublicacion);
		this.numeroPaginas = numeroPaginas;
		this.autores = autores;
	}
	
	public String obtenerDescripcion() {
		return "Libro de " + numeroPaginas + " paginas";
	}
	
	@Override
	public String toString() {
		String listarAutores = "";
		for (Autor a : autores) {
			listarAutores += a + ", ";
		}
		return super.toString() + ", " + obtenerDescripcion() + ", Autores " + listarAutores; 
	}
}
