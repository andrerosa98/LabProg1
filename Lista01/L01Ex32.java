import java.util.Scanner;

public class L01Ex32{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String dataOriginal;

        System.out.print("Digite uma data no formato ddmmaaaa: ");
        dataOriginal = input.nextLine();

        System.out.print(dataOriginal.charAt(2));
        System.out.print(dataOriginal.charAt(3));
        System.out.print(dataOriginal.charAt(0));
        System.out.print(dataOriginal.charAt(1));
        System.out.print(dataOriginal.charAt(6));
        System.out.print(dataOriginal.charAt(7));
    }
}