import java.util.Scanner;

public class L02Ex04{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Digite o mês: ");
        mes = input.nextInt();
        input.nextLine();
        System.out.print("Digite o ano:");
        ano = input.nextInt();
        input.nextLine();

        bissexto = ano % 4

        if (bissexto == 0){
            fevereiro = 29
        }else{
            fevereiro = 28
        }

        
    }
}