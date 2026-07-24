package exerciciosArrays;

import java.util.Random;

/*
Gere e imprima um matriz 4x4 com valores aleatórios entre 0 e 9.
 */
public class ArrayMultidimensional {
    static void main() {
        Random random = new Random();
        int[][] matriz4x4 = new int[4][4];

        for (int i = 0; i < matriz4x4.length; i++) {
            for (int j = 0; j < matriz4x4[i].length; j++) {
                matriz4x4[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : matriz4x4){
            for (int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
