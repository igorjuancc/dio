package model;

import lombok.AccessLevel;
import lombok.Getter;

public class Cliente {
    private static int SEQUENCIAL = 1;

    @Getter(AccessLevel.PUBLIC)
    private String nome;
    @Getter(AccessLevel.PUBLIC)
    private int id;

    public Cliente(String nome) {
        this.nome = nome;
        this.id = SEQUENCIAL++;
    }
}
