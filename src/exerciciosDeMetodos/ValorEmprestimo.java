package exerciciosDeMetodos;

/*
Crie uma aplicação que resolva a seguinte situação:
Calcule o valor final de um emprestimo, a partir de um valor solicitado. Taxas e parcelas influenciam.
Defina arbritariamente as faixas que influenciam nos valores.
 */

import java.util.Scanner;

public class ValorEmprestimo {
    public double calcularValorEmprestimo (double valorEmprestimoRequerido, int numeroParcelas){
        double taxaJuros = 0;
        if (numeroParcelas <= 6){
            taxaJuros = 1.03;
        }else if (numeroParcelas >= 7 && numeroParcelas <= 11){
            taxaJuros = 1.06;
        }else {
            taxaJuros = 1.09;
        }
        return (valorEmprestimoRequerido * taxaJuros);
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        ValorEmprestimo valorEmprestimo = new ValorEmprestimo();

        System.out.println("Informe o valor que deseja pegar de empréstimo: ");
        double valorEmprestimoRequerido = scanner.nextDouble();

        System.out.println("Informe em quantas vezes pretende pagar: ");
        int numeroParcelas = scanner.nextInt();

        double valorFinal = valorEmprestimo.calcularValorEmprestimo(
                valorEmprestimoRequerido,
                numeroParcelas
        );

        valorEmprestimo.calcularValorEmprestimo(valorEmprestimoRequerido, numeroParcelas);
        System.out.println("Valor final do empréstimo: R$ " + valorFinal);
    }
}
