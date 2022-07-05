package poo3.pratica1.ex2;

import java.util.Set;

public class Pessoa {
    private String nome;


    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
