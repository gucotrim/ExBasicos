package poo3.pratica1.ex1;

public class Main {
    public static void main(String[] args) {
        Executivos ex = new Executivos();
        Basico ba = new Basico();
        Colaboradores co = new Colaboradores();

        System.out.println("Conta Executivo");
        ex.depositar(200);
        ex.transferir(156.45);
        System.out.println();

        System.out.println("Conta Básico");
        ba.consultarSaldo();
        ba.pagar(357.89);
        ba.saque(100);
        System.out.println();

        System.out.println("Conta Colaborador");
        co.consultarSaldo();
        co.saque(150);
    }
}
