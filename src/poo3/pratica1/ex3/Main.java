package poo3.pratica1.ex3;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Loki", TipoAlimentacao.CARNÍVORA);
        Vaca vaca = new Vaca("Mumu", TipoAlimentacao.HERBÍVORA);
        Cachorro cachorro = new Cachorro("Thor", TipoAlimentacao.CARNÍVORA);

        System.out.println(gato.getNome());
        gato.emitirSom();
        gato.comer();
        System.out.println();

        System.out.println(vaca.getNome());
        vaca.emitirSom();
        vaca.comer();
        System.out.println();

        System.out.println(cachorro.getNome());
        cachorro.emitirSom();
        cachorro.comer();
        System.out.println();

    }
}
