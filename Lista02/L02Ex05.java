import java.util.Scanner;

public class L02Ex05{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int numero;
        int numeroOriginal;
        int numeroReverso;
        
        System.out.print("Digite um número de 5 dígitos: ");
        numero = input.nextInt();
        numeroOriginal = numero;

        numeroReverso = numero % 10;
        numeroReverso = numeroReverso * 10;
        numero = numero / 10;
        numeroReverso = numeroReverso + (numero % 10);
        numeroReverso = numeroReverso * 10;
        numero = numero / 10;
        numeroReverso = numeroReverso + (numero % 10);
        numeroReverso = numeroReverso * 10;
        numero = numero / 10;
        numeroReverso = numeroReverso + (numero % 10);
        numeroReverso = numeroReverso * 10;
        numero = numero / 10;
        numeroReverso = numeroReverso + (numero % 10);
        numeroReverso = numeroReverso * 10;
        numero = numero / 10;
        numeroReverso = numeroReverso / 10;

        if (numeroOriginal == numeroReverso){
            System.out.printf("%d É um número palíndromo.", numeroOriginal);
        }else{
            System.out.printf("%d Não é um número palíndromo.", numeroOriginal);
        }
    }
}