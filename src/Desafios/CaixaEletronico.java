package Desafios;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner digitar = new Scanner(System.in);

        String opcaoSelecionada;
        double valor;
        double saldo = 0;
        Boolean encerrarPrograma = false;

        while(!encerrarPrograma){
            System.out.println("Menu de Operações:");
            System.out.println("'A' -> Mostrar Saldo:");
            System.out.println("'B' -> Realizar um depósito:");
            System.out.println("'C' -> Realizer Saque:");
            System.out.println("'D -> Encerrar Operações.");

            System.out.print("Digite a opção selecionada: ");
            opcaoSelecionada = digitar.nextLine();

            switch (opcaoSelecionada){
                case "a" :
                    System.out.println("Seu saldo atual é de: " + saldo + "\n");
                    break;
                case "b" :
                    System.out.print("Digite um valor para deposito: ");
                    valor = digitar.nextDouble();
                    saldo += valor;
                    System.out.println("Depósito realizado com Sucesso.");
                    System.out.println("Foi realizado um depósito de: " + valor + "\n");
                    break;
                case "c" :
                    System.out.print("Digite um valor para saque: ");
                    valor = digitar.nextDouble();
                    if (valor > saldo){
                        System.out.println("Saque não autorizado, saldo insuficiente.");
                    } else {
                        System.out.println("Saque realizado com Sucesso.");
                        saldo -= valor;
                        System.out.println("Foi realizado um saque de: " + valor + "\n");
                    }
                    break;
                case "d" :
                    encerrarPrograma = true;
                    System.out.println("Obrigado por utilizar nosso sistema de operações!");
                    break;
                default:
                    System.out.println("Digite uma opção válida. \n");
            }
            digitar.nextLine();
        }
        System.out.println("Programa Encerrado");
    }
}