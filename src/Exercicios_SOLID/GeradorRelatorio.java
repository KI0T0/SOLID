package Exercicios_SOLID;


public class GeradorRelatorio {
    public String gerarRelatorioDeVendas(String nomeProduto, double valor, int quantidadeVendida) {

        double valorVendido = valor * quantidadeVendida;

        return "Relatório de Vendas Gerado: \n" +
                "Produto: " + nomeProduto + "\n" +
                "Valor Vendido: R$ " + valorVendido;
    }
}
