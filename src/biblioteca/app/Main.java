package biblioteca.app;

import biblioteca.model.*;
import biblioteca.util.ContadorItems;

public class Main {
	public static void main(String[] args) {
		
		Autor a1 = new Autor ("Manuel", "Madrid");
		Autor a2 = new Autor ("Jose", "Mexico");
		
		Autor[] autoresLibro = {a1, a2};
		
		Libro libro1 = new Libro(1, "La historia del mundo", 2020, 300, autoresLibro);

		Revista revista1 = new Revista(2, "El consejal", 2024, 15, "mensual");
		
		System.out.println(libro1);
		System.out.println(revista1);
		
		System.out.println("total items: " + ContadorItems.getTotalItems());
		
		
		
		
	}
}
