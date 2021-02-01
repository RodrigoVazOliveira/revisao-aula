package br.dev.rvz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        boolean ePar = (11 % 2)  == 0;

        if (ePar)
            System.out.println("O número é par!");
        else
            System.out.println("O número é impar");
    }
}