package exerciciosEstruturaDeRepeticaoMetodosEHeranca.exerciciosDeMetodos;

/*
Crie uma aplicação que resolva a seguinte situação:
A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde ou Boa noite.
 */

import java.time.LocalTime;

public class ExercioMetodoHoraDoDia {

    public LocalTime mostraHora (){
        LocalTime horarioLocal = LocalTime.now();
        int hora = horarioLocal.getHour();
        if (hora >= 18 && hora <= 23){
            System.out.println("Boa noite");
        } else if (hora >= 0 && hora <= 11) {
            System.out.println("Bom dia");
        } else {
            System.out.println("Boa tarde");
        }
        return horarioLocal;
    }

    static void main() {
        ExercioMetodoHoraDoDia horaDoDia = new ExercioMetodoHoraDoDia();
        horaDoDia.mostraHora();
        System.out.println(horaDoDia);
    }
}
