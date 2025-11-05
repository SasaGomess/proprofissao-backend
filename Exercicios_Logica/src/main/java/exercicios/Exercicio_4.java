package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;

        System.out.println("Digite a primeira nota");
        nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota");
        nota2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota");
        nota3 = scanner.nextFloat();

        float media = (nota1 * 2) + (nota2 * 3) + (nota3 * 5) / 10;

        System.out.printf("A media das notas é %.2f", media);
        scanner.close();
    }
}
