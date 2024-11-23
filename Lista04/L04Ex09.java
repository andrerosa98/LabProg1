import java.util.Random;
import java.util.Scanner;

public class L04Ex09{
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        char[] gabarito = new char[10];
        int[] numAluno = new int[10000];
        char[] respostas = new char[(numAluno.length * gabarito.length)];

        for (int i = 0; i < gabarito.length; i++){
            System.out.print("Digite o gabarito da pergunta " + (i+1) + ": ");
            char aleatorio = (char) (random.nextInt(4) + 'A');
            gabarito[i] = aleatorio;
        }

        System.out.println("GABARITO");
        System.out.println("---------------------");
        System.out.printf ("|%c|%c|%c|%c|%c|%c|%c|%c|%c|%c| \n", gabarito[0],gabarito[1],gabarito[2],gabarito[3],gabarito[4],
                                                                 gabarito[5],gabarito[6],gabarito[7],gabarito[8],gabarito[9]);
        System.out.println("---------------------");

    }
}