package Exercicios_SOLID;

public class Pedido {
    private double valor;
    private Desconto desconto;

    public Pedido(double valor, Desconto desconto) {
        this.valor = valor;
        this.desconto = desconto;
    }

    public double calcularValorComDesconto() {
        return desconto.aplicarDesconto(valor);
    }
}
