package entities;

import interfaces.PagamentoCartao;

public class CartaoBandeiraVisa implements PagamentoCartao {

    @Override
    public void pagamentoDebito() {
        System.out.println("Débito.");
        System.out.println("Pago com Visa.");
    }

    @Override
    public void pagamentoCredito() {
        System.out.println("Crédito.");
        System.out.println("Pago com Visa.");
    }
}
