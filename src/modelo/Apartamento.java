package modelo;

public class Apartamento extends Financiamento{

    public Apartamento(){super.executarFinanciamento();}

    double taxaJurosMensal = getTaxaJurosAnual() / 12;
    int mesesFinanciamento = getPrazoFinanciamento() * 12;

    /*
    Fórmula para calcular o pagamento mensal do Financiamento de Apartamentos

            valorImovel * (1 + taxaMensal) ^ meses
            --------------------------------------
            (1 + taxaMensal) ^ meses - 1
     */

    @Override
    public double calcularPagamentoMensal(){
        return getValorImovel() * (Math.pow((1 + this.taxaJurosMensal), this.mesesFinanciamento)) / (Math.pow((1 + this.taxaJurosMensal), this.mesesFinanciamento - 1));
    }
}
