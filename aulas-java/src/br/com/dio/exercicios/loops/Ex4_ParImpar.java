package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, numero, pares = 0, impares = 0;

        System.out.print("Digite a quantidade de números: ");
        n = scan.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            numero = scan.nextInt();
            if(numero % 2 == 0) pares++;
                else impares++;
        }

        System.out.println("Quantidade de números pares = " + pares);
        System.out.println("Quantidade de números ímpares = " + impares);
    }
}
