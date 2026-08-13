package exerciciosEstruturaDeRepeticaoMetodosEHeranca.exerciciosDeOrientacaoAObjeto;
/*
Defina um metodo para calcular o valor total para encher o tanque. Este deve receber como parâmetro, o valor
da gasolina. Faça também duas sobrecargas para o construtor.

Crie objetos da classe "Carro". Use os métodos get/set, quando aplicáveis, para definir os valores dos atributos
e exibir estes valores "get". Passe também uma mensagem para o cáculo do total para encher o tanque.
 */

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    Carro(){
    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    public double calcularValorParaEncherTanque (double valorDoLitroDeGasolina){
        return capacidadeTanque * valorDoLitroDeGasolina;
    }
}
