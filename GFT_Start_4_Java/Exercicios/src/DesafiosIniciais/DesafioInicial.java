package DesafiosIniciais;

public class DesafioInicial {
    public static void calcularMedia(double A, double B) {
        System.out.printf("MEDIA = %.5f\n", (A * 3.5 + B * 7.5) / 11);
    }

    public static void exibePares(int num) {
        System.out.printf("\nAte [%d]\n", num); 

        for (int i = 1; i <= num; i++) {
            if ((i % 2) == 0) {
                System.out.printf("%d\n", i);
            }
        }
    }

    public static void jogadasDama(int x1, int y1, int x2, int y2) {
        while(true){
	    	if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
	    	if((x1 == x2) && (y1 == y2))		
	    		System.out.println("0");
	      else if((x1 == x2) || (y1 == y2))
	        System.out.println("1");
	    	else if( positivo((x1 - x2)) == 
	    	         positivo((y1 - y2)) )
	    		System.out.println("1");	
	      else 
	        System.out.println("2");	
            break;
	    }        
    }

    private static int positivo(int num) {
        if (num < 0) 
          return num * -1;
       else 
          return num;
      } 
}