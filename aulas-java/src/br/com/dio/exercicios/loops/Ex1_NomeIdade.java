package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.print("Nome: ");
            nome = scan.nextLine();
            if (nome.equals("0")) break;
            System.out.print("Idade: ");
            idade = scan.nextInt();
        }
    }
}
