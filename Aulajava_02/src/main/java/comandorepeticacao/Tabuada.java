package comandorepeticacao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tabuada = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d X %d = %d %n", i, tabuada, (tabuada * i));
        }

        System.out.println();
    }
}
