package poo3.pratica1.ex3;

public class Gato extends Animal{

    public Gato(String nome, TipoAlimentacao tipoAlimentacao) {
        super(nome, tipoAlimentacao);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau Miau");
    }
}
