package com.mycompany.desafio;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Juan";
        String tipoConta = "Corrente";
        double saldo = 1500.65;
        int opcao = 0;
        
        System.out.println("*************************");
        System.out.println("\nNome do cliente: "+nome);
        System.out.println("Tipo Conta: "+tipoConta);
        System.out.println("Saldo: "+saldo);
        System.out.println("\n*************************");
        
        String menu = """
                      1 - Consultar Saldo
                      2 - Depositar
                      3 - Transferir
                      4 - Sair
                      
                      """;
        
        Scanner leitura = new Scanner(System.in);
        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
            
            if (opcao == 1) {
                System.out.println("Esse é o seu saldo: "+saldo);
            } else if (opcao == 2) {                
                System.out.println("Qual o valor que deseja depositar? ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Esse é o seu novo saldo: R$"+saldo);                
            } else if (opcao == 3) {
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Você transferiu R$"+valor+ " e o seu novo saldo é: R$"+saldo);
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }            
        }
    }
}
