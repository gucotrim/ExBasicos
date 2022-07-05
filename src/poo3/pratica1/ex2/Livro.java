package poo3.pratica1.ex2;

public class Livro extends Documentos{

    private int numPaginas;
    private String autor;
    private String titulo;
    private String genero;

    public Livro(String tipo, int numPaginas, String autor, String titulo, String genero) {
        super(tipo);
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "numPaginas=" + numPaginas +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
