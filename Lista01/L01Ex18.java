import java.util.Scanner;

public class L01Ex18 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        float horas;
        float horas3;
        float horasRestantes;
        float total;

        System.out.print("Digite a quantidade de horas de uso da bicicleta: ");
        horas = input.nextFloat();

        horas3 = (int) (horas / 3) * 10;
        horasRestantes = (horas % 3) * 5;
        total = horas3 + horasRestantes;
        
        System.out.printf("O cliente deve pagar R$%.2f pelo uso da bicicleta. %n", total);
    }    
}
