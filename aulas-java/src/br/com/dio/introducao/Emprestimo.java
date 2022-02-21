package br.com.dio.introducao;

public class Emprestimo {

    public static void calcularEmprestimo(double valor, int parcelas){
        if(parcelas == 2){
            double valorFinal = valor + (valor * 0.3);
            System.out.println("Valor final do empréstimo para 2 parcelas: R$" + valorFinal);

        }else if(parcelas == 3){
            double valorFinal = valor + (valor * 0.45);
            System.out.println("Valor final do empréstimo para 3 parcelas: R$" + valorFinal);

        }else{
            System.out.println("Quantidade de parcelas não aceita");
        }
    }

}
