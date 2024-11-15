public class Mascotas {
    protected String nombre;
    protected int edad;
    protected String tipo;

    // Constructor que recibe nombre, edad y tipo
    public Mascotas(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    public Mascotas() {
    }

    // Método mostrarDatos() que devuelve la información de la mascota
    public String mostrarDatos() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Tipo: " + tipo;
    }
}
