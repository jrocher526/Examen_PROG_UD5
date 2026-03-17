PARTE TEORICA

1. ¿Por qué ItemBiblioteca se ha definido como clase abstracta?
    Porque sirve como base comun y no tiene sentido crear objetos directamente en ella.
   
2. Explica por qué la relación entre Libro y Autor es composición y no herencia.
    Es composicion porque un libro tiene autores, no es un autor.
   
3. Indica dos ventajas de usar encapsulación en las clases del ejercicio.
  Porteccion de datos y controlador de modificacion o acceso
   
4. ¿Por qué ConfiguracionSistema podría declararse como final?
    Para evitar que se herede o modifique su codigo.
   
5. ¿Qué ocurriría si el atributo contador de ContadorItems no fuera estático?
    Cada objeto tendia su propio contador y no contaria uno real.
 
6. En qué situaciones es más adecuado utilizar herencia en lugar de composición.
    Cuando existen relaciones como "es-un" un ejemplo claro es: libro es un iten de biblioteca.
    
7. ¿Qué métodos importantes heredan todas las clases de Object? Menciona al menos
tres.
    toString, equals, hashCode.

8. Explica brevemente el polimorfismo y cómo aparece en este ejercicio.
    Es lo que permite tratar varios obejtos diferentes como el mismo tipo.
    
9. Observa el siguiente método:
    
public static void modificarTitulo(String titulo) {
titulo = "Nuevo título";
}
y la llamada:
String t = "Java";
modificarTitulo(t);
System.out.println(t);

1. ¿Qué se imprimirá?
   Java
2. Explica por qué ocurre esto en Java
   Los toString son inmutables, Se pasa una copia de referencia Y el cambio de parametros no afecta.
