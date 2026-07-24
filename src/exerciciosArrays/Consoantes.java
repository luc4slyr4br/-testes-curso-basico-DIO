package exerciciosArrays;

/*
Faça um programa que leia um vetor de 6 caracteres e diga quantas consoantes foram lidas, e
imprima as consoantes.
 */

import java.util.Scanner;

public class Consoantes {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String[] vetConsoante = new String[6];
        int quantidadeConsoantes = 0;
        int contador = 0;


        for (int i = 1 ; i <= vetConsoante.length; i++){
            System.out.println("Informe uma letra de A a Z: ");
            String vetConsoantes = scanner.next();
            if ( !(vetConsoantes.equalsIgnoreCase("a")||
                    vetConsoantes.equalsIgnoreCase("e")||
                    vetConsoantes.equalsIgnoreCase("i")||
                    vetConsoantes.equalsIgnoreCase("o")||
                    vetConsoantes.equalsIgnoreCase("u"))){

                vetConsoante[contador] = vetConsoantes;
                quantidadeConsoantes++;
            }
            contador++;
        }
        System.out.println("Consoantes: " );
        for( String consoante : vetConsoante){
            if (consoante != null)
                System.out.println(consoante + " ");

        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
    }
}
