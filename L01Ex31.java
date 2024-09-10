import java.util.Scanner;

public class L01Ex13{

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        float valorInicial;
        float meses;
        float juros;
        float ValorFinal;
        
        System.out.print("Digite o valor inicial: R$");
        valorInicial = input.nextFloat();
        System.out.print("Digite a quantidade de meses: ");
        meses = input.nextInt();
        input.nextLine();
        System.out.print("Digite a taxa de juros: ");
        juros = input.nextFloat();

        valorFinal = (float)Math.pow((1 + juros) , meses) * valorInicial;

        System.out.printf("O valor final será de R$%.2f %n", valorFinal);
    }
}