import java.util.Scanner;

public class L02Ex13{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String nome;
        int minutos;
        int tempoInicial;
        double tempoMaior5;
        double tempoMenor5;
        double taxa;
        final double taxaFixa = 3;
        
        System.out.print("Digite o nome do usuário: ");
        nome = input.nextLine();
        System.out.print("Digite a quantidade de minutos utilizados: ");
        minutos = input.nextInt();
        input.nextLine();

        if (minutos >= 3.0){
            tempoInicial = (minutos - 3);
        }else{
            tempoInicial = minutos;
        }
        
        tempoMaior5 = tempoInicial / 5;
        tempoMenor5 = tempoInicial % 5;

        if (minutos < 3){
            taxa = taxaFixa - tempoInicial;
        }else{
            taxa = (tempoMaior5 * 2.15) + (tempoMenor5 * 0.85) + taxaFixa;
        }

        System.out.printf("O usuário %s utilizou %d minutos de telefonia, gerando uma fatura de R$%.2f", nome, minutos, taxa);

    }
}