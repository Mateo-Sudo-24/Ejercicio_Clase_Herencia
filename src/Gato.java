public class Gato extends Mascotas {
    private String color;
    private String pelaje;

    public Gato(String nombre, int edad, String tipo) {
        super(nombre, edad, tipo); // Llama al constructor de la clase base Mascota con los parámetros
        this.color = "Desconocido";
        this.pelaje = "Corto";
    }

    public String maullar() {
        return "Miau!";
    }

    public String dormir() {
        return "El gato está durmiendo";
    }

    public String mostrarDatos() {
        return super.mostrarDatos() + ", Color: " + color + ", Pelaje: " + pelaje;
    }
}
