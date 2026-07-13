package estruturasDeRepeticao;
import java.util.Scanner;

/*
Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares,
e a quantidade de números ímpares.
 */

public class ParEImpar {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int numeros = 0;
        int pares = 0;
        int impares = 0;
        int quantidadeNumeros = 0;

        System.out.println("Informe a quantidade de números: ");
        quantidadeNumeros = scanner.nextInt();

        while (count < quantidadeNumeros){
            System.out.println("Informe um número interiro qualquer: ");
            numeros = scanner.nextInt();

            count++;

            if (numeros % 2 == 0) pares++;
            else impares++;
        }
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
