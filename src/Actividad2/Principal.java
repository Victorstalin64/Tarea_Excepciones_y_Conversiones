package Actividad2;

public class Principal {
    public static void main(String[] args) {

        try {
            Estudiante e1 = new Estudiante("Carlos", 20, 8.5);
            System.out.println("Estudiante registrado: " + e1.getNombre() + ", Edad: " + e1.getEdad());
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage() + " Edad intentada: " + e.getEdadIngresada());
        }

        try {
            Estudiante e2 = new Estudiante("Ana", -5, 9.2);
            System.out.println("Estudiante registrado: " + e2.getNombre() + ", Edad: " + e2.getEdad());
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage() + " Edad intentada: " + e.getEdadIngresada());
        }

        try {
            Estudiante e3 = new Estudiante("Luis", 150, 7.8);
            System.out.println("Estudiante registrado: " + e3.getNombre() + ", Edad: " + e3.getEdad());
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage() + " Edad intentada: " + e.getEdadIngresada());
        }
    }
}