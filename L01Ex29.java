import java.util.Scanner;

public class L01Ex29 
{
    public static void main (String[] args)
    {
        Scanner input= new Scanner(System.in);

        float valorA;
        float valorB;
        
        System.out.print("Digite o primeiro valor: ");
        valorA = input.nextFloat();
     
        System.out.print("Digite o segundo valor: ");
        valorB = input.nextFloat();

        valorA = valorA * valorB;
        valorB = valorA / valorB;
        valorA = valorA / valorB;
        
        System.out.println("O primeiro valor é " + valorA);
        System.out.println("O segundo valor é " + valorB);
    }   


    
    
    
}
