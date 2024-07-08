package modelo;

public class Terreno extends Financiamento{

    public Terreno(){super.executarFinanciamento();}

    @Override
    public double calcularPagamentoMensal(){
        //Adiciona 2% de juros ao pagamento mensal
       return super.calcularPagamentoMensal() * 1.02;
    }
}
