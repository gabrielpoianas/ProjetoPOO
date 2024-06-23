package modelo;

import util.InterfaceUsuario;

public class Financiamento extends InterfaceUsuario {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public double getValorImovel() {
        this.valorImovel =  super.pedirValorImovel();
        return this.valorImovel;
    }

    public int getPrazoFinanciamento(){
        this.prazoFinanciamento = super.pedirPrazoFinanciamento();
        return this.prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        this.taxaJurosAnual = super.pedirTaxaJurosAnual();
        return this.taxaJurosAnual;
    }

    //Método para calcular o valor do pagamento mensal do financiamento
    public double calcularPagamentoMensal(){
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    //Método para calcular o valor total do financiamento
    public double calcularTotalFinanciamento(){
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

    //Método para mostrar mensagem na tela com os dados do financiamento (valor total do financiamento e valor do imóvel)
    public void mostrarDadosFinanciamento(){
        System.out.print("Valor do imóvel: R$" + this.valorImovel + ", valor do financiamento: R$" + this.calcularTotalFinanciamento());
    }

    public void executarFinanciamento(){
        this.getValorImovel();
        this.getPrazoFinanciamento();
        this.getTaxaJurosAnual();
        this.mostrarDadosFinanciamento();
    }
}