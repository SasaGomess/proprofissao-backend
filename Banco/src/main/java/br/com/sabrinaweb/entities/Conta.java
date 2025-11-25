package br.com.sabrinaweb.entities;

import java.util.Random;

public class Conta {
    private final int numeroConta;
    private String titularConta;
    private double saldo;
    private boolean cartaoLiberado;

    public Conta(String titularConta, double saldo, Random random) {
        this.numeroConta = random.nextInt(100);
        this.titularConta = titularConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saque(double valorSaque) {
        if (valorSaque <= saldo){
            this.saldo -= valorSaque;
            System.out.println("O valor do saldo agora é: " + saldo);
        } else {
            throw new IllegalStateException("valor de saque inválido");
        }
    }
    public void liberaCartaoCredito(){

        if (saldo < 2500){
            throw new IllegalArgumentException("O saldo é menor do que 2500 portanto um cartão de crétido não pode ser liberado");
        }else if (cartaoLiberado){
            throw new IllegalArgumentException("");
        }else {
            System.out.println("Cartão de Crédito foi liberado!");
        }
    }
    public void emprestimo(double valorEmprestimo){
        if (saldo < 5000){
            throw new IllegalArgumentException("O valor do saldo atual é menor que 5000 e um emprestimo não pode ser realizado");
        }
        this.deposito(valorEmprestimo);
    }

    public void deposito(double valorDeposito) {
        if (valorDeposito <= 0) {
            throw new IllegalStateException("valor de depósito inválido");
        } else {
            this.saldo = valorDeposito;
            System.out.println("O valor do saldo agora é: " + saldo);
        }
    }

    public void verSaldo() {
        System.out.println("O numero da conta é " + numeroConta);
        System.out.println("Titular da conta é: " + titularConta);
        System.out.println("O saldo é " + saldo);
    }
}
