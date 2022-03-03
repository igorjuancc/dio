package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import lombok.Getter;
import lombok.AccessLevel;

public abstract class Conta implements InterfaceConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    @Getter(AccessLevel.PUBLIC)
    protected int agencia;
    @Getter(AccessLevel.PUBLIC)
    protected int numero;
    @Getter(AccessLevel.PUBLIC)
    protected double saldo;
    @Getter(AccessLevel.PUBLIC)
    protected List<Operacao> historico;
    @Getter(AccessLevel.PUBLIC)
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.historico = new ArrayList<>();
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor, Boolean transferencia) {
        this.saldo += valor;
        if (!transferencia)
            this.historico.add(new Operacao(TipoOperacao.Deposito, valor, Calendar.getInstance()));
    }

    protected void dadosConta() {
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("ID: %d", this.cliente.getId()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
    }

    protected void printHistorico() {
        if (this.historico.isEmpty()) {
            System.out.println("SEM TRANSACOES");
        } else {
            for (Operacao o : this.historico) {
                o.dadosOperacao();
            }
        }
    }
}
