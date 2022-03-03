package model;

import lombok.Getter;
import lombok.AccessLevel;

public enum TipoOperacao {
    Envio(1), Recebido(2), Deposito(3), Saque(4);

    @Getter(AccessLevel.PUBLIC)
    private final int operacao;

    TipoOperacao(int valor) {
        this.operacao = valor;
    }
}
