package Actividad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un numero entero: ");
            String numeroString = sc.nextLine();

            int numero = Integer.parseInt(numeroString);
            int resultado = 100 / numero;

            System.out.println("Resultado: " + (double) resultado);

        }
        catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }
        catch (NumberFormatException e) {
            System.out.println("Debe ingresar un número válido");
        }
        finally {
            System.out.println("Programa finalizado correctamente");
        }
    }
}