package exerciciosArrays;

/*
Faça um programa que leia 20 números inteiros aleatórios (de 0 a 100), e armazene-os num vetor.
Ao final mostre os números e seus sucessores.
 */

import java.util.Random;
import java.util.RandomAccess;

public class NumerosAleatorios {
    static void main() {
        Random random = new Random();
        int[] vetNumerosInteiros = new int[20];
        int numeroAleatorio;

        for (int i = 0 ; i < vetNumerosInteiros.length ; i++){
            numeroAleatorio = random.nextInt(100);
            vetNumerosInteiros[i] = numeroAleatorio;

            System.out.println(vetNumerosInteiros[i] + ", e seu sucessor: " + (vetNumerosInteiros[i] + 1));
        }
    }
}
