package TrabalhandoComCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Temperatura {
    private List<Double> temperaturas = new ArrayList<>(6);

    public List<Double> getTemperaturas() {
        return temperaturas;
    }

    private double media() {
        double media = 0;
        Iterator<Double> iterator = this.temperaturas.iterator();
        while (iterator.hasNext()) {
            media += iterator.next();
        }
        return (this.temperaturas.isEmpty()) ? 0 : (media / this.temperaturas.size());
    }

    private String mes(int m) {
        String[] mes = { "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };
        return mes[m];
    }

    public void acimaDaMedia() {
        double media = media();
        System.out.printf("Media Semestral: %.2f°\n\n", media);
        System.out.println("Acima da media\n");
        
        for(double m : this.temperaturas) {
            if (m > media) 
            System.out.printf("%s: %.2f°\n", mes(this.temperaturas.indexOf(m)), m);
        }
    }
}
