package poo3.pratica1.ex2;

public interface ImpressaoDeDocumentos {
    static void imprimir(Documentos doc) {
        System.out.println(doc.toString());
    }
}
