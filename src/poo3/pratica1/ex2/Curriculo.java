package poo3.pratica1.ex2;

import java.util.Set;

public class Curriculo extends Documentos{

    private Pessoa pessoa;
    private Set<String> habilidades;

    public Curriculo(String tipo, Pessoa pessoa, Set<String> habilidades) {
        super(tipo);
        this.pessoa = pessoa;
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "pessoa=" + pessoa +
                ", habilidades=" + habilidades +
                '}';
    }
}
