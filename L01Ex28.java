import java.util.Scanner;

public class L01Ex28 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        float pesoPeixes;
        final float pesoTotal = 50;
        float excedente;
        float taxa;

        System.out.print("Digite o peso dos peixes (Kg): ");
        pesoPeixes = input.nextFloat();

        excedente = pesoPeixes - pesoTotal;

        if (excedente > 0)
        {
            taxa = (excedente * 4);
            System.out.printf("O valor excedente a ser pago é R$%.2f", taxa);
        }else{
            System.out.println("Não será necessário pagar taxa.");
        }

    }    
}
