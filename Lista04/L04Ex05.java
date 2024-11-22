import java.util.Random;

public class L04Ex05{
    public static void main (String[] args){
        Random random = new Random();

        int[] varB = new int[100];
        int soma;
        int somaTotal = 0;

        for (int i = 0; i < varB.length; i++){
            varB[i] = random.nextInt(1000);
        }

        for (int i = 0; i < varB.length; i++){
            soma = ((varB[0 + i]) - (varB.length - i)) * 3;
            somaTotal += soma;
        }

        System.out.print("A soma total é: " + somaTotal);

    }
}