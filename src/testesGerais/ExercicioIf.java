package testesGerais;
// Com if, exiba o nome do mês do ano, de acordo com seu número
// Faça um outro if, para verificar se o mês é julho, dezembro ou janeiro, para assim exibir o texto "Férias"

public class ExercicioIf {
    static void main() {
        int mesAno = 2;

        if (mesAno == 1){
            System.out.println("Janeiro");
        }else if (mesAno == 2){
            System.out.println("Fevereiro");
        }else if (mesAno == 3){
            System.out.println("Março");
        }else if (mesAno == 4){
            System.out.println("Abril");
        }else if (mesAno == 5){
            System.out.println("Maio");
        }else if (mesAno == 6){
            System.out.println("Junho");
        }else if (mesAno == 7){
            System.out.println("Julho");
        }else if (mesAno == 8){
            System.out.println("Agosto");
        }else if (mesAno == 9){
            System.out.println("Setembro");
        }else if (mesAno == 10){
            System.out.println("Outubro");
        }else if (mesAno == 11){
            System.out.println("Novembro");
        }else if (mesAno == 12){
            System.out.println("Dezembro");
        }else{
            System.out.println("Mês incorreto, informe um mês de 1 a 12");
        }

        switch (mesAno){
            case 1:
                System.out.println("férias");
                break;
            case 6:
                System.out.println("férias");
                break;
            case 12:
                System.out.println("férias");
                break;
        }
    }
}
