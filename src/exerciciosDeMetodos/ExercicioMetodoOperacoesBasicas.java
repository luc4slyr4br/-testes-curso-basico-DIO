package exerciciosDeMetodos;

/*
Crie uma aplicação que resolva a seguinte situação: calcule as 4 operações básicas:
soma, subtração, multiplicação, e divisão. Sempre dois valores devem ser passados.
 */

import java.util.Scanner;

public class ExercicioMetodoOperacoesBasicas {
    double num1 = 0;
    double num2 = 0;

    public static double calcularSoma (double num1, double num2){
        return num1 + num2;
    }
    public static void calcularSomaVoid (double num1, double num2){
        double resultado = num1 + num2;
        System.out.println("Soma " + num1 + " + " + num2 + " = " + resultado);
    }/*
    Neste outro exemplo "calcularSomaVoid" eu faço o meu metodo sem retorno, void, que imprime o
     resultado diretamente no metodo, e não necessita que eu imprima diretamente no main, entretanto
     não consigo manipular posteriormente os valores de num1 e num2 dentro do main.
     */
    public static double calcularsubtracao (double num1, double num2){
        return num1 - num2;
    }
    public static double calcularMultiplicacao (double num1, double num2){
        return num1 * num2;
    }
    public static double calculardDivisao (double num1, double num2){
        return num1 / num2;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe dois números para saber suas 4 operações básicas: ");
        ExercicioMetodoOperacoesBasicas exercicioMetodoOperacoesBasicas = new ExercicioMetodoOperacoesBasicas();
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Soma " + num1 + " + " + num2 + " = " + calcularSoma(num1, num2));
        ExercicioMetodoOperacoesBasicas.calcularSomaVoid(num1, num2);
        System.out.println("Subtração " + num1 + " - " + num2 + " = " + calcularsubtracao(num1, num2));
        System.out.println("Multiplicação " + num1 + " x " + num2 + " = " + calcularMultiplicacao(num1, num2));
        System.out.println("Divisão " + num1 + " / " + num2 + " = " + calculardDivisao(num1, num2));
    }
}
