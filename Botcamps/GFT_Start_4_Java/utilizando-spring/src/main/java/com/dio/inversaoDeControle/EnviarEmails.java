package com.dio.inversaoDeControle;

public class EnviarEmails {

    public EnviarEmails(String tipo, String endereco, String senha) {

    }

    public static EnviarEmails obterDadosEmail() {
        return new EnviarEmails("stmp", "teste@email.com", "senha");
    }

    public void retornar(String mensagem) {
        System.out.println("Email enviado!");
    }
    
}
