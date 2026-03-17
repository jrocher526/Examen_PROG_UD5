package biblioteca.model;

public class Revista extends ItemBiblioteca {
	
	// Atributos 
	private int numero;
	private String periocidad;
	
	// Constructor
	public Revista(int id, String titulo, int anioPublicacion, int numero, String periocidad) {
		super(id, titulo, anioPublicacion);
		this.numero = numero;
		this.periocidad = periocidad;
	}
	
	@Override
	public String obtenerDescripcion() {
		return "Revista numero " + numero + "Tiempo publicado " + periocidad;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + obtenerDescripcion();
	}
}
