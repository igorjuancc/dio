package model;

import java.util.Calendar;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("==================================");
        System.out.println("       SALDO CONTA POUPANÇA       ");
        System.out.println("==================================");
        super.dadosConta();
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    // Conta poupança não pode sacar valores maiores do que o saldo
    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            this.historico.add(new Operacao(TipoOperacao.Saque, valor, Calendar.getInstance()));
        }
    }

    // Conta poupança não pode transferir valores maiores do que o saldo
    @Override
    public void transferir(Conta contaDestino, double valor) {
        if (this.saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor, true);
            this.historico.add(new Operacao(TipoOperacao.Envio, valor, contaDestino, Calendar.getInstance()));
            contaDestino.getHistorico().add(new Operacao(TipoOperacao.Recebido, valor, this, Calendar.getInstance()));
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==================================");
        System.out.println("      EXTRATO CONTA POUPANÇA      ");
        System.out.println("==================================");
        super.dadosConta();
        super.printHistorico();
    }
}
