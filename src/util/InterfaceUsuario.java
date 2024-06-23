package util;

import java.util.Scanner;

public class InterfaceUsuario{
    Scanner scanner = new Scanner(System.in);


    public double pedirValorImovel(){
        double valor;
        do {
            System.out.println("Informe o valor do imóvel que deseja financiar: ");
            valor = scanner.nextDouble();
            if(valor <=0)
                System.out.println("O valor informado é inválido! O valor não pode ser negativo ou zero");

        }while (valor <= 0);
        return valor;
    }

    public int pedirPrazoFinanciamento(){
        int prazo;
        do{
            System.out.println("Informe o prazo do financiamento (em anos): ");
            prazo = scanner.nextInt();
            if(prazo <= 0 || prazo > 20)
                System.out.println("O prazo informado não é válido! O prazo não pode ser zero ou mais que 20 anos");

        } while (prazo <= 0 || prazo > 20);
        return prazo;
    }

    public double pedirTaxaJurosAnual(){
        double juros;
        do{
            System.out.println("Informe a taxa de juros anual do financiamento: ");
            juros = scanner.nextDouble();
            if(juros <= 0 || juros > 13)
                System.out.println("A taxa informada não é válida! Ela não pode ser zerada ou maior que 13%");

        }while(juros <= 0 || juros > 13);
        return juros;
    }
}