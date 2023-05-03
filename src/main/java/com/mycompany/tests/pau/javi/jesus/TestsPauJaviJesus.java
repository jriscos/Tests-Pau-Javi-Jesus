package com.mycompany.tests.pau.javi.jesus;

import java.util.Scanner;

public class TestsPauJaviJesus {

    public static void main(String[] args) {

        TestsPauJaviJesus programa = new TestsPauJaviJesus();
        Scanner sc = new Scanner(System.in);

        int eleccioUsusari = programa.imprimirMenu(sc);
        int num1, num2, resultat;

        while (eleccioUsusari != 0) {
            switch (eleccioUsusari) {
                case 1 -> {
                    num1 = programa.demanar_nombre(sc);
                    num2 = programa.demanar_nombre(sc);
                    resultat = programa.suma(num1, num2);
                    System.out.println("\n\t[*] El resultat és " + resultat);
                }
                case 2 -> {
                    num1 = programa.demanar_nombre(sc);
                    num2 = programa.demanar_nombre(sc);
                    resultat = programa.resta(num1, num2);
                    System.out.println("\n\t[*] El resultat és " + resultat);
                }
                case 3 -> {
                    num1 = programa.demanar_nombre(sc);
                    if (programa.positiu(num1)) {
                        System.out.println("\n\t[*] El nombre és positiu");
                    } else {
                        System.out.println("\n\t[*] El nombre és negatiu");
                    }
                }
            }
            System.out.println();
            eleccioUsusari = programa.imprimirMenu(sc);
        }
    }

    public int imprimirMenu(Scanner sc) {

        int x = 0;

        System.out.print("[*] MENÚ CALCULADORA\n"
                + "\n\t0 -> Sortir del programa"
                + "\n\t1 -> Calcular suma de dos nombres"
                + "\n\t2 -> Calcular resta de dos nombres"
                + "\n\t3 -> Calcular si un nombre es positiu o negatiu"
                + "\n\n[+] Tria una opció: ");

        try {
            x = sc.nextInt();
        } catch (Exception e) {
            System.out.println("\n[!] Error en l'introducció de les dades!");
        }

        return x;
    }

    public int suma(int Nombre1, int Nombre2) {
        int x;
        x = Nombre1 + Nombre2;
        return x;
    }

    public int resta(int Nombre1, int Nombre2) {
        int x;
        int aux;
        if (Nombre2 > Nombre1) {
            aux = Nombre1;
            Nombre1 = Nombre2;
            Nombre2 = aux;
        }
        x = Nombre1 - Nombre2;
        return x;
    }

    public boolean positiu(int Nombre) {
        return Nombre > 0;
    }

    public int demanar_nombre(Scanner sc) {
        int x;
        System.out.print("\n\t[+] Introdueix un nombre: ");
        try {
            x = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error");
            x = 0;
        }
        return x;

    }
}
