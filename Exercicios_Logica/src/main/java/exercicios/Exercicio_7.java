package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de depósito: ");
        double depositoMensal = sc.nextDouble();
        System.out.println("Digite o valor da taxa de juros mensal em %: ");
        double taxaJurosMensal = sc.nextDouble();


        double juros = depositoMensal * (taxaJurosMensal / 100) * 12;

        double montante = depositoMensal + juros;

        System.out.printf("O valor do montante é R$ %.2f", montante);

        sc.close();
    }
}
