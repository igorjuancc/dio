package LogicaCondicionaleControleDeFluxo;

public class Datas {
    private static String nome(int mes) {
        mes--;
        String[] nomeMes = { "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };
        return nomeMes[mes];
    }

    public static void nomeMes(int mes) {
        if ((mes < 1) || (mes > 12)) {
            System.out.println("Mês Inválido");
        } else {
            System.out.printf("Mês: %s", nome(mes));
            if ((mes == 1) || (mes == 7) || (mes == 12)) {
                System.out.print(" [Ferias]\n");
            } else {
                System.out.print("\n");
            }
        }
    }

    public static void numeroDiaSemana(String nomeDiaSemana) {
        nomeDiaSemana = nomeDiaSemana.toUpperCase();
        switch (nomeDiaSemana) {
            case "SEGUNDA":
                System.out.println("2");
                break;
            case "TERCA":
                System.out.println("3");
                break;
            case "QUARTA":
                System.out.println("4");
                break;
            case "QUINTA":
                System.out.println("5");
                break;
            case "SEXTA":
                System.out.println("6");
                break;
            case "SABADO":
                System.out.println("7");
                break;
            case "DOMIGO":
                System.out.println("1");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
    }

    public static void numero(int num) {
        switch (num) {
            case 1:
                System.out.println("Certo");
                break;
            case 2:
                System.out.println("Certo");
                break;
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Indefinido");
                break;
        }
    }
}
