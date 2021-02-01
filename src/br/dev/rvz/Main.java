package br.dev.rvz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


        /*
        * HashMap com foreach
        * */

        HashMap<String, String> listaComida = new HashMap<>();
        listaComida.put("vinicius", "batata");
        listaComida.put("thiago", "strogonoff");
        listaComida.put("rodrigo", "molho de batata");

        for (Map.Entry<String, String> value : listaComida.entrySet()) {
            System.out.println(value);
        }

        System.out.println("com foreach do propio metodo da hash");
        listaComida.forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });
    }

}