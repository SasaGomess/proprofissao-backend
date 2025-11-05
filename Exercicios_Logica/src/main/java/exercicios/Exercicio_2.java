package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio de um círculo para o cálculo");
        float raio = sc.nextFloat();

        System.out.printf("A área do círculo é %.2f %n", (Math.PI * Math.pow(raio, 2)));
        System.out.printf("O perímetro do círculo é %.2f %n", (2 * Math.PI * raio));

        sc.close();
    }
}
