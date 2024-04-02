package GestionBiblioteca;

/**
 * La clase Usuario representa a un usuario de la biblioteca.
 * 
 * @author Autor
 * @version 1.0
 * @since 2024-03-23
 */
public class Usuario {
    private String nombre;
    private int edad;

    /**
     * Constructor de la clase Usuario.
     * 
     * @param nombre El nombre del usuario.
     * @param edad  La edad del usuario.
     */
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método para obtener el nombre del usuario.
     * 
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener la edad del usuario.
     * 
     * @return La edad del usuario.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para establecer la edad del usuario.
     * 
     * @param edad La nueva edad del usuario.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}














