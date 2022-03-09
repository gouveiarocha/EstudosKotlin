package POO.model;

public class ContaCorrente {
    private String nomeCliente;
    private int conta, agencia;
    private double saldo = 0d;

    public ContaCorrente(String nomeCliente, int numeroConta, int numeroAgencia) {
        this.nomeCliente = nomeCliente;
        this.conta = numeroConta;
        this.agencia = numeroAgencia;
    }

    // gets e setts
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Integer getConta() {
        return conta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "{ " +
                "Nome do Cliente: " + nomeCliente +
                ", Conta: " + conta + ", AG: " + agencia +
                ", Saldo Atual: R$ " + saldo + " }";
    }

    // metodos

    public int sacar(double valor) {

        if (this.saldo > 0 && this.saldo > valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " efetivado!");
            return 1;
        } else {
            System.out.println("Saque não efetivado - Saldo insuficiente!");
            return 0;
        }

    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito de R$ " + valor + " efetivado!");
    }

    public void imprimir() {
        System.out.println(this);
    }

}
