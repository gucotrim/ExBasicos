package poo2.pratica2.ex2;

public class Pereciveis extends Produto{
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        double precoFinal = this.getPreco() * quantidadeDeProdutos;
        if(this.diasParaVencer == 1) {
            precoFinal /= 4;
        } else if(this.diasParaVencer == 2) {
            precoFinal /= 3;
        } else if(this.diasParaVencer == 3) {
            precoFinal /= 2;
        }

        return precoFinal;
    }
}
