package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da altura do triângulo: ");
        float altura = sc.nextFloat();

        System.out.println("Digite o valor da base do triângulo: ");
        float base = sc.nextFloat();

        System.out.printf("A área do triângulo é: %.2f %n", base * altura);

        sc.close();
    }
}
