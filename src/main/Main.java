package main;

import modelo.Financiamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Financiamento> listaFinanciamentos = new ArrayList<>();

        listaFinanciamentos.add(new Financiamento(450000,4,7.45));
        listaFinanciamentos.add(new Financiamento(158900,15,11.45));
        listaFinanciamentos.add(new Financiamento(860000,2,7.96));
        listaFinanciamentos.add(new Financiamento(50000,20,12.50));

        double somaImoveis = 0, somaFinanciamentos = 0;
        for(Financiamento financiamento : listaFinanciamentos){
            System.out.printf("Financiamento - valor do imóvel: R$%.2f, valor do financiamento: R$%.2f\n", financiamento.getValorImovel(), financiamento.calcularTotalFinanciamento());
            somaImoveis += financiamento.getValorImovel();
            somaFinanciamentos += financiamento.calcularTotalFinanciamento();
        }
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("Valor total dos imóveis: R$%.2f, Valor total dos financiamentos: R$%.2f\n", somaImoveis, somaFinanciamentos);
        System.out.println("-----------------------------------------------------------------------------------");




    }
}