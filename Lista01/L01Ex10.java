import java.util.Scanner;

public class L01Ex10 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        final double grav = 9.8;
        double altura;
        double tempo;
        double velocidade;

        System.out.print("Digite uma altura em metros: ");
        altura = input.nextDouble();

        velocidade = Math.sqrt(2 * (grav * altura)); //Equação de Torricelli
        tempo = velocidade / grav;

        System.out.println("O tempo de queda em segundos é: " + tempo + " segundo(s)");




    }
}
