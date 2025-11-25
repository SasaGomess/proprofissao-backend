package br.com.sabrina_web.e_commerce.app;

import br.com.sabrina_web.e_commerce.entities.CarrinhoCompras;
import br.com.sabrina_web.e_commerce.entities.CartaoCredito;
import br.com.sabrina_web.e_commerce.util.MenuOpcoes;

import java.util.Locale;
import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        CartaoCredito cartaoCredito = MenuOpcoes.menuCartao(sc);

        int resp;

        do {
            MenuOpcoes.menuComprar(carrinhoCompras, sc);
            cartaoCredito.calculaSaldo(carrinhoCompras.getValorTotalCompras());
            if (cartaoCredito.verificaSeLimiteAtingido(carrinhoCompras.getValorTotalCompras())) {
                break;
            }
            System.out.println("Digite 1 para continuar / e qualquer outro numero para sair");
            resp = sc.nextInt();

        } while (resp == 1);

        carrinhoCompras.mostraComprasRealizadas();
        System.out.printf("Saldo do Cartão: %.2f", cartaoCredito.getSaldoCartao());

        sc.close();
    }
}
