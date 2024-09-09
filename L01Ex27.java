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
        float total;

        
        System.out.print("Digite a área a ser pintada (m2): ");
        area = input.nextFloat();

        //1 litro para cada 3m2, então uma lata de 18l pinta 54m2. Cada lata custa R$80,00

        qtdLatas = area / 54;
        qtdLatasResto = area % 54;
        valor = ((int)qtdLatas + qtdLatasResto) * 80f;
        total = (int) qtdLatas + qtdLatasResto;

       System.out.printf("Deverão ser compradas %.0f lata(s) de tinta, que ir(ão) custar R$%.2f %n", total, valor);

        
        
    }    
}
