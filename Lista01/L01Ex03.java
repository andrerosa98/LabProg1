import java.util.Scanner;

public class L01Ex03
{

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        float teraByte;
        float gigaByte;
        float megaByte;
        float kiloByte;
        float calcByte;

        System.out.print("Digite um valor em Terabyte: ");
        teraByte = input.nextFloat();

        gigaByte = (teraByte * 1024);
        megaByte = (gigaByte * 1024);
        kiloByte = (megaByte * 1024);
        calcByte = (kiloByte * 1024);

        System.out.println("Gigabyte: " + gigaByte);
        System.out.println("Megabyte: " + megaByte);
        System.out.println("bytes: "  + calcByte);

    }
}