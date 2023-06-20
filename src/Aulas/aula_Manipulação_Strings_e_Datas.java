package Aulas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class aula_Manipulação_Strings_e_Datas {
    public static void main(String[] args) {
        String nome = "Gabriel";
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek());
        Locale brasil = new Locale("pt", "BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        System.out.println(diaSemana);
        LocalTime agora = LocalTime.now();
        System.out.println(agora);
        String saudacao;
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom Dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa Tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa Noite";
        } else {
            saudacao = "Você está fora da Atmosfera";
        }

        System.out.printf("Olá %s , Hoje é %s , %s", nome, diaSemana, saudacao);
    }

}
