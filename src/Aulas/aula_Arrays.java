package Aulas;

import java.util.Arrays;

public class aula_Arrays {
    public static void main(String[] args) {
        int[] numeros = new int[]{1, 2, 3, 4, 5};
        System.out.println(numeros);

        for(int i = 0; i < numeros.length; ++i) {
            System.out.println(numeros[i]);
        }

        String[] letras = new String[]{"A", "B", "C", "D", "E"};
        System.out.println(Arrays.toString(letras) + "\n");
        int[] number = new int[]{10, 3, 15, 30, 6};
        int maior = number[0];
        int menor = number[0];
        int media = 0;

        for(int i = 0; i < number.length; ++i) {
            if (number[i] > maior) {
                maior = number[i];
            }

            if (number[i] < menor) {
                menor = number[i];
            }

            media += number[i];
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média dos números: " + media / number.length);
    }
}
