package Podstawy;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner( System.in);


        int numerButa;
        System.out.println("Podaj numer buta: ");
        numerButa = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Podaj średnią z niemieckiego: ");
        double average = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println(("Podaj swoje imię: "));
        String name = keyboard.nextLine();

        System.out.println("Twój numer buta to " + numerButa +
                ", twoja średnia: " + average + ", imię " + name);
    }
}
