import java.util.Scanner;

public class L02Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        double raizQuadrada;
        
        System.out.print("Digite um número que seja inteiro e positivo: ");
        numero = input.nextInt();
        input.nextLine();

        raizQuadrada = Math.sqrt(numero);
        raizQuadrada = raizQuadrada % 1;

        if (raizQuadrada == 0){
            System.out.println("Este número forma um quadrado perfeito!");
        }else{
            System.out.println("Este número NÃO forma um quadrado perfeito.");
        }
    }
}
