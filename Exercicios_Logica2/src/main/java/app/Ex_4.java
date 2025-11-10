package app;

import java.util.Locale;
import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        var idade = sc.nextInt();

        if (idade < 16){
            System.out.println("Não eleitor");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Eleitor obigatório");
        } else if (idade >= 16 && idade < 18 || idade >= 65) {
            System.out.println("Eleitor facultativo");
        }
    }
}
