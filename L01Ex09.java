import java.util.Scanner;

public class L01Ex09 {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        float segundos;
        float minutos;
        float horas;
        float dias;

        System.out.print("Digite um número em segundos: ");
        segundos = input.nextInt();

        dias = segundos / 86400;
        segundos = segundos % 86400;
        horas = segundos / 3600;
        segundos = segundos % 3600;
        minutos = segundos / 60;
        segundos = segundos% 60;

        System.out.println((int) dias + " dia(s)");
        System.out.println((int) horas + " hora(s)");
        System.out.println((int) minutos + " minuto(s)");
        System.out.println((int) segundos + " segundo(s)");


    }
}
