package biblioteca.model;

import biblioteca.util.ContadorItems;

public abstract class ItemBiblioteca {

	// Atributos
	private int id;
	private String titulo;
	private int anioPublicacion;

	// Constructor
	ItemBiblioteca(int id, String titulo, int anioPublicacion) {
		this.id = id;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}
	
	// Contador Items
	ContadorItems.incrementar(); 
	
	// Metodo abstracto
	public abstract String obtenerDescripcion();

	// Metodo ToString
	@Override
	public String toString() {
		return "ID: " + id + ", Titulo: " + titulo + ", Año: " + anioPublicacion;
	}
	
	// Getters y Setters 
	public int getId() {
		return id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	
	public void setId() {
		this.id = id;
	}
	
	public void setTitulo() {
		this.titulo = titulo;
	}
	
	public void setAnioPublicacion() {
		this.anioPublicacion = anioPublicacion;
	}
}
