package model;

import java.util.Calendar;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("==================================");
        System.out.println("       SALDO CONTA CORRENTE       ");
        System.out.println("==================================");
        super.dadosConta();
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        this.historico.add(new Operacao(TipoOperacao.Saque, valor, Calendar.getInstance()));
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor, true);
        this.historico.add(new Operacao(TipoOperacao.Envio, valor, contaDestino, Calendar.getInstance()));
        contaDestino.getHistorico().add(new Operacao(TipoOperacao.Recebido, valor, this, Calendar.getInstance()));
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==================================");
        System.out.println("      EXTRATO CONTA CORRENTE      ");
        System.out.println("==================================");
        super.dadosConta();
        super.printHistorico();
    }
}
