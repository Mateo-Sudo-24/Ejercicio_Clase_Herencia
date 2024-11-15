public class Conejo extends Mascotas {
    private String color;
    private String raza;

    public Conejo() {
        super();
        this.color = "Desconocido";
        this.raza = "Desconocida";
    }

    public void establecerAtributos(String nombre, int edad, String tipo, String color, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.color = color;
        this.raza = raza;
    }

    public String saltar() {
        return "El conejo está saltando";
    }

    public String comer() {
        return "El conejo está comiendo";
    }

    public String mostrarDatos() {
        return super.mostrarDatos() + ", Color: " + color + ", Raza: " + raza;
    }
}
