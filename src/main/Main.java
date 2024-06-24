package main;

import modelo.Financiamento;
import util.InterfaceUsuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner mainScanner = new Scanner(System.in);

        List<Financiamento> listaFinanciamentos = new ArrayList<>();

        System.out.print("Quantos financiamentos deseja realizar: ");
        int quantidade = mainScanner.nextInt();

        while(quantidade !=0) {
            listaFinanciamentos.add(new Financiamento());
            quantidade--;
        }

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