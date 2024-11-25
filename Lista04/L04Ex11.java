import java.util.Scanner;
import java.util.Random;

public class L04Ex11{
    public static void main (String[] args){
        int[] vetorA = new int[8];
        int numero;
        int qtd = 0;

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Digite um número de 0 a 10: ");
        numero = input.nextInt();

        System.out.println("Vetor A: ");
        
        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = random.nextInt(vetorA.length);

            System.out.print(vetorA[i] + " ");
            
            if (vetorA[i] == numero){
                qtd++;
            }
        }
        System.out.print("\n");
        System.out.println("O número " + numero + " aparece " + qtd + " vez(es) no vetor A.");
    }
}