import java.util.Scanner;

public class L01Ex13 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        float altura;
        float decimetro;
        float centimetro;
        float milimetro;

        System.out.print("Digite sua altura em metros: ");
        altura = input.nextFloat();

        decimetro = altura /10;
        centimetro = altura / 100;
        milimetro = altura / 1000;

        System.out.printf("Altura...............: %.2f \n", altura);
        System.out.printf("Altura em decímetros.: %.3f \n", decimetro);
        System.out.printf("Altura em centímetros: %.4f \n", centimetro);
        System.out.printf("Altura em milímetros.: %.5f \n", milimetro);



    }
    
}
