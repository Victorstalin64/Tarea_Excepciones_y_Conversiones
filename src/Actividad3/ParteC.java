package Actividad3;

public class ParteC {
    public static void main(String[] args) {
        String strInt = "2024";
        String strDouble = "98.6";
        String strBoolean = "false";

        int stringAInt = Integer.parseInt(strInt);
        double stringADouble = Double.parseDouble(strDouble);
        boolean stringABoolean = Boolean.parseBoolean(strBoolean);

        System.out.println("Convertidos desde String:");
        System.out.println("int: " + stringAInt + ", double: " + stringADouble + ", boolean: " + stringABoolean);

        String deVuelta1 = String.valueOf(stringAInt);
        String deVuelta2 = Double.toString(stringADouble);
        String deVuelta3 = stringABoolean + "";

        System.out.println("Convertidos de vuelta a String:");
        System.out.println("Método 1 (String.valueOf): " + deVuelta1);
        System.out.println("Método 2 (Wrapper.toString): " + deVuelta2);
        System.out.println("Método 3 (Concatenación): " + deVuelta3);
    }
}