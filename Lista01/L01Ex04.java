import java.util.Scanner;

public class L01Ex04 
{
    
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        float valorAntigo;
        float valorAtual;
        float percentual;

        System.out.print("Digite o valor antigo do cinema: R$ ");
        valorAntigo = input.nextFloat();
        System.out.print("Digite o valor atual do cinema: R$ ");
        valorAtual = input.nextFloat();


        percentual = ((valorAtual / valorAntigo )- 1) * 100;


        if (percentual > 0)
        {
            System.out.println("Aumento de " + percentual + "%");
        }else{
            System.out.println("Não houve aumento.");
        }
        




    }

}
