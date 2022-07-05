package poo3.pratica1.ex3;

public abstract class Animal{

    private String nome;
    private TipoAlimentacao tipoAlimentacao;

    public Animal(String nome, TipoAlimentacao tipoAlimentacao) {
        this.nome = nome;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoAlimentacao getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(TipoAlimentacao tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public abstract void emitirSom();

    public void comer() {
        AlimentacaoAnimal.comer(this);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", tipoAlimentacao=" + tipoAlimentacao +
                '}';
    }
}
