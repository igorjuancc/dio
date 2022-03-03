package EntendendoMetodosJava;

public class Calculadora {

    public static void soma(double valor1, double valor2) {
        System.out.printf("O valor da soma de %.1f + %.1f = %.1f\n", valor1, valor2, (valor1+valor2));                
    }

    public static void subtracao(double valor1, double valor2) {
        System.out.printf("O valor da subtracao de %.1f - %.1f = %.1f\n", valor1, valor2, (valor1-valor2));         
    }

    public static void multiplicacao(double valor1, double valor2) {
        System.out.printf("O valor da multiplicacao de %.1f x %.1f = %.1f\n", valor1, valor2, (valor1*valor2));         
    }

    public static void divisao(double valor1, double valor2) {
        if (valor2 == 0) {
            System.out.println("Divisao por zero invalida");
        } else {
            System.out.printf("O valor da divisao de %.1f / %.1f = %.1f\n", valor1, valor2, (valor1/valor2)); 
        }
    }    
}
