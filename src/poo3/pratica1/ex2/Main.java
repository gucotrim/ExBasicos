package poo3.pratica1.ex2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gustavo");

        Set<String> habilidades = new HashSet<>();
        habilidades.add("Java");
        habilidades.add("Spring Boot");
        habilidades.add("ReactJS");

        Curriculo curriculo = new Curriculo("CV", pessoa, habilidades);
        ImpressaoDeDocumentos.imprimir(curriculo);

        Livro livro = new Livro("LIVRO", 422, "Robert C. Martin", "Código Limpo - Habilidades Práticas do Agile Software", "Técnico");
        ImpressaoDeDocumentos.imprimir(livro);

        Relatorio relatorio = new Relatorio("RELATÓRIO", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas at.", 10, "Gustavo", "John Doe");
        ImpressaoDeDocumentos.imprimir(relatorio);
    }
}
