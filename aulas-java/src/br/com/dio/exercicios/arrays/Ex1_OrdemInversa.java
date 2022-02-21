package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = {0, -5, 15, 50, 8, 4};

        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.println("vetor[" + i + "] = " + vetor[i]);
        }

        for(int i = (vetor.length - 1); i >= 0; i--){
            if(i != 0) System.out.print(vetor[i] + ",");
                else System.out.print(vetor[i]);
        }
    }
}
