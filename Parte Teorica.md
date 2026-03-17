PARTE TEORICA

1. ¿Por qué ItemBiblioteca se ha definido como clase abstracta?
   
    Porque sirve como base comun y no tiene sentido crear objetos directamente en ella.
   
3. Explica por qué la relación entre Libro y Autor es composición y no herencia.
   
    Es composicion porque un libro tiene autores, no es un autor.
   
5. Indica dos ventajas de usar encapsulación en las clases del ejercicio.
   
  Porteccion de datos y controlador de modificacion o acceso
   
7. ¿Por qué ConfiguracionSistema podría declararse como final?
   
    Para evitar que se herede o modifique su codigo.
   
9. ¿Qué ocurriría si el atributo contador de ContadorItems no fuera estático?
    
    Cada objeto tendia su propio contador y no contaria uno real.
 
11. En qué situaciones es más adecuado utilizar herencia en lugar de composición.
    
    Cuando existen relaciones como "es-un" un ejemplo claro es: libro es un iten de biblioteca.
    
13. ¿Qué métodos importantes heredan todas las clases de Object? Menciona al menos
tres.

    toString, equals, hashCode.

15. Explica brevemente el polimorfismo y cómo aparece en este ejercicio.

    Es lo que permite tratar varios obejtos diferentes como el mismo tipo.
    
17. Observa el siguiente método:
    
public static void modificarTitulo(String titulo) {

titulo = "Nuevo título";

}

y la llamada:

String t = "Java";
modificarTitulo(t);
System.out.println(t);

1. ¿Qué se imprimirá?
   
   Java
   
3. Explica por qué ocurre esto en Java
   
   Los toString son inmutables, Se pasa una copia de referencia Y el cambio de parametros no afecta.
