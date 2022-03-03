package TrabalhandoComCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIris {
    private Set<String> cores = new LinkedHashSet<>(
            Arrays.asList("vermelho",
                    "laranja", "amarelo", "verde", "azul", "anil", "violeta"));

    private void exibeCores() {
        Iterator<String> iterator = this.cores.iterator();
        while (iterator.hasNext()) {
            String cor = iterator.next();
            System.out.println(cor);
        }
    }

    private void coresInversa() {
        Set<String> coresArcoIris = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);
    }
    
    public void imprimeDados() {
        System.out.println("\nArco iris");

        System.out.println("\nCores\n");
        exibeCores();
        
        System.out.printf("\nQuantidade de cores: %d\n", this.cores.size());

        System.out.println("\nCores em ordem alfabetica\n");

        Set<String> coresAlf = new TreeSet<>(this.cores);
        System.out.println(coresAlf);

        System.out.println("\nCores na ordem inversa\n");
        coresInversa();

        System.out.println("\nCores com [V]\n");
        for (String c : this.cores) {
            if (c.startsWith("v")) System.out.println(c);
        }            

        System.out.println("\nRemover Cores que nao comecam com [V]\n");
        Iterator<String> iterator2 = this.cores.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(this.cores);

        System.out.println("\nLimpe o conjunto\n");
        this.cores.clear();
        System.out.println("\nConferir: \n");
        System.out.println(this.cores);
    }
}
