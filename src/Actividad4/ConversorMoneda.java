package Actividad4;

public class ConversorMoneda {
    public double convertir(String monedaOrigen, String monedaDestino, double cantidad) throws MonedaNoSoportadaException {
        String origen = monedaOrigen.toUpperCase();
        String destino = monedaDestino.toUpperCase();

        if (!esMonedaValida(origen) || !esMonedaValida(destino)) {
            throw new MonedaNoSoportadaException("Error: Una o ambas monedas no están soportadas por el sistema.");
        }

        if (origen.equals(destino)) {
            return cantidad;
        }

        if (origen.equals("USD") && destino.equals("EUR")) {
            return cantidad * 0.92;
        } else if (origen.equals("EUR") && destino.equals("USD")) {
            return cantidad * 1.09;
        }

        return 0;
    }

    private boolean esMonedaValida(String moneda) {
        return moneda.equals("USD") || moneda.equals("EUR");
    }
}