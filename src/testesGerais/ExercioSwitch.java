package testesGerais;

/*
Com switch use String para a partir do dia da semana, exibir seu número. Ainda no switch, faça outro
exemplo onde, se uma variável inteira for entre 1 e 3 exibir o texto "Certo". Se for 4 exibir "Errado",
se for 5 "Talvez". Pra demais valores exibir "Valor indefinido".
*/

public class ExercioSwitch {
    static void main() {
        String diaSemana = "outro";
        int variavel = 6;

        switch (diaSemana){
            case "segunda":
                System.out.println("1");
                break;
            case "terça":
                System.out.println("2");
                break;
            case "quarta":
                System.out.println("3");
                break;
            case "quinta":
                System.out.println("4");
                break;
            case "sexta":
                System.out.println("5");
                break;
            case "sábado":
                System.out.println("6");
                break;
            case "domingo":
                System.out.println("7");
                break;
            default:
                System.out.println("Dia inválido");
        }

        switch (variavel){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
        }
    }
}
