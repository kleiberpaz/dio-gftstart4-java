package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, fatorial = 1;

        System.out.print("Digite um número: ");
        n = scan.nextInt();

        for(int i = 1; i <= n; i++){
            fatorial *= i;
        }

        System.out.println("Fatorial de " + n + "! é igual a " + fatorial);
    }
}
