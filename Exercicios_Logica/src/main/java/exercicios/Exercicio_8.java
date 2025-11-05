package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para mostrar a tabuada de 1 à 10");
        int tabuada = sc.nextInt();

        System.out.println("+++ TABUADA +++");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d %n",tabuada, i, (tabuada * i));
        }

        sc.close();
    }
}
