package comandorepeticacao;

import java.util.Scanner;

public class TesteFor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = sc.nextInt();

        int p = 0;
        int i = 0;

        for (int j = 0; j < 10; j++) {
            if (numero % 2 == 0){
                p++;
            }else {
                i++;
            }
        }

        System.out.println("Quantidade numeros pares "+ p);
        System.out.println("Quantidade numeros impares "+ i);
    }
}
