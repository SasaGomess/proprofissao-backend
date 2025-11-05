package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário");
        double salario = sc.nextDouble();

        float comissao = 0.15f;

        double valorAumento = salario * comissao;

        System.out.printf("O valor do salario com aumento é R$ %.2f", (valorAumento + salario));

        sc.close();
    }
}
