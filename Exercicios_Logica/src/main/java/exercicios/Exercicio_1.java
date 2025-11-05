package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("A soma dos valores é " + (n1 + n2));
        System.out.println("A subtração dos valores é " + (n1 - n2));
        System.out.println("A multiplicação dos valores é " + (n1 * n2));
        System.out.println("A divisão dos valores é " + (n1 / n2));
        sc.close();

    }
}
