import java.util.Scanner;

public class L02Ex09{
    public static void main (String[] args){
       Scanner input = new Scanner(System.in); 

        int diaDaSemana;
        int tipoDeJogo;
        double valor;
        double valorFinal;
        double valorJogo;
        double valorDesconto;

        System.out.printf("Qual é o dia da semana? %n 1 - Domingo %n 2 - Segunda-Feira %n 3 - Terça-Feira %n 4 - Quarta-Feira %n 5 - Quinta-Feira %n 6 - Sexta-Feira %n 7 - Sábado %n Digite aqui:");
        diaDaSemana = input.nextInt();
        input.nextLine();
        System.out.printf("Que tipo de jogo está alugando? %n 1 - Jogo Comum %n 2 - Lançamento %n Digite aqui: ");
        tipoDeJogo = input.nextInt();
        input.nextLine();
        System.out.print("Digite o valor do jogo: R$");
        valor = input.nextFloat();
        valorDesconto = 0;
        valorJogo = valor;

        //Cálculo do Desconto

        if (diaDaSemana == 2 || diaDaSemana == 3 || diaDaSemana == 5){
            valorDesconto = valor * 0.4;
        }

        //Cálculo do Tipo de Jogo

        if (tipoDeJogo == 2){
           valorJogo = valor * 0.15;
        }   
        valorFinal = valorJogo - valorDesconto;
        System.out.printf("Você deverá pagar R$%.2f %n", valorFinal);

    }
}