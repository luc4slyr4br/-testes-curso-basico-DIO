package testesGerais;

public class testesGerais {
    static void main() {
        
    }

    public double calcularDividaExponencial(    ){
        double valorDaParcela = 50.0;
        double valorMontante = 0.0;
        for (int x=1; x<=5; x++){
            double valorCalculado = valorDaParcela * x;
            valorMontante = valorMontante + valorCalculado;
            System.out.println(valorMontante);
        }
        return valorMontante;
    }
}
