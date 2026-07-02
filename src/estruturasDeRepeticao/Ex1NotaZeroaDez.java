package estruturasDeRepeticao;

import java.util.Scanner;

/*
Faça um programa que peça uma nota de 0 a 10.
Mostre uma mensagem de erro caso o valor seja inválido e continue pedindo um valor correto.
 */
public class Ex1NotaZeroaDez {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número de 0 a 10");

        int nota = scanner.nextInt();

        while (nota > 10 || nota < 0){
            System.out.println("Valor inválido! Informe um número de 0 a 10");
            nota = scanner.nextInt();
        }
        System.out.println("Nota informada: " + nota);

        scanner.close();
    }
}
