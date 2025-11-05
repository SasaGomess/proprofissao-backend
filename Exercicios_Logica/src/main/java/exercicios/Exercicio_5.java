package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário base");
        double salarioBase = sc.nextDouble();

        float comissao = 0.05f;

        double valorAumento = salarioBase * comissao;

        System.out.printf("O valor do salario liquido é R$%.2f", (valorAumento + salarioBase));

        sc.close();
    }
}
