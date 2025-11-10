package app;

import java.util.Locale;
import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] n = new int[3];

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        for (int i = n.length - 1; i >= 0 ; i--) {
            System.out.println(n[i]);
        }
    }
}
