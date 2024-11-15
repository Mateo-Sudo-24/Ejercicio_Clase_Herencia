public class Perro extends Mascotas {
    private String raza;
    private String tamanio;

    public Perro() {
        super();
        this.raza = "Desconocida";
        this.tamanio = "Mediano";
    }

    public String ladrar() {
        return "Guau!";
    }

    public String correr() {
        return "El perro está corriendo";
    }

    public String mostrarDatos() {
        return super.mostrarDatos() + ", Raza: " + raza + ", Tamaño: " + tamanio;
    }
}

