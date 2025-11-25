package br.com.sabrinaweb.app;

import br.com.sabrinaweb.entities.Conta;
import br.com.sabrinaweb.utils.MenuConta;

import java.util.Random;

public class Banco {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Debora Paixão", 500, new Random());
        MenuConta.iniciarMenu(conta1);
    }
}
