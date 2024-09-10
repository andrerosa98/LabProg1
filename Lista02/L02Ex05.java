import java.util.Scanner;

public class L02Ex05{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int numero;
        int numeroOriginal;
        int numeroReverso;
        
        System.out.print("Digite um número de 5 dígitos");
        numero = input.nextInt();

        numeroReverso = numero % 10;
        numeroReverso * 10 = numeroReverso;
        

        if (numero == numeroReverso){
            System.out.println("É um número palíndromo.");
        }else{
            System.out.println("Não é um número palíndromo.");
        }
    }
}