package testando_variaveis;
import java.util.Locale;
import java.util.Scanner;
public class Exemplo_3 {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float nota3;

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota");
        nota2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota");
        nota3 = scanner.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A media das notas é %.2f", media);

        if (media >= 6 ){
            System.out.println("Você está aprovado");
        } else if (media >= 5) {
            System.out.println("Você está de recuperação");
        }else {
            System.out.println("Você está reprovado");
        }
    }
}
