package GestionBiblioteca;

/**
* La clase Prestamo representa un préstamo de un libro en la biblioteca.
* 
* @author Autor
* @version 1.0
* @since 2024-03-23
*/
public class Prestamo {
   private String nombreUsuario;
   private Libro libroPrestado;

   public Prestamo(String nombreUsuario, Libro libroPrestado) {
       this.nombreUsuario = nombreUsuario;
       this.libroPrestado = libroPrestado;
   }

   public String getNombreUsuario() {
       return nombreUsuario;
   }

   public Libro getLibroPrestado() {
       return libroPrestado;
   }
}
