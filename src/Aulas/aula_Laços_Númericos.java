package Aulas;

public class aula_Laços_Númericos {
    public static void main(String[] args) {
        int i;
        for(i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("\n");

        for(i = 1; i <= 10; ++i) {
            System.out.println("Tabuada: " + i);

            for(int j = 1; j <= 10; ++j) {
                System.out.println("" + i + " x " + j + " = " + i * j);
            }

            System.out.println("\n");
        }

    }
}
