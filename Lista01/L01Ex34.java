import java.util.Scanner;

public class L01Ex34
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        float salarioMinimo;
        float consumo;
        float quilowatt;
        float valor;
        float novoValor;
        
        System.out.print("Digite o valor atual do salário mínimo: R$");
        salarioMinimo = input.nextFloat();
        System.out.print("Digite o consumo elétrico da residência, em quilowatts: ");
        consumo = input.nextFloat();

        quilowatt = (salarioMinimo/7)/100;
        valor = (quilowatt * consumo);
        novoValor = valor - (float)(valor * 0,10);

        System.out.printf("O valor em reais de cada quilowatt é R$%.2f %n", quilowatt);
        System.out.printf("O valor em reais a ser pago é R$%.2f %n", valor);
        System.out.printf("O novo valor a ser pago, com desconto de 10%% é R$%.2f %n", novoValor);

    }
}