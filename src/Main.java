public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato("Miau", 3, "Gato");
        Pajaro pajaro = new Pajaro("Rojo", "Pequeño");
        Pez pez = new Pez("Nemo", 2, "Pez", "Salada");
        Conejo conejo = new Conejo();
        conejo.establecerAtributos("Bola de nieve", 1, "Conejo", "Gris", "Cabeza de Leon");

        System.out.println(perro.mostrarDatos());
        System.out.println(perro.ladrar());
        System.out.println(perro.correr());

        System.out.println(gato.mostrarDatos());
        System.out.println(gato.maullar());
        System.out.println(gato.dormir());

        System.out.println(pajaro.mostrarDatos());
        System.out.println(pajaro.volar());
        System.out.println(pajaro.cantar());

        System.out.println(pez.mostrarDatos());
        System.out.println(pez.nadar());
        System.out.println(pez.saltarFueraDelAgua());

        System.out.println(conejo.mostrarDatos());
        System.out.println(conejo.saltar());
        System.out.println(conejo.comer());
    }
}
