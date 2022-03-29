package entities;

import enums.Operacao;

public class Produto {

    private String descricao;
    private double valorReal;
    private Operacao operacao;
    private double percentual;
    private double valorFinal;

    public Produto(String descricao, double valorReal, Operacao operacao, double percentual) {
        this.descricao = descricao;
        this.valorReal = valorReal;
        this.operacao = operacao;
        this.percentual = percentual;
    }

    public void aplicaDesconto(){
        if (operacao == Operacao.desconto){
            this.valorFinal = valorReal - (valorReal*percentual/100);
            System.out.printf("O valor final do produto é R$ %.2f", valorFinal);
        }else {
            this.valorFinal = valorReal + (valorReal*percentual/100);
            System.out.printf("O valor final do produto é R$ %.2f", valorFinal);
        }
    }
}
