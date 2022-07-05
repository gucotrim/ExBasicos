package poo1.pratica1;

public class Main {
    public static void main(String[] args) {
        String[] cidades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int indiceCidadeMenorTemp = 0;
        int indiceCidadeMaiorTemp = 0;

        for (int i=1; i < temperaturas.length; i++) {
            if (temperaturas[i][1] > temperaturas[indiceCidadeMaiorTemp][1]) {
                indiceCidadeMaiorTemp = i;
            }
            if (temperaturas[i][0] < temperaturas[indiceCidadeMenorTemp][0]) {
                indiceCidadeMenorTemp = i;
            }
        }

        System.out.println("A temperatura máxima do dia foi em " + cidades[indiceCidadeMaiorTemp] + ": " + temperaturas[indiceCidadeMaiorTemp][1] + " C");
        System.out.println("A temperatura mínima do dia foi em " + cidades[indiceCidadeMenorTemp] + ": " + temperaturas[indiceCidadeMenorTemp][0] + " C");
    }
}
