import java.util.Scanner;

public class L02Ex11{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        int ano;
        float teste100;
        float teste400;
        float teste004;
        
        System.out.print("Digite um ano: ");
        ano = input.nextInt();
        input.nextLine();

        teste100 = ano % 100;
        teste400 = ano % 400;
        teste004 = ano % 4;

        if (ano > 1752 && teste100 == 0 && teste400 == 0){
            System.out.println("O ano digitado é bissexto.");
        }else if (ano > 1752 && teste100 == 0){
            System.out.println("O ano digitado não é bissexto.");
        }else if (teste004 == 0){
            System.out.println("O ano digitado é bissexto.");
        }else
            System.out.println("O ano digitado não é bissexto.");

    }
}