import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Edson Arantes");
        Cliente c2 = new Cliente("Felipe Mello");

        Conta cc = new ContaCorrente(c1);
        Conta cp = new ContaPoupanca(c2);
        
        cc.depositar(5000, false);
        cc.transferir(cp, 3000);
        cc.sacar(5000);

        cc.imprimirExtrato();
        cc.imprimirSaldo();
        cp.imprimirExtrato();
        cp.imprimirSaldo();
        cp.sacar(3000);
        cp.sacar(1000);
        cp.imprimirExtrato();
        cp.imprimirSaldo();
    }
}
