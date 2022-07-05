package poo3.pratica1.ex3;

public class Vaca extends Animal{

    public Vaca(String nome, TipoAlimentacao tipoAlimentacao) {
        super(nome, tipoAlimentacao);
    }

    @Override
    public void emitirSom() {
        System.out.println("Muuuu Muuuu");
    }
}
