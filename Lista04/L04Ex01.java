import java.util.*;

public class L04Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdArray;

        System.out.print("Digite a quantidade de números reais: ");
        qtdArray = input.nextInt();
        float[] sequencia = new float [qtdArray];
        
        for (int i = 0; i < qtdArray; i++){
            System.out.print("Digite o " + (i + 1) + " número real: ");
            sequencia[i] = input.nextFloat();
        }
        
        System.out.print("Os números reais, em ordem inversa, são: ");
        for (int i = qtdArray - 1; i >= 0; i--){
            System.out.print(sequencia[i] + " ");
        }
    }
}