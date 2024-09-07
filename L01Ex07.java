import java.util.Scanner;
public class L01Ex07
{
    public static void main (String[] args)
    {
        int colunas;
        int linhas;
        int profCor;
        float tamanhoBytes;
        float tamanhoGb;
        float tamanhoMb;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de colunas da figura: ");
        colunas = input.nextInt();
        System.out.print("Digite a quantidade de linhas da figura: ");
        linhas = input.nextInt();
        System.out.print("Digite a profundidade de cor utilizada: ");
        profCor = input.nextInt();

        tamanhoBytes = (float) linhas * profCor;
        tamanhoMb = tamanhoBytes / 10000;
        tamanhoGb = tamanhoMb / 100;

        System.out.println("a) Quantidade de pontos da figura: " + colunas + "x" + linhas);
        System.out.println("b) Tamanho em bytes da figura: " + tamanhoBytes + " bytes");
        System.out.println("c) Tamanho em Mb da figura: " + tamanhoMb + "Mb");
        System.out.println("d) Tamanho em Gb da figura: " + tamanhoGb + "Gb");

    }
}