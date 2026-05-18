package Actividad3.ParteD;

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();

        if (miAnimal instanceof Perro) {
            Perro miPerro = (Perro) miAnimal;
            System.out.println("Casting de objeto exitoso.");
            miPerro.hacerSonido();
            miPerro.moverCola();
        }
    }
}