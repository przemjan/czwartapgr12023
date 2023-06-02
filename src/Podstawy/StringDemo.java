package Podstawy;

public class StringDemo {
    public static void main(String[] args) {

        String name = "Euzebiusz";

        int dlugosc;
        dlugosc = name.length();

        char initial = name.charAt(4);

        String duze, male;

        name = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println(name);
    }
}
