package org.example.teste_poo;

public class Caneta {
    /*Definindo atributos da caneta*/
    private String cor;
    private String modelo;
    private int tamanho;
    private float ponta;
    private boolean tampada;
    private int carga;

    /*Criação dos métodos da caneta*/

    public void rabiscar(){
        this.destampar();

        if (this.carga > 0){
            System.out.println("Rabiscando...");
        }else {
            System.out.println("Não é possível rabiscar");
        }
    }

    public void desenhar(){
        this.destampar();
        if (carga > 0){
            System.out.println("Desenhando...");
        }else {
            System.out.println("Não é possivel commitar");
        }

    }

    public void destampar(){
        if (tampada == true){
            this.tampada = false;
        }
    }


    public void tampar(){
        if (tampada == false){
            this.tampada = true;
        }
    }

    public void estado(){
        System.out.printf("Essa caneta é do modelo: %s %nTem a cor %s, %nTem a carga de %d, %nTem a ponta: %.2f, %nEsta: %s %n", this.modelo, this.cor, this.carga, this.ponta, this.tampada ? "está tampada" : "não está tampada");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
