import java.util.Scanner;

public class L02Ex08{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int dia;
        int mes;
        int ano;
        boolean verifDia;
        boolean verifMes;
        boolean testeFevereiro;
        boolean testeBissexto;
        float teste004;
        float teste100;
        float teste400;

        
        System.out.print("Digite um dia: ");
        dia = input.nextInt();
        input.nextLine();
        System.out.print("Digite um mês: ");
        mes = input.nextInt();
        input.nextLine();
        System.out.print("Digite um ano: ");
        ano = input.nextInt();
        input.nextLine();

        //Verificação do dia
        
        if (dia > 31 || dia < 1){
            verifDia = false;
        }else{
            verifDia = true;
        } 

        //Verificação do mês

        if (mes > 12 || mes < 1){
            verifMes = false;
        }else{
            verifMes = true;
        }

        //Verificação do ano bissexto

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

        //Verificação fevereiro bissexto

        if (mes == 2 && testeBissexto == true && dia == 29){
            testeFevereiro = true;
        }else{
            testeFevereiro = false;
        }

        // Teste final

        if (verifDia == false || verifMes == false || (mes == 2 && testeFevereiro == false)){
            System.out.println("Data inválida.");
        }else{
            System.out.printf("Você inseriu a data válida %d/%d/%d", dia, mes, ano);
        }
    }  

}