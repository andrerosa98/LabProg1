import java.util.Scanner;

public class L04Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float [] vetorA = new float[100];
        float soma;
        float somaTotal = 0;
        int qtdInferior = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número:");
            vetorA[i] = input.nextFloat();
            if (vetorA[i] == 0){
                System.out.println("ERRO! Não existe divisão por zero. Tente novamente.");
                System.out.println("Digite o " + (i + 1) + "º número:");
                vetorA[i] = input.nextFloat();
            }
        }

        for (int i = 1; i <vetorA.length; i++){
            soma = i / vetorA[i];
            somaTotal += soma;

            if (i < vetorA[i]){
                qtdInferior++;
            }
        }

        System.out.println("A soma tem valor de: " + somaTotal);
        System.out.println(qtdInferior + " números são menores que seus respectivos denominadores.");

        input.close();
    }
}
