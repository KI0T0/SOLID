package Exercicios_SOLID;

public class DescontoIdoso extends Desconto {

    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.85;

    }
}