package br.com.sabrina_web.e_commerce.entities;

public class Produto {
    private String nome;
    private Double valorCompra;
    private int quantidade;

    public Produto(String nome, Double valorCompra, int quantidade) {
        this.nome = nome;
        this.valorCompra = valorCompra;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public double precoTotalProduto(){
        return valorCompra * quantidade;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s com preço %.2f", nome, valorCompra);
    }
}
