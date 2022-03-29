package application;

import entities.CartaoBandeiraMaster;
import entities.CartaoBandeiraVisa;

public class Main {

    public static void main(String[] args) {

        CartaoBandeiraVisa v1 = new CartaoBandeiraVisa();
        v1.pagamentoCredito();
        System.out.println();
        v1.pagamentoDebito();

        System.out.println("\n");

        CartaoBandeiraMaster m1 = new CartaoBandeiraMaster();
        m1.pagamentoCredito();
        System.out.println();
        m1.pagamentoDebito();


    }
}
