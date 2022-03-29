package application;

import entities.Produto;

import static enums.Operacao.acrescimo;
import static enums.Operacao.desconto;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto("TV", 2000.00, desconto , 20.00);
        p1.aplicaDesconto();

        System.out.println("\n");

        Produto p2 = new Produto("PS5", 3000.00, acrescimo , 10.00);
        p2.aplicaDesconto();
    }
}
