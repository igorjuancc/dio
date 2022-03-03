package model;

public interface InterfaceConta {

    void sacar(double valor);

    //Deposito via transferencia
    void depositar(double valor, Boolean transferencia);

    void transferir(Conta contaDestino, double valor);

    void imprimirExtrato();

    void imprimirSaldo();
        
}
