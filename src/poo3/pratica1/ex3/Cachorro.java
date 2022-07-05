package poo3.pratica1.ex3;

public class Cachorro extends Animal {

    public Cachorro(String nome, TipoAlimentacao tipoAlimentacao) {
        super(nome, tipoAlimentacao);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au");
    }
}
