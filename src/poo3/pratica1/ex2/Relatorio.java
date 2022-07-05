package poo3.pratica1.ex2;

public class Relatorio extends Documentos{

    private String texto;
    private int numPaginas;
    private String autor;
    private String revisor;

    public Relatorio(String tipo, String texto, int numPaginas, String autor, String revisor) {
        super(tipo);
        this.texto = texto;
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "texto='" + texto + '\'' +
                ", numPaginas=" + numPaginas +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                '}';
    }
}
