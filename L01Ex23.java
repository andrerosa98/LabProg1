import java.util.Scanner;

public class L01Ex23 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        float cotacao;
        float dolar;
        float reais;

        System.out.print("Digite o valor da cotação atual do dólar: R$");
        cotacao = input.nextFloat();
        System.out.print("Digite o valor em U$ que deseja converter: U$");
        dolar = input.nextFloat();

        reais = dolar * cotacao;

        System.out.printf("O valor de U$%.2f corresponde a R$%.2f", dolar, reais);



    }    
}
