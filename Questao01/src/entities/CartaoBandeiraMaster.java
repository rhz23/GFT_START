package entities;

import interfaces.PagamentoCartao;

public class CartaoBandeiraMaster implements PagamentoCartao {

    public CartaoBandeiraMaster() {
    }

    @Override
    public void pagamentoDebito() {
        System.out.println("Débito.");
        System.out.println("Pago com Master.");
    }

    @Override
    public void pagamentoCredito() {
        System.out.println("Crédito.");
        System.out.println("Pag com Master.");
    }
}
