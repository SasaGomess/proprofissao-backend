package app;

import java.util.Locale;
import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o saldo médio do último ano");
        var saldoMedio = sc.nextInt();
        double credito = 0;
        double valorCredito = 0;

        if(saldoMedio <= 500){
            valorCredito = 0;
        }else if(saldoMedio <= 1000){
            credito = 0.30;
            valorCredito = credito * saldoMedio;
        }else if(saldoMedio <= 3000){
            credito = 0.40;
            valorCredito = credito * saldoMedio;
        }else if(saldoMedio > 3000){
            credito = 0.50;
            valorCredito = credito * saldoMedio;
        }
        System.out.printf("O valor do saldo médio é %d e do crédito concedido é %.2f", saldoMedio, valorCredito);
    }
}
