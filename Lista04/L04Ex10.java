import java.util.Random;
import java.util.Scanner;

public class L04Ex10 {
    public static void main (String[] args){

        int tamM;
        int tamN;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Digite o tamanho do vetor M: ");
        tamM = input.nextInt();
        int[] vetorM = new int[tamM];
        System.out.print("Digite o tamanho do vetor N: ");
        tamN = input.nextInt();
        int[] vetorN = new int[tamN];
        int[] vetorC = new int [tamM];
        
        for(int i = 0; i < vetorM.length; i++){
            vetorM[i] = random.nextInt(tamM);
        }

        for(int i = 0; i < vetorN.length; i++){
            vetorN[i] = random.nextInt(tamN);
        }

        for (int i = 0; i < vetorN.length; i++){
            if (vetorM[i] == vetorN[i]){
                vetorC[i] = vetorM[i];
            }
        }    
        System.out.println("Vetor M: ");
        for (int i = 0; i < vetorM.length; i++){
            System.out.print(vetorM[i] + " ");
        }
        System.out.println("\nVetor N: ");
        for (int i = 0; i < vetorN.length; i++){
            System.out.print(vetorN[i] + " ");
        }
        System.out.println("\nVetor C: ");
        for (int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }


    }
}
