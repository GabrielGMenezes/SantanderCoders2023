package Aulas;

public class aula_Estruturas_Condicionais {
    public static void main(String[] args) {
        int nota = 90;
        String graduacao;
        if (nota >= 80) {
            graduacao = "A";
            System.out.println("Graduação A");
        } else if (nota < 80 && nota >= 60) {
            graduacao = "B";
            System.out.println("Graduação B");
        } else if (nota < 60 && nota >= 40) {
            graduacao = "C";
            System.out.println("Graduação C");
        } else if (nota < 40 && nota >= 0) {
            graduacao = "D";
            System.out.println("Graduação D");
        } else {
            graduacao = "null";
            System.out.println("Nota Inválida");
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno Aprovado");
                break;
            case "C":
                System.out.println("Aluno de Recuperação");
                break;
            case "D":
                System.out.println("Aluno Reprovado");
                break;
            default:
                System.out.println("Graduação Inválida");
        }

    }

}
