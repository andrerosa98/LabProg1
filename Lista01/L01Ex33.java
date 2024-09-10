import java.util.Scanner;

public class L01Ex33{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        int numero;
        int numeroAntecessor;
        int numeroSucessor;
        
        System.out.print("Digite um número inteiro: ");
        numero = input.nextInt();
        input.nextLine();

        numeroAntecessor = numero - 1;
        numeroSucessor = numero + 1;

        System.out.println("Você digitou " + numero + ". O seu antecessor é " + numeroAntecessor + " e o seu sucessor é " + numeroSucessor);
    }
}