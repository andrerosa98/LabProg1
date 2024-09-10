import java.util.Scanner;
public class L01Ex06 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        float numeroBits;
        float numeroPontos;
        float coresPoss;
        float tamanhoFig;
        float tamanhoBytes;

        System.out.print("Digite a profundidade da cor (nº de bits): ");
        numeroBits = input.nextFloat();
        System.out.print("Digite o número de pontos da figura: ");
        numeroPontos = input.nextFloat();

        coresPoss = (float) Math.pow(2, numeroBits);
        tamanhoFig = (numeroBits * numeroPontos);
        tamanhoBytes = (tamanhoFig / 8);

        System.out.println("O número de cores possíveis é " + coresPoss);
        System.out.println("O tamanho da figura em bits é " + tamanhoFig + " (" + tamanhoBytes + ")" + " bytes");
    }    
}
