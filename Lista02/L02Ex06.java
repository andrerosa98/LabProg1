import java.util.Scanner;

public class L02Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        float raizQuadrada;
        
        System.out.print("Digite um número que seja inteiro e positivo: ");
        numero = input.nextInt();
        input.nextLine();

        raizQuadrada = (float)Math.sqrt(numero);

        
    }
}
