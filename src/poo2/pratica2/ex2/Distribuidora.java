package poo2.pratica2.ex2;

public class Distribuidora {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[2];

        Pereciveis p1 = new Pereciveis("Arroz", 46.50, 3);
        NaoPereciveis p2 = new NaoPereciveis("Camiseta básica", 30.00, "Fashion");

        produtos[0] = p1;
        produtos[1] = p2;

        for(Produto p : produtos) {
            System.out.println("Preço total de 5 itens de " + p.getNome() + " : R$ " + p.calcular(5));
        }
    }
}
