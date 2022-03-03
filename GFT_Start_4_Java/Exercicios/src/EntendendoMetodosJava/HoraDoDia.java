package EntendendoMetodosJava;

public class HoraDoDia {

    public static void mensagem(int hora) {
        if ((hora < 0) || (hora > 23)) {
            System.out.println("Hora invalida");
        } else {
            if ((hora >= 5) && (hora <= 12)) {
                System.out.println("Bom Dia!");
            } else if ((hora >= 13) && (hora <= 17)) {
                System.out.println("Boa Tarde!");
            } else {
                System.out.println("Boa Noite!");
            }
        }
    }
}