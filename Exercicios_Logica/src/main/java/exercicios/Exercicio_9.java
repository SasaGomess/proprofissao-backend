package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade em anos");
        int idadeAnos = sc.nextInt();

        System.out.println("Digite quantos meses");
        int idadeMeses = sc.nextInt();

        System.out.println("E digite quantos dias ");
        int idadeDias = sc.nextInt();

        int totalDias = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;

        System.out.printf("O total de dias que essa pessoa tem é: %d", totalDias) ;

        System.out.println();

    }
}
