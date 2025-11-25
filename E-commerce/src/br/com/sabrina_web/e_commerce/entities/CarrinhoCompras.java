package br.com.sabrina_web.e_commerce.entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarrinhoCompras {
    private double valorTotalCompras;
    private List<Produto> produtos;

    public CarrinhoCompras() {
        this.produtos = new ArrayList<>();
    }

    public double getValorTotalCompras() {
        return valorTotalCompras;
    }


    public List<Produto> getProdutos() {
        return produtos;
    }

    public void calculaValorTotalCompra(){
        if (!produtos.isEmpty()){
            valorTotalCompras = produtos.stream().collect(Collectors.summingDouble(Produto::precoTotalProduto));
        }
    }
    public void mostraComprasRealizadas(){
        produtos.sort(Comparator
                .comparingDouble(Produto::precoTotalProduto));

        System.out.println("*************************");
        System.out.println("COMPRAS REALIZADAS: \n");
        produtos.forEach(p -> System.out.println(p.getNome() + " - " + p.precoTotalProduto()));
        System.out.println("\n*************************");
    }
}
