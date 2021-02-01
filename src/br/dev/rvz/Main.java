package br.dev.rvz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        boolean ePar = (11 % 2)  == 0;

        if (10 % 2 == 1) {
            System.out.println("bugou");
        } else if (10 % 2 == 0) {
            System.out.println("o número é par");
        } else {
            System.out.println("sei la");
        }
    }
}