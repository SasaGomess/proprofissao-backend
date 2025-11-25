package br.com.sabrina_web.e_commerce.entities;

public class CartaoCredito {
    private double limiteCartao;
    private double saldoCartao;

    public CartaoCredito(double limiteCartao){
         this.limiteCartao = limiteCartao;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public double getSaldoCartao() {
        return saldoCartao;
    }

    public void calculaSaldo(double valorCompra){
        if (valorCompra <= limiteCartao){
            this.saldoCartao = valorCompra;
            System.out.println("Compra Realizada");
        }
    }
    public boolean verificaSeLimiteAtingido(double valorCompra){
        if (saldoCartao == limiteCartao ){
            return true;
        } else if (valorCompra > limiteCartao) {
            System.out.println("Saldo Insuficiente!");
            return true;
        } else {
            return false;
        }
    }
}
