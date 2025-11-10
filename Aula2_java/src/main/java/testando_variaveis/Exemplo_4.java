package testando_variaveis;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("++++ Calculando IMC +++++");

        System.out.println("\nQual é o seu nome?: ");
        String nome = sc.nextLine();

        System.out.println("Qual é a sua altura?:");
        float altura = sc.nextFloat();

        System.out.println("Qual é o seu peso?: ");
        float peso = sc.nextFloat();

        var imc = peso / Math.pow(altura, 2);

        System.out.printf("\nO IMC de %s é %.2f",nome, imc);

        if (imc < 18.5){
            System.out.println("Você está abaixo do peso ideal!");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Você está no peso ideal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Você está com sobrepeso ");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Você está na Obesidade Grau 1");
        } else if (imc >= 35 &&  imc <= 39.9) {
            System.out.println("Você está na Obesidade Grau 2");
        }else {
            System.out.println("Você está na Obesidade Grau 3");
        }
    }
}
