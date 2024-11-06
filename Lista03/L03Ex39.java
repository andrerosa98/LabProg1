import java.util.Scanner;

public class L03Ex39{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int numeroA = 37;
        int numeroB = 38;
        int numeroC = 1;
        float soma;
        float somaS = 0;
        
        while(numeroA >= 1){
          

            soma = (numeroA * numeroB) / numeroC;
            somaS = somaS + soma;

            System.out.println ("(" + numeroA + " * " + numeroB + ")" + " / " + numeroC + " = " + soma);

            numeroA--;
            numeroB--;
            numeroC++;
        }
        
        System.out.println("O valor de S é igual a " + somaS);
        
    }
}