import java.util.Scanner;

public class L01Ex22 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        float peso;
        float altura;
        float imc;

        System.out.print("Digite seu peso em Kg: ");
        peso = input.nextFloat();
        System.out.print("Digite sua altura em m: ");
        altura = input.nextFloat();

        imc = peso / (float)(Math.pow(altura,2));

        System.out.printf("Seu IMC é igual a %.2f %n", imc);
    }    
}
