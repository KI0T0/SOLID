package Exercicios_SOLID;

public class DescontoNormal extends Desconto {


    @Override
    public double aplicarDesconto(double valor) {
        return valor;

    }
}