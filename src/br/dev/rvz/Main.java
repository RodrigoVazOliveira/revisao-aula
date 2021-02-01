package br.dev.rvz;

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

    }
}