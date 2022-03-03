package EntendendoMetodosJava;

public class Quadrilatero {
    public static void printArea(double lado) {
        System.out.printf("Área do quadrado: %.2f\n", lado * lado);
    }

    public static void printArea(double lado1, double lado2) {
        System.out.printf("Área do retângulo: %.2f\n", lado1 * lado2);
    }

    public static void printArea(double baseMaior, double baseMenor, double altura) {
        System.out.printf("Área do trapézio: %.2f\n", ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void printArea(float diagonal1, float diagonal2) {
        System.out.printf("Área do losango: %.2f\n", (diagonal1 * diagonal2) / 2);
    }

    public static double area(double lado) {
        return lado * lado;
    }

    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        return (((baseMaior + baseMenor) * altura) / 2);
    }

    public static float area(float diagonal1, float diagonal2) {
        return ((diagonal1 * diagonal2) / 2);
    }
}
