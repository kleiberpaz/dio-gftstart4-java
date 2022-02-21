package br.com.dio.introducao;

public class Main {
    public static void main(String[] args) {
        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(1, 2);
        Calculadora.subtracao(3, 3);
        Calculadora.multiplicacao(4, 5);
        Calculadora.divisao(3, 7);

        // Mensagem
        System.out.println("\nExercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("\nExercício empréstimo");
        Emprestimo.calcularEmprestimo(1000, 2);
        Emprestimo.calcularEmprestimo(1000, 3);
        Emprestimo.calcularEmprestimo(1000, 4);

        // Quadrilátero (retorno)
        System.out.println("\nExercício quadrilátero (sobrecarga): ");
        System.out.println("Área do quadrado = " + Quadrilatero.area(4));
        System.out.println("Área do retângulo = " + Quadrilatero.area(5d, 6d));
        System.out.println("Área do trapézio = " + Quadrilatero.area(7,8,9));
        System.out.println("Área do losango = " + Quadrilatero.area(4f, 5f));
    }
}
