package br.com.sabrinaweb.utils;

import br.com.sabrinaweb.entities.Conta;

import java.util.Scanner;

public class MenuConta {

    private final static Scanner scanner = new Scanner(System.in);

    public static void exibirMenu(){
        System.out.println("Escolha sua opção desejada: ");
        System.out.println("1) Ver saldo");
        System.out.println("2) Fazer deposito");
        System.out.println("3) Sacar");
        System.out.println("4) Emprestimo");
        System.out.println("5) Liberar Cartão de Crédito");
        System.out.println("6) Finalizar");
    }

    public static void iniciarMenu(Conta conta){


        var resp = 0;

        while (resp != 4){
            exibirMenu();
            resp = scanner.nextInt();
            scanner.nextLine();

            switch (resp){
                case 1:
                  conta.verSaldo();
                  break;
                case 2:
                    System.out.println("Digite o valor de deposito");
                    double deposito = scanner.nextDouble();
                    conta.deposito(deposito);
                    break;
                case 3:
                    System.out.println("Digite o valor do saque");
                    double saque = scanner.nextDouble();
                    conta.saque(saque);
                    break;
                case 4:
                    System.out.println("Digite o valor de emprestimo");
                    double emprestimo = scanner.nextDouble();
                    conta.emprestimo(emprestimo);
                    break;
                case 5:
                    conta.liberaCartaoCredito();
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    throw new IllegalArgumentException("Digite um valor válido do menu de opções. Tente novamente mais tarde");
            }
        }
    }
}
