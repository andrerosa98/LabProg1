import java.util.Scanner;

public class L04Ex07{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        int[] aleatorio = {1,7,3,10,5,9,2,8,6,4};
        int numero;
        int i = 0;
        boolean check;

        System.out.print("Digite um número inteiro positivo: ");
        numero = input.nextInt();

        while (i < aleatorio.length){
            if (aleatorio[i] == numero){
                check = true;
            }else{
                i++;
                check = false;
            }
        }

       if (check = true){
            System.out.println("O número " + numero + " está localizado na posição " + i + " do vetor.");
        }else{
            System.out.println("O número " + numero + " não está localizado no vetor.");
        }
    }
}