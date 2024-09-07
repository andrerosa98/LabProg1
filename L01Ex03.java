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

        gigaByte = (teraByte / 1024.0f);
        megaByte = (gigaByte / 1024.0f);
        kiloByte = (megaByte / 1024.0f);
        calcByte = (kiloByte / 1024.0f);

        System.out.println("Gigabyte: " + gigaByte);
        System.out.println("Megabyte: " + megaByte);
        System.out.println("bytes: "  + calcByte);

    }
}