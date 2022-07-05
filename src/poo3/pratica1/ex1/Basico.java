package poo3.pratica1.ex1;

public class Basico implements Transacao, ConsultaSaldo, PagamentoServico, Saque{

    @Override
    public void transacaoOk(String msg) {
        System.out.println(msg + " realizada com sucesso!");
    }

    @Override
    public void transacaoNaoOk(String msg) {
        System.out.println("Erro ao realizar " +  msg + "!");
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Consultando saldo...");
        this.transacaoNaoOk("Consulta de saldo");
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Realizando pagamento de R$ " + valor);
        this.transacaoOk("Pagamento");
    }

    @Override
    public void saque(double valor) {
        System.out.println("Realizando saque em dinheiro de R$ " + valor);
        this.transacaoOk("Saque");
    }
}
