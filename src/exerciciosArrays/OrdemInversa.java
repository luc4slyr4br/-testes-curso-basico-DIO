package exerciciosArrays;
/*
Crie um vetor de 6 números inteiros e mostre a ordem inversa.
 */
public class OrdemInversa {
    static void main() {
        int[] vetorOrdemNormal = {-5, -6, 15, 50, 8, 4};
        int[] vetorOrdemInversa = {1, 2, 3, 4, 5, 6};
        int contadorVetorNormal = 0;

        System.out.print("Vetor de ordem normal: ");
        while (contadorVetorNormal < (vetorOrdemNormal.length)){
            System.out.print(vetorOrdemNormal[contadorVetorNormal] + " ");
            contadorVetorNormal++;
        }

        System.out.println(vetorOrdemInversa.length);

        System.out.print("Vetor de ordem inversa: ");
        for (int i = (vetorOrdemInversa.length -1); i >= 0; i--){
            System.out.print(vetorOrdemInversa[i] + " ");
        }
    }
}
