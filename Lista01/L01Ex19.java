import java.util.Scanner;

public class L01Ex19 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        final int SOM = 340;
        float tempo;
        float distancia;

        System.out.print("Digite o tempo transcorrido entre ver e ouvir o trovão: ");
        tempo = input.nextFloat();

        distancia = SOM * tempo;

        System.out.printf("Sua distância em relação ao trovão é de %.2f metros. %n", distancia);
    }    
}
