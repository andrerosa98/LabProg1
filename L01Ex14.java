import java.util.Scanner;

public class L01Ex14 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        float celsius;
        float fahrenheit;
        float volume;
        float milimetro;
        System.out.print("Digite a temperatura em celsius: ");
        celsius = input.nextFloat();
        System.out.print("Digite o volume da chuva em polegadas: ");
        volume = input.nextFloat();

        fahrenheit = (celsius * 1.8f) + 32f;
        milimetro = volume * 25.4f;

        System.out.printf("A temperatura está em %.2f ºF %n", fahrenheit);
        System.out.printf("O volume da chuva está em %.2f mm %n ", milimetro);



    }
}
