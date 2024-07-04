package Exercicios_SOLID;


public class Relatorio {
    String relatorio;
    public void gerarRelatorioDeVendas(String nomeProduto, double valor, int quantidadeVendida) {
        // Calcular o valor total vendido
        double valorVendido = valor * quantidadeVendida;
        // Gerar o relatório
        relatorio = "Relatório de Vendas Gerado: \n" +
                "Produto: " + nomeProduto + "\n" +
                "Valor Vendido: R$ " + valorVendido;
    }


    public void imprimirRelatorio() {
        System.out.println("Imprimindo relatório...");
        System.out.println(relatorio);
    }

}



