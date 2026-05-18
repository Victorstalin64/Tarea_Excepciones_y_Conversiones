package Actividad3;

public class ParteA {
    public static void main(String[] args) {
        byte miByte = 10;
        short miShort = miByte;
        int miInt = miShort;
        long miLong = miInt;
        float miFloat = miLong;
        double miDouble = miFloat;

        System.out.println("Byte original: " + miByte);
        System.out.println("Short (desde Byte): " + miShort);
        System.out.println("Int (desde Short): " + miInt);
        System.out.println("Long (desde Int): " + miLong);
        System.out.println("Float (desde Long): " + miFloat);
        System.out.println("Double (desde Float): " + miDouble);
    }
}