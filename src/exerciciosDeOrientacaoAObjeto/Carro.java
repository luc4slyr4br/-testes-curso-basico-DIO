package exerciciosDeOrientacaoAObjeto;
/*
Defina um metodo para calcular o valor total para encher o tanque. Este deve receber como parâmetro, o valor
da gasolina. Faça também duas sobrecargas para o construtor.
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


    public double calcularValorParaEncherTanque (int valorDoLitroDeGasolina){
        return capacidadeTanque * valorDoLitroDeGasolina;
    }
}
