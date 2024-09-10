import java.util.Scanner;

public class L01Ex12 
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        double dolares;
        double reais;
        final double cotacao = 5.00;
        System.out.print("Digite o custo do Kb de RAM: U$ ");
        dolares = input.nextDouble();
        
        reais = dolares * cotacao;

        System.out.println("Em 1980, uma memória para suportar um vídeo colorido custaria R$ " + reais);
        
        
    }    
}
