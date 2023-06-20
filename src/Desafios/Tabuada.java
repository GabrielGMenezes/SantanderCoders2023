package Desafios;

import java.util.Scanner;

public class Tabuada{

    public static void main(String[] args) {
        int number = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Write a number of 1 to 10: ");
        int tabuada = entrada.nextInt();
        if (tabuada > 0 && tabuada <= 10) {
            for(int x = 0; x < 10; ++x) {
                ++number;
                int total = tabuada * number;
                System.out.print("" + tabuada + " x " + number + " = " + total + "\n");
            }
        } else {
            System.out.print("Reinicie e digite um valor válido");
        }

    }
}
