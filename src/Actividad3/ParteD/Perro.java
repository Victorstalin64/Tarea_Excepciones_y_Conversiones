package Actividad3.ParteD;

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: Guau");
    }

    public void moverCola() {
        System.out.println("El perro mueve la cola");
    }
}