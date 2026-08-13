package exerciciosEstruturaDeRepeticaoMetodosEHeranca.exerciciosDeOrientacaoAObjeto;
/*
Crie objetos da classe "Carro". Use os métodos get/set, quando aplicáveis, para definir os valores dos atributos
e exibir estes valores "get". Passe também uma mensagem para o cáculo do total para encher o tanque.
 */
public class Main {
    static void main() {

    Carro carro1 = new Carro();

    carro1.setCor("Preto");
    carro1.setModelo("Fiat Uno Mile 1.0");
    carro1.setCapacidadeTanque(45);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.calcularValorParaEncherTanque(6.39));

    Carro carro2 = new Carro("Branco", "Fiat Uno Mile 1.4", 46);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
    }
}
