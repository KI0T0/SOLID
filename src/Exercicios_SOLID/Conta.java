package Exercicios_SOLID;

public abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);
}
