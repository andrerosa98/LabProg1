import java.util.Scanner;

public class L02Ex02{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int numero;
        int numeroA;
        int numeroB;
        int soma;
        
        System.out.print("Digite um número inteiro de 4 algarismos: ");
        numero = input.nextInt();


        numeroA = numero / 100;
        numeroB = numero % 100;

        soma = numeroA + numeroB;

        if ((soma*soma) == numero){
            System.out.println("O número " + numero + " possui a mesma característica que o número 3025.");
        }else{
            System.out.println("O número " + numero + " não possui a mesma característica que o número 3025.");
        }
    }
}