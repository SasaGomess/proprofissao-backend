package app;

import java.util.Locale;
import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cal = 0;

        int prato = menuPrato(sc);
        int sobremesa = menuSobremesa(sc);
        int bebida = menuBebidas(sc);

        switch (prato){
            case 1 -> cal += 180;
            case 2 -> cal += 230;
            case 3 -> cal += 250;
            case 4 -> cal += 350;
        }

        switch (sobremesa){
            case 1 -> cal += 75;
            case 2 -> cal += 110;
            case 3 -> cal += 170;
            case 4 -> cal += 200;
        }

        switch (bebida){
            case 1 -> cal += 20;
            case 2 -> cal += 70;
            case 3 -> cal += 100;
            case 4 -> cal += 65;
        }
        System.out.printf("O total de calorias da refeição é %d", cal);
    }

    public static int menuPrato(Scanner sc){
        System.out.println("Digite uma opção para o prato");
        System.out.println("1 - Vegetariano");
        System.out.println("2 - Peixe");
        System.out.println("3 - Frango");
        System.out.println("4 - Carne");
        return sc.nextInt();
    }

    public static int menuSobremesa(Scanner sc){
        System.out.println("Digite uma opção para o prato");
        System.out.println("1 - Abacaxi");
        System.out.println("2 – Sorvete diet");
        System.out.println("3 - Mouse diet");
        System.out.println("4 - Mouse chocolate");
        return sc.nextInt();
    }

    public static int menuBebidas(Scanner sc){
        System.out.println("Digite uma opção para o prato");
        System.out.println("1 - Chá");
        System.out.println("2 - Suco de laranja");
        System.out.println("3 - Suco de melão");
        System.out.println("4 - Refrigerante diet");
        return sc.nextInt();
    }
}
