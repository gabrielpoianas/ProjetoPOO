package main;

import modelo.Financiamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Financiamento> listaFinanciamentos = new ArrayList<>();

        //System.out.print("Quantos financiamentos deseja realizar: ");
        listaFinanciamentos.add(new Financiamento());

        double somaImoveis = 0, somaFinanciamentos = 0;
        for(Financiamento financiamento : listaFinanciamentos){
            double totalFinanciado = financiamento.getValorImovel() / financiamento.getPrazoFinanciamento() * 12 * (1 + financiamento.getTaxaJurosAnual() / 12);
            System.out.printf("Financiamento - valor do imóvel: R$%.2f, valor do financiamento: R$%.2f\n", financiamento.getValorImovel(), totalFinanciado);
            somaImoveis += financiamento.getValorImovel();
            somaFinanciamentos += financiamento.calcularTotalFinanciamento();
        }
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("Valor total dos imóveis: R$%.2f, Valor total dos financiamentos: R$%.2f\n", somaImoveis, somaFinanciamentos);
        System.out.println("-----------------------------------------------------------------------------------");

    }
}