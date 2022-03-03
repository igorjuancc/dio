package DesafiosBasicos;

public class DesafioBasico {
    public static void calcularArea(double raio) {
        double area = 3.14159 * (Math.pow(raio,2));
        System.out.printf("A=%.4f\n", area);
    }     
    
    public static void calcularDiferencaPorcentagem(double A, double B) {
        System.out.printf("%.2f%%\n", ((B - A) * 100) / A);
    }  

    public static void calcularSoma(int A, int B) {
        System.out.printf("X = %d\n", A + B);
    }  
}
