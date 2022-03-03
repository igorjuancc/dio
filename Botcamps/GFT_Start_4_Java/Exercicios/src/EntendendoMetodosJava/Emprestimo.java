package EntendendoMetodosJava;

public class Emprestimo {

    public static void calcular(double valor, int parcelas) {
        switch (parcelas) {
            case 2:
                System.out.printf("Valor final do empréstimo de R$ %.2f para 2 parcelas: R$ %.2f\n", valor, valor + (valor * 0.3));
                break;
            case 3:
                System.out.printf("Valor final do empréstimo de R$ %.2f para 3 parcelas: R$ %.2f\n", valor, valor + (valor * 0.45));
                break;
            default:
                System.out.println("Quantidade de parcelas não aceita\n");
                break;
        }
    }
}
