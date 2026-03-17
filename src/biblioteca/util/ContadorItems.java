package biblioteca.util;

public class ContadorItems {

	// Atributos
	private static int contador = 0;
	
	// Metodo para incrementar el contador
	public static void incrementar() {
		contador++;
	}
	
	// Metodo Statico para devolver el valor del contador
	public static int getTotalItems() {
		return contador;
	}

}
