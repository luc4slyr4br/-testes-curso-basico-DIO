package estruturasDeRepeticao;

/*
Faça um programa que leia 5 números, e informe o maior e a média desses números.
 */

import java.util.Scanner;

public class MaiorEMedia {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int contador = 0;
        int maiorNumero = 0;
        int somaNumeros = 0;

        while (contador < 5){
            contador++;
            System.out.println("Informe um número inteiro qualquer");
            numero = scanner.nextInt();

            if (numero > maiorNumero) maiorNumero = numero;
            somaNumeros = somaNumeros + numero;
        }
        System.out.println("Maior número: " + maiorNumero);
        somaNumeros = (somaNumeros /contador);

        System.out.println("Média dos números: " + somaNumeros);
    }
}
