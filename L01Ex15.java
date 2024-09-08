import java.util.Scanner;

public class L01Ex15 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        double A;
        double B;
        double C;
        double D;
        System.out.print("Digite o valor do coeficiente A: ");
        A = input.nextDouble();
        System.out.print("Digite o valor do coeficiente B: ");
        B = input.nextDouble();
        System.out.print("Digite o valor do coeficiente C ");
        C = input.nextDouble();

        D = Math.pow(B,2) - (4*A*C);

        System.out.printf("O valor de delta é %.2f ", D);

    }
}
