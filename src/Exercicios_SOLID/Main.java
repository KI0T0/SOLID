package Exercicios_SOLID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Exercícios SOLID
//                1º Exercício - SRP

//        Primeiro código, sem SRP
//        Relatorio produto = new Relatorio();
//        produto.gerarRelatorioDeVendas("Caneta", 5.00, 500);
//        produto.imprimirRelatorio();

//        Segundo código, com SRP

//        GeradorRelatorio gerador = new GeradorRelatorio();
//        String relatorio = gerador.gerarRelatorioDeVendas("Caneta", 5.00, 500);
//
//        ImprimeRelatorio imprime = new ImprimeRelatorio();
//        imprime.imprimirRelatorio(relatorio);


//                2º Exercício - OCP

//        Desconto descontoEstudante = new DescontoEstudante();
//        Desconto descontoNormal = new DescontoNormal();
//        Desconto descontoIdoso = new DescontoIdoso();
//
//
//        Pedido pedidoEstudante = new Pedido(100.0, descontoEstudante);
//        System.out.println("Valor com desconto para estudante: " + pedidoEstudante.calcularValorComDesconto());
//
//        Pedido pedidoIdoso = new Pedido(100.0, descontoIdoso);
//        System.out.println("Valor com desconto para idoso: " + pedidoIdoso.calcularValorComDesconto());
//
//        Pedido pedidoNormal = new Pedido(100.0, descontoNormal);
//        System.out.println("Valor para cliente normal: " + pedidoNormal.calcularValorComDesconto());
//
////                3º Exercício - LSP
//        Conta contaCorrente = new ContaCorrente(1000, 500);
//        realizarOperacoes(contaCorrente);
//
//        Conta contaPoupanca = new ContaPoupanca(1000, 0.05);
//        realizarOperacoes(contaPoupanca);
//    }
//
//    public static void realizarOperacoes(Conta conta) {
//        conta.depositar(200);
//        System.out.println("Saldo após depósito: " + conta.getSaldo());
//
//        conta.sacar(500);
//        System.out.println("Saldo após saque: " + conta.getSaldo());
//
//        if (conta instanceof ContaPoupanca) {
//            ((ContaPoupanca) conta).aplicarJuros();
//            System.out.println("Saldo após aplicação de juros: " + conta.getSaldo());
//        }
//

//                4º Exercício - ISP


//        ImpressoraMultifuncional impressora = new ImpressoraMultifuncional();
//
//        impressora.imprimirDocumento("Documento para impressão");
//        impressora.escanearDocumento("Documento para escaneamento");
//        impressora.faxearDocumento("Documento para fax");

//                5º Exercício - DIP

//        MetodoPagamento cartaoCredito = new CartaoCredito();
//        SistemaPagamento sistema = new SistemaPagamento(cartaoCredito);
//        sistema.processarPagamento(100.0);
//
//        MetodoPagamento paypal = new PayPal();
//        sistema = new SistemaPagamento(paypal);
//        sistema.processarPagamento(50.0);











    }


}