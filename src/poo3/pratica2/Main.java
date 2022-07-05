package poo3.pratica2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Garagem garagem = new Garagem(List.of(
                new Veiculo("Fiesta", "Ford", 1000D),
                new Veiculo("Focus", "Ford", 1200D),
                new Veiculo("Explorer", "Ford", 2500D),
                new Veiculo("Uno", "Fiat", 500D),
                new Veiculo("Cronos", "Fiat", 1000D),
                new Veiculo("Torino", "Fiat", 1250D),
                new Veiculo("Aveo", "Chevrolet", 1250D),
                new Veiculo("Spin", "Chevrolet", 2500D),
                new Veiculo("Corola", "Toyota", 1200D),
                new Veiculo("Fortuner", "Toyota", 3000D),
                new Veiculo("Logan", "Renault", 950D)
        ));


        garagem.getVeiculos().stream().sorted((x,y) -> x.getPreco().compareTo(y.getPreco())).forEach(System.out::println);
        System.out.println();

        garagem.getVeiculos().stream().sorted((x,y) -> x.getMarca().compareTo(y.getMarca())).forEach(System.out::println);
        System.out.println();

        garagem.getVeiculos().stream().filter(v -> v.getPreco() < 1000).forEach(System.out::println);
        System.out.println();

        garagem.getVeiculos().stream().filter(v -> v.getPreco() >= 1000).forEach(System.out::println);
        System.out.println();

        System.out.println(
                garagem.getVeiculos().stream().mapToDouble(v -> v.getPreco()).average()
        );
        System.out.println();


    }
}
