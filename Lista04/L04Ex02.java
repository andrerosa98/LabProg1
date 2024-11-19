import java.util.Scanner;

public class L04Ex02 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        float[] vetor = new float[20];
        float somaVetor = 0;
        float media;
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = input.nextFloat();
            somaVetor += vetor[i];
        }
        media = somaVetor / vetor.length;

        System.out.println("A média dos valores digitados é: " + media);
    }
}
