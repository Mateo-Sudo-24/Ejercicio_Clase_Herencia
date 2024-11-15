public class Pez extends Mascotas {
    private String agua;

    public Pez(String nombre, int edad, String tipo, String agua) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.agua = agua;
    }

    public String nadar() {
        return "El pez está nadando";
    }

    public String saltarFueraDelAgua() {
        return "El pez está saltando fuera del agua";
    }

    public String mostrarDatos() {
        return super.mostrarDatos() + ", Agua: " + agua;
    }
}
