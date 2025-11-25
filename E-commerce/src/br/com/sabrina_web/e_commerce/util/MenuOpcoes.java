package br.com.sabrina_web.e_commerce.util;

import br.com.sabrina_web.e_commerce.entities.CarrinhoCompras;
import br.com.sabrina_web.e_commerce.entities.CartaoCredito;
import br.com.sabrina_web.e_commerce.entities.Produto;

import java.util.Scanner;

public class MenuOpcoes {

    public static CartaoCredito menuCartao(Scanner sc){
        System.out.println("Digite o limite do cartão: ");
        double limite = sc.nextDouble();
        return new CartaoCredito(limite);
    }

    public static void menuComprar(CarrinhoCompras carrinhoCompras, CartaoCredito cartao ,Scanner sc){
        Produto produtoCadastrado = menuProduto(sc);
        if (cartao.)
        carrinhoCompras.getProdutos().add(produtoCadastrado);
        carrinhoCompras.calculaValorTotalCompra();

    }
    public static Produto menuProduto(Scanner sc){
        sc.nextLine();
        System.out.println("Digite a descricao do produto");
        String descricao = sc.nextLine();
        System.out.println("Digite o valor do produto");
        double valorProduto = sc.nextDouble();
        System.out.println("Digite a quantidade do produto");
        int valorQuantidade = sc.nextInt();
        return new Produto(descricao, valorProduto, valorQuantidade);
    }
}
