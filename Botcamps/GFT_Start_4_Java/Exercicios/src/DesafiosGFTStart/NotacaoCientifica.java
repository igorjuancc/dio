package DesafiosGFTStart;

import java.text.DecimalFormat;

public class NotacaoCientifica {
    public static void exibeNotacao(Double n) {
        DecimalFormat df = new DecimalFormat("0.0000E00");
        String fmt = df.format(n);
        fmt = (!fmt.substring(0,1).equals("-")) ? "+" + fmt : fmt;     
        fmt = (fmt.charAt(8) != '-') ? fmt.replaceAll("E", "E+") : fmt;
        System.out.println(fmt);
    }    
}
