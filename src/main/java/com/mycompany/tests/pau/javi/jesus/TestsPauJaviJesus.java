package com.mycompany.tests.pau.javi.jesus;

import java.util.Scanner;

public class TestsPauJaviJesus {

    public static void main(String[] args) {

        TestsPauJaviJesus programa = new TestsPauJaviJesus();
        Scanner sc = new Scanner(System.in);

        int eleccioUsusari = programa.imprimirMenu(sc);

        while (eleccioUsusari != 0) {
            switch (eleccioUsusari){
                case 1:
                
                    break;
    
                case 2:
    
                    break;
    
                case 3:
                    
                    break;
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
        x = Nombre1 + Nombre2;
        return x;
    }

    public boolean positiu(int Nombre) {
        if (Nombre > 0) {
            return true;            
        } else {
            return false;
        }
    }
}
