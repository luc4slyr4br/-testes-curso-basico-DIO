package exerciciosEstruturaDeRepeticaoMetodosEHeranca.exerciciosDeMetodos;

import java.util.Scanner;

/*
Crie uma aplicação que calcule a área de 3 quadriláteros notáveis: quadrado, retângulo e trapézio.
 */
public class AreaQuadrilatero {
    public double calcularAreaQuadrilatero(double base, double altura){
        return base * altura;
    }
    public double calcularAreaQuadrilatero(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor) * altura)/2;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        AreaQuadrilatero areaQuadrilatero = new AreaQuadrilatero();

        System.out.println("Informe a medida da base do quadrado: ");
        double baseQuadrado = scanner.nextDouble();

        System.out.println("Informe a medida da altura do quadrado: ");
        double alturaQuadrado = scanner.nextDouble();

        System.out.println("Informe a medida da base maior do trapézio: ");
        double baseMaiorTrapezio = scanner.nextDouble();

        System.out.println("Informe a medida da base menor do trapézio: ");
        double baseMenorTrapezio = scanner.nextDouble();

        System.out.println("Informe a medida da altura do trapézio: ");
        double alturaTrapezio = scanner.nextDouble();

        double areaQuadrado = areaQuadrilatero.calcularAreaQuadrilatero(baseQuadrado, alturaQuadrado);
        System.out.println(areaQuadrado);

        double areaTrapezio = areaQuadrilatero.calcularAreaQuadrilatero(baseMaiorTrapezio, baseMenorTrapezio, alturaTrapezio);
        System.out.println(areaTrapezio);
    }
}
