package Exercicios_SOLID;

public class ImpressoraMultifuncional implements Impressao, Scanner, Fax {


    @Override
    public void faxearDocumento(String documento) {
     System.out.println("Está faxeando: " + documento);
    }

    @Override
    public void imprimirDocumento(String documento) {
     System.out.println("Está escaneando: " + documento);
    }

    @Override
    public void escanearDocumento(String documento) {
     System.out.println("Está imprimindo: " + documento);
    }
}