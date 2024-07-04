package Exercicios_SOLID;

public class DescontoEstudante extends Desconto {

    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.9;

    }
}
