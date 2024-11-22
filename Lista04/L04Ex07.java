import java.util.Scanner;

public class L04Ex07{
    public static void main (String[] args){
        int[] aleatorio = {1,7,3,10,5,9,2,8,6,4};
        int numero;

        Scanner input = new Scanner (System.in);

        System.out.print("Digite um número inteiro positivo: ");
        numero = input.nextInt();

        for (int i = 0; i < aleatorio.length; i++){

            if (aleatorio[i] == numero){
                System.out.println("O número " + numero + " está localizado na posição " + i + " do vetor.");
            }else{
                System.out.println("O número " + numero + " não está localizado no vetor.");
            }
            break;   
        }
    }
}