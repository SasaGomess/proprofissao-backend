package comandorepeticacao;

import java.util.Scanner;

public class TesteWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = sc.nextInt();

        int n = 0;
        int p = 0;
        int i = 0;

        while (n <= 10){
            if (numero % 2 == 0){
                p++;
            }else {
                i++;
            }
            n++;
        }
        System.out.println("Quantidade numeros pares "+ p);
        System.out.println("Quantidade numeros impares "+ i);
    }
}
