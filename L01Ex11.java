import java.util.Scanner;

public class L01Ex11 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        double saque;
        double saqueOriginal;
        double saque200;
        double saque100;
        double saque050;
        double saque020;
        double saque010;
        double saque005;
        double saque002;


        System.out.print("Digite o valor a ser sacado: R$");
        saqueOriginal = input.nextDouble();
        
        saque = saqueOriginal;
        saque200 = saque / 200;
        saque = saque % 200;
        saque100 = saque / 100;
        saque = saque % 100;
        saque050 = saque / 50;
        saque = saque % 50;
        saque020 = saque / 20;
        saque = saque % 20;
        saque010 = saque / 10;
        saque = saque % 10;
        saque005 = saque / 5;
        saque = saque % 5;
        saque002 = saque / 2;
        saque = saque % 2;

        System.out.printf("Valor do Saque: R$ %.2f \n", saqueOriginal);
        System.out.println((int)saque200 + " cédula(s) de R$200,00");
        System.out.println((int)saque100 + " cédula(s) de R$100,00");
        System.out.println((int)saque050 + " cédula(s) de R$50,00");
        System.out.println((int)saque020 + " cédula(s) de R$20,00");
        System.out.println((int)saque010 + " cédula(s) de R$10,00");
        System.out.println((int)saque005 + " cédula(s) de R$5,00");
        System.out.println((int)saque002 + " cédula(s) de R$2,00");
        System.out.println((int)saque + " moeda(s) de R$1,00");


    }
}
