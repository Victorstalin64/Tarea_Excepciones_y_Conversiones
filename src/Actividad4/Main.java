package Actividad4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversorMoneda conversor = new ConversorMoneda();


        try {
            System.out.print("Ingrese la moneda de origen (USD / EUR): ");
            String monedaOrigen = sc.nextLine();

            System.out.print("Ingrese la moneda de destino (USD / EUR): ");
            String monedaDestino = sc.nextLine();

            System.out.print("Ingrese la cantidad a convertir: ");
            String cantidadStr = sc.nextLine();

            double cantidad = Double.parseDouble(cantidadStr);

            double resultado = conversor.convertir(monedaOrigen, monedaDestino, cantidad);

            System.out.println("Resultado: " + String.format("%.2f", resultado) + " " + monedaDestino.toUpperCase());

        } catch (NumberFormatException e) {
            System.out.println("Error: La cantidad ingresada no es un número válido.");
        } catch (MonedaNoSoportadaException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}