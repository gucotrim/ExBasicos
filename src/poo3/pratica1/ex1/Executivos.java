package poo3.pratica1.ex1;

public class Executivos implements Transacao, Deposito, Transferencia{

    @Override
    public void transacaoOk(String msg) {
        System.out.println(msg + " realizada com sucesso!");
    }

    @Override
    public void transacaoNaoOk(String msg) {
        System.out.println("Erro ao realizar " +  msg + "!");
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Fazendo depósito de R$ " + valor);
        this.transacaoOk("Depósito");
    }

    @Override
    public void transferir(double valor) {
        System.out.println("Fazendo transferência de R$ " + valor);
        this.transacaoNaoOk("Transferência");
    }
}
