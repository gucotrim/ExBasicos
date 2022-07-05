package poo3.pratica1.ex3;

public interface AlimentacaoAnimal {

    static void comer(Animal animal) {
        if(animal.getTipoAlimentacao().equals(TipoAlimentacao.CARNÍVORA)) {
            System.out.println(animal.getNome() + " - comer carne");
        } else {
            System.out.println(animal.getNome() + " - comer capim");
        }
    }
}
