package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	System.out.println("Iveskite du skaicius");

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println("Suma" + skaiciuotuvas.suma(a,b));
        System.out.println("Skirtumas" + skaiciuotuvas.skirtumas(a,b));
        System.out.println("Sandauga" + skaiciuotuvas.sandauga(a,b));

    }
}
