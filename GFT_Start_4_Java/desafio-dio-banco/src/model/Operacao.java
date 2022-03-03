package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Operacao {

    private TipoOperacao oprc;
    private double valor;
    private Conta contaTransf;
    private Calendar dataHora;

    public Operacao(TipoOperacao oprc, double valor, Conta contaTransf, Calendar dataHora) {
        this.oprc = oprc;
        this.valor = valor;
        this.contaTransf = contaTransf;
        this.dataHora = dataHora;
    }

    public Operacao(TipoOperacao oprc, double valor, Calendar dataHora) {
        this.oprc = oprc;
        this.valor = valor;
        this.dataHora = dataHora;
    }

    private String nomeOperacao(int opc) {
        switch (opc) {
            case 1:
                return "TRANSFERENCIA ENVIADA";
            case 2:
                return "TRANSFERENCIA RECEBIDA";
            case 3:
                return "DEPOSITO";
            case 4:
                return "SAQUE";
            default:
                return "ERRO";
        }
    }

    public void dadosOperacao() {
        String data = new SimpleDateFormat("dd/MM/yyyy").format(this.dataHora.getTime());
        String hora = new SimpleDateFormat("H:mm:ss").format(this.dataHora.getTime());
        System.out.println("----------------------------------");
        System.out.println(nomeOperacao(this.oprc.getOperacao()));
        System.out.println("----------------------------------");
        System.out.println(String.format("Data: %s", data));
        System.out.println(String.format("Hora: %s", hora));
        System.out.println(String.format("Valor: %.2f", this.valor));

        if ((this.oprc == TipoOperacao.Envio) ||
                (this.oprc == TipoOperacao.Recebido)) {
            System.out.println("----------------------------------");
            System.out.println(this.oprc == TipoOperacao.Recebido ? "ORIGEM" : "DESTINO");
            System.out.println("----------------------------------");
            System.out.println(String.format("Agencia: %d", this.contaTransf.agencia));
            System.out.println(String.format("Conta: %d", this.contaTransf.numero));
            System.out.println(String.format("Cliente: %s", this.contaTransf.cliente.getNome()));
            System.out.println(String.format("ID: %d", this.contaTransf.cliente.getId()));            
        }
    }
}
