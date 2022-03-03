package TrabalhandoComCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Crime {
    private List<String> perguntas = Arrays.asList(
            "1. Telefonou para a vítima?",
            "2. Esteve no local do crime?",
            "3. Mora perto da vitma?",
            "4. Devia para a vítima?",
            "5. Ja trabalhou com a vítima?");

    private List<String> respostas = new ArrayList<>();

    public void realizaPerguntas() {
        Scanner sc = null;
        System.out.println("Questoes: \n\n");
        for (String p : this.perguntas) {
            System.out.println(p + "\nR: ");
            if (sc == null) sc = new Scanner(System.in);
            respostas.add(sc.nextLine().toUpperCase());
        }
        conclusao();
    }

    private void conclusao() {
        System.out.printf("\nClassificacao: ");
        switch (contaRespostas()) {
            case 2:
                System.out.printf("Suspeito\n");
                break;
            case 3:
                System.out.printf("Cumplice\n");
                break;
            case 4:
                System.out.printf("Cumplice\n");
                break;
            case 5:
                System.out.printf("Assassina\n");
                break;
            default:
                System.out.println("Inocente\n");
                break;
        }
    }

    private int contaRespostas() {
        int sim = 0;
        Iterator<String> iterator = this.respostas.iterator();
        while (iterator.hasNext()) {
            String resp = iterator.next();
            if (resp.equals("SIM"))
                sim++;
        }
        return sim;
    }

}
