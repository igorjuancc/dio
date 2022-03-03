import DesafiosBasicos.DesafioBasico;
import DesafiosGFTStart.NotacaoCientifica;
import DesafiosGFTStart.NotasMoedas;
import DesafiosIniciais.DesafioInicial;
import EntendendoMetodosJava.Calculadora;
import EntendendoMetodosJava.Emprestimo;
import EntendendoMetodosJava.HoraDoDia;
import EntendendoMetodosJava.Quadrilatero;
import LogicaCondicionaleControleDeFluxo.Datas;
import TrabalhandoComCollections.ArcoIris;
import TrabalhandoComCollections.Temperatura;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Entendendo Métodos");

        System.out.println("\nCalculadora\n");
        Calculadora.soma(2, 5);
        Calculadora.subtracao(4, 5);
        Calculadora.divisao(2, 3);
        Calculadora.multiplicacao(5, 5);

        System.out.println("\nMensagem\n");
        HoraDoDia.mensagem(9);
        HoraDoDia.mensagem(14);
        HoraDoDia.mensagem(1);
        HoraDoDia.mensagem(24);

        System.out.println("\nEmprestimo\n");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, 5);

        System.out.println("\nQuadrilatero\n");
        Quadrilatero.printArea(3);
        Quadrilatero.printArea(5d, 5d);
        Quadrilatero.printArea(7, 8, 9);
        Quadrilatero.printArea(5f, 5f);

        System.out.println("\nQuadrilatero com retorno\n");
        System.out.printf("Área do quadrado: %.2f\n", Quadrilatero.area(3));
        System.out.printf("Área do retângulo: %.2f\n", Quadrilatero.area(5d, 5d));
        System.out.printf("Área do trapézio: %.2f\n", Quadrilatero.area(7, 8, 9));
        System.out.printf("Área do losango: %.2f\n", Quadrilatero.area(5f, 5f));

        System.out.println("Lógica Condicional e Controle de Fluxos");

        System.out.println("\nMes\n");
        Datas.nomeMes(1);
        Datas.nomeMes(5);
        Datas.nomeMes(18);
        Datas.nomeMes(12);
        Datas.nomeMes(40);
        Datas.nomeMes(4);

        System.out.println("\nDia da Semana\n");

        Datas.numeroDiaSemana("Segunda");
        Datas.numeroDiaSemana("Terca");
        Datas.numeroDiaSemana("QUARTA");
        Datas.numeroDiaSemana("123");

        System.out.println("\nNumero\n");

        Datas.numero(1);
        Datas.numero(4);
        Datas.numero(5);
        Datas.numero(6);

        System.out.println("Desafios Iniciais");

        System.out.println("\nMedia\n");

        DesafioInicial.calcularMedia(5.0, 7.1);
        DesafioInicial.calcularMedia(0.0, 7.1);
        DesafioInicial.calcularMedia(10.0, 10.0);

        System.out.println("\nNumeros Pares\n");

        DesafioInicial.exibePares(6);
        DesafioInicial.exibePares(13);

        System.out.println("\nDama\n");

        DesafioInicial.jogadasDama(4, 4, 6, 2);
        DesafioInicial.jogadasDama(3, 5, 3, 5);
        DesafioInicial.jogadasDama(5, 5, 4, 3);

        System.out.println("Desafios Basicos");

        System.out.println("\nArea de Circunferencia\n");

        DesafioBasico.calcularArea(2);
        DesafioBasico.calcularArea(100.64);
        DesafioBasico.calcularArea(150);

        System.out.println("\nDiferenca Porcentagem\n");

        DesafioBasico.calcularDiferencaPorcentagem(20, 30);
        DesafioBasico.calcularDiferencaPorcentagem(999.96, 1000);
        DesafioBasico.calcularDiferencaPorcentagem(999.95, 1000);
        DesafioBasico.calcularDiferencaPorcentagem(0.03, 999.98);
        DesafioBasico.calcularDiferencaPorcentagem(0.07, 999.99);

        System.out.println("\nSoma\n");

        DesafioBasico.calcularSoma(11, 7);
        DesafioBasico.calcularSoma(-11, 6);
        DesafioBasico.calcularSoma(11, -2);

        System.out.println("\nTrabalhando com collections");

        System.out.println("\nTemperatura\n");

        Temperatura tmp = new Temperatura();
        tmp.getTemperaturas().add(10d);
        tmp.getTemperaturas().add(15d);
        tmp.getTemperaturas().add(28d);
        tmp.getTemperaturas().add(12d);
        tmp.getTemperaturas().add(16d);
        tmp.getTemperaturas().add(29d);
        tmp.acimaDaMedia();

        //System.out.println("\nCrime\n");

        //Crime c = new Crime();
        //c.realizaPerguntas();

        ArcoIris a = new ArcoIris();
        a.imprimeDados();

        System.out.println("\nDesafio GFT Start");

        System.out.println("\nNotas e Moedas\n");

        NotasMoedas.calculaNotasMoedas(576.73);

        System.out.println("\nNotacao Cientifica\n");

        NotacaoCientifica.exibeNotacao(3.141592);

    }
}
