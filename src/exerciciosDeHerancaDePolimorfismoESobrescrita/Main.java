package exerciciosDeHerancaDePolimorfismoESobrescrita;

import exerciciosDeOrientacaoAObjeto.Carro;

import java.net.FileNameMap;

public class Main {
    static void main() {
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();// Upcast
        Funcionario vendedor = new Vendedor();// Upcast
        Funcionario faxineiro = new Faxineiro();// Upcast

        /* Gerente gerente1 = (Gerente) new Funcionario();// Aqui eu tenho downcast, entretanto ocorre
        um erro de execução pois o complilador não consegue "pegar" todas as informações da classe filha
        e "passar" para clase pai */
    }
}
