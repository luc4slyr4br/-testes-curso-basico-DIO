package estruturasDeRepeticao;
/*
Faça um programa que leia um conjunto de dois valores, o primeiro representando o nome do aluno e o segundo
sua idade. O programa deve ser interrompido ao inserir "0" no campo nome
 */

import javax.xml.transform.Source;
import java.util.Scanner;

public class NomeEIdade {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        while (true){
            System.out.println("Informe o nome do aluno");
            nome = scanner.next();
            if (nome.equals("0"))break;

            System.out.println("Informe a idade do aluno");
            idade = scanner.nextInt();

        }

        System.out.println("Nome: " + nome + " Idade: " + idade);

        Scanner close;
    }
}
