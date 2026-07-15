package estruturasDeRepeticao;
import javax.xml.transform.Source;
import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
Ex.: 5! = 120
 */

public class Fatorial {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número que deseja saber seu fatorial: ");
        int fatorial = scanner.nextInt();

        int multiplicacao = 1;

        for (int i = fatorial ; i >= 1 ; i--){
            multiplicacao *= i;
        }
        System.out.println(fatorial + "! = " + multiplicacao);

        /* A maneira abaixo também funciona, mas ficou mais complexa.
        int multiplicacao = fatorial;

        for (int i = 1; i < fatorial; i++){
            multiplicacao = (multiplicacao * (fatorial -i));
            System.out.println(multiplicacao);
        }
         */

    }
}
