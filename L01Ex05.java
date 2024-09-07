import java.util.Scanner;

public class L01Ex05 
{
    public static void main (String[] args)
    {
        final int AUTONOMIA = 12;
        int tempo;
        int velocidade;
        int distancia;
        int litrosUsados;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o tempo gasto na viagem(em horas): ");
        tempo = input.nextInt();
        System.out.print("Digite a velocidade média da viagem(em Km/h): ");
        velocidade = input.nextInt();

        distancia = tempo * velocidade;
        litrosUsados = (distancia / AUTONOMIA);

        System.out.println("A velocidade média foi de: " + velocidade + " Km/h");
        System.out.println("O tempo gasto na viagem foi de: " + tempo + " horas");
        System.out.println("A distância percorrida foi de: " + distancia + "Km");
        System.out.println("A quantidade de litros de combustível utilizados foi de " + litrosUsados + "L");
    }
}
