package app;

import java.util.Locale;
import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número e verifique se é impar ou par");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

    }
}
