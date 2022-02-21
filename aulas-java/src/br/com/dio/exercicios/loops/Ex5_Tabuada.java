package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        boolean repeat;

        do {
            repeat = false;
            System.out.print("Exibir tabuada do (1 a 10): ");
            n = scan.nextInt();
            if (n < 0 || n > 10) {
                System.out.println("Valor inválido!");
                repeat = true;
            }
        }
        while (repeat);

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
