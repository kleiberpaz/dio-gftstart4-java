package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, soma = 0, maior = 0;

        for(int i = 1; i <= 5; i++) {
            System.out.print("Número [" + i + "]: ");
            numero = scan.nextInt();
            soma += numero;
            if(numero > maior){
                maior = numero;
            }
        }

        System.out.println("Maior número digitado = " + maior);
        System.out.print("Média dos 5 números = " + (double)soma/5);
    }
}
