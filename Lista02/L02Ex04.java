import java.util.Scanner;

public class L02Ex04{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        int ano;
        int mes;
        boolean testeBissexto;
        int dias;
        float teste100;
        float teste400;
        float teste004;
        int testeFevereiro;
        
        System.out.print("Digite um mês qualquer, de 1 a 12: ");
        mes = input.nextInt();
        input.nextLine();
        System.out.print("Digite um ano qualquer: ");
        ano = input.nextInt();
        input.nextLine();

        teste100 = ano % 100;
        teste400 = ano % 400;
        teste004 = ano % 4;

        if (ano > 1752 && teste100 == 0 && teste400 == 0){
            testeBissexto = true;
        }else if (ano > 1752 && teste100 == 0){
            testeBissexto = false;
        }else if (teste004 == 0){
            testeBissexto = true;
        }else{
            testeBissexto = false;
        }

        if (testeBissexto == true){
            testeFevereiro = 29;
        }else{
            testeFevereiro = 28;
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            dias = 31;
        }else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            dias = 30;
        }else{
            dias = testeFevereiro;
        }

        System.out.printf("O mês %d tem %d dias. %n", mes, dias);

    }
}