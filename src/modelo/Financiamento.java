package modelo;

import util.InterfaceUsuario;


public class Financiamento extends InterfaceUsuario {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    //Construtor inserindo dados manuais
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    //Construtor solicitando dados ao usuário
    public Financiamento(){
        executarFinanciamento();
    }

    public double getValorImovel() {
        this.valorImovel = this.valor;
        return this.valorImovel;
    }

    public int getPrazoFinanciamento(){
        this.prazoFinanciamento = this.prazo;
        return this.prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        this.taxaJurosAnual = this.taxa;
        return this.taxaJurosAnual;
    }

    //Método para calcular o valor do pagamento mensal do financiamento
    public double calcularPagamentoMensal(){
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    //Método para calcular o valor total do financiamento
    public double calcularTotalFinanciamento(){
        return this.calcularPagamentoMensal() * (this.prazoFinanciamento * 12);
    }


    public void executarFinanciamento(){
        super.pedirValorImovel();
        super.pedirPrazoFinanciamento();
        super.pedirTaxaJurosAnual();
        System.out.println("-----------------------------------------------------------------------------------");
    }
}