package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int aux;

        aux = v1;
        v1 = v2;
        v2 = aux;

        System.out.println("Os valores trocados são: " + "valor da primeira variavel agora é " + v1 +", e o valor da segunda variavel agora é" + v2);

        sc.close();
    }
}

