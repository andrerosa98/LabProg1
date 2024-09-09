import java.util.Scanner;

public class L01Ex27 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        float area;
        float qtdLatas;
        float valor;
        float qtdLatasResto;
        
        System.out.print("Digite a área a ser pintada (m2): ");
        area = input.nextFloat();

        qtdLatas = area / 54f;
        qtdLatasResto = qtdLatas % 54f;
        

        System.out.printf("Deve comprar %.0f latas de tinta, que custarão R$%.2f %n", qtdLatasResto, valor);
    }    
}
