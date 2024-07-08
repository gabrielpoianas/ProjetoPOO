package modelo;

public class Casa extends Financiamento{

    public Casa(){super.executarFinanciamento();}

    @Override
    public double calcularPagamentoMensal(){
       return super.calcularPagamentoMensal() + 80;
    }

}
