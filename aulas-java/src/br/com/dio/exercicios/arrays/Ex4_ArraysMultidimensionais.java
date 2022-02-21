package br.com.dio.exercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ex4_ArraysMultidimensionais {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                int numero = random.nextInt(9);
                M[i][j] = numero;
            }
        }

        for(int[] linha : M){
            for(int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
