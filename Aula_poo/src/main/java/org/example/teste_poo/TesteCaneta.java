package org.example.teste_poo;


public class TesteCaneta {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();

        caneta1.setCor("Azul");
        caneta1.setModelo("Esferográfica");
        caneta1.setPonta(0.5f);
        caneta1.setCarga(90);
        /*caneta1.setTampada(false); */

        caneta1.estado();

        caneta1.rabiscar();

        Caneta caneta2 = new Caneta();

    }
}
