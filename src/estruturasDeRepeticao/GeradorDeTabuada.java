package estruturasDeRepeticao;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número interiro de 1 a 10.
O usuário deve informar qualquer número que ele deseje a tabuada. A saída deve ser algo parecido com:
Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

import java.util.Scanner;

public class GeradorDeTabuada {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        //int contador = 0;

        System.out.println("Informe o número que deseja saber a tabuada: ");
        int numero = scanner.nextInt();
        System.out.println("Tabuada de " + numero + ": ");

        /*for (int i = 1; i <= 10; i++){ posso fazer esse for sem a necessidade de um contador
            contador = i * numero;
            System.out.println(numero + " x " + i + " = " + contador);
        }*/

        for (int i = 1 ; i <= 10 ; i++ ){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
