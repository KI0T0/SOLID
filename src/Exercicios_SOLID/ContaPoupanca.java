package Exercicios_SOLID;

public class ContaPoupanca extends Conta {
    public double taxaDeJuros;

    public ContaPoupanca(double saldoInicial, double taxaDeJuros) {
        super(saldoInicial);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void aplicarJuros() {
        saldo += saldo * taxaDeJuros;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
}
