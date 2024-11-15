public class Pajaro extends Mascotas {
    private String color;
    private String tamano;

    public Pajaro(String color, String tamano) {
        super();
        this.color = color;
        this.tamano = tamano;
    }

    public String volar() {
        return "El pájaro está volando";
    }

    public String cantar() {
        return "El pájaro está cantando";
    }

    public String mostrarDatos() {
        return super.mostrarDatos() + ", Color: " + color + ", Tamaño: " + tamano;
    }
}
