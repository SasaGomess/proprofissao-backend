package testando_variaveis;

public class Exemplo_5 {
    public static void main(String[] args) {
        Integer mes = 14;

        String nomeMes = "";

        try {
            switch (mes) {
                case 1 -> nomeMes = "Janeiro";
                case 2 -> nomeMes = "Fevereiro";
                case 3 -> nomeMes = "Março";
                case 4 -> nomeMes = "Abril";
                case 5 -> nomeMes = "Maio";
                case 6 -> nomeMes = "Junho";
                case 7 -> nomeMes = "Julho";
                case 8 -> nomeMes = "Agosto";
                case 9 -> nomeMes = "Setembro";
                case 10 -> nomeMes = "Outubro";
                case 11 -> nomeMes = "Novembro";
                case 12 -> nomeMes = "Dezembro";
                default -> throw new IllegalArgumentException("O mês é inválido");
            }
            
        System.out.println("É o mês de " + nomeMes);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
