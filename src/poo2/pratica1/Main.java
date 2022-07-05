package poo2.pratica1;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        Pessoa p2 = new Pessoa("João", 25, "id1");

        Pessoa p3 = new Pessoa("João", 25, "id2", 75.50, 1.77);

        System.out.println(p3);
        System.out.println();

        double imc = p3.calcularIMC();
        if(imc == -1) {
            System.out.println("IMC é menor que 20 -> Está abaixo do peso");;
        } else if(imc == 0) {
            System.out.println("IMC está entre 20 e 25 -> Peso saudável");
        } else {
            System.out.println("IMC é maior que 25 -> Está sobrepeso");
        }
        System.out.println();

        if(p3.ehMaioridade()) {
            System.out.println("Possui maioridade");
        } else {
            System.out.println("Não possui maioridade");
        }
    }
}
