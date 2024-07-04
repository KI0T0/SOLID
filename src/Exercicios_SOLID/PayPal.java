package Exercicios_SOLID;

public class PayPal implements MetodoPagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com PayPal.");
    }
}

