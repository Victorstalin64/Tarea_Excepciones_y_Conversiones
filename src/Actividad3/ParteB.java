package Actividad3;

public class ParteB {
    public static void main(String[] args) {
        double valorDouble = 45.89;
        float valorFloat = (float) valorDouble;
        int valorInt = (int) valorDouble;
        short valorShort = (short) valorDouble;
        byte valorByte = (byte) valorDouble;

        System.out.println("Double original: " + valorDouble);
        System.out.println("Casting a float: " + valorFloat);
        System.out.println("Casting a int: " + valorInt);
        System.out.println("Casting a short: " + valorShort);
        System.out.println("Casting a byte: " + valorByte);
    }
}