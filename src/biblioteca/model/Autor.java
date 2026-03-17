package biblioteca.model;

public class Autor {

	private String nombre;
	private String nacionalidad;
	
	public Autor(String nombre, String nacionalidad) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}
	
	// Metodo ToString
	public String toSting() {
		return "Nombre: " + nombre + ", Nacionalidad: " + nacionalidad;
	}
	
	// Getters y Setters

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
}
