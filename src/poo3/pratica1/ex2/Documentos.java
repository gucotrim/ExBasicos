package poo3.pratica1.ex2;

public abstract class Documentos {
    private String tipo;

    public Documentos(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Documentos{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
