import java.util.Scanner;

public class L03Ex07{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
 
        float massa;
        float massaFinal;
        int tempo = 0;
        
        System.out.print("Digite a massa (g): ");
        massa = input.nextFloat();

        while (massa >=0){
            
            massaFinal = massa;

            while (massaFinal >= 0.10){
                massaFinal = massa * (25/100);
                tempo = tempo + 30;
            }
        
            System.out.println("O tempo necessário para que a massa se torne inferior a 0.10g é " + tempo + " segundos");

            System.out.print("Digite a massa (g): ");
            massa = input.nextFloat();

        }
    }
}