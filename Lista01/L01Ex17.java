import java.util.Scanner;

public class L01Ex17 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        float base;
        float altura;
        float volume;

        System.out.print("Digite a base da pirâmide: ");
        base = input.nextFloat();
        System.out.print("Digite a altura da pirâmide: ");
        altura = input.nextFloat();

        volume = (base * altura) / 3;

        System.out.printf("O volume da pirâmide é %.2f %n", volume);
    }    
}
