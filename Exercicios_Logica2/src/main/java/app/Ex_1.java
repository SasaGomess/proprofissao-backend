package app;

import java.util.Locale;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 10 == 0){
            System.out.println("É divisivel por 10");
        } else if (n % 5 == 0) {
            System.out.println("É divisivel por 5");
        } else if (n % 2 == 0){
            System.out.println("É divisivel por 2");
        }else {
            System.out.println("Não é divisível por nenhum");
        }

    }
}
