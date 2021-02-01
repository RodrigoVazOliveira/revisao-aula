package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        * Estrutura de repetição
        *
        * */
        boolean continuar = true;
        int number = 0;
        while (continuar) {
            System.out.println(number);
            number++;
            if (number == 10)
                continuar = false;
        }

        number = 0;
        continuar = true;
        System.out.println("");
        do {
            System.out.println(number);
            number++;
            if (number == 10)
                continuar = false;
        } while (continuar);


        /*
        *  usando for e foreach
        * */

        for (int i = 0; i < 13; i++) {
            System.out.println("O número no for é: " + i);
        }

         /*
         *  for eeach
         *
         * */
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            numbers.add(i);
        }

        /*
        *  Listando com for each
        * */

        for (Integer n : numbers) {
            System.out.println("lista de números: " + n);
        }

    }
}