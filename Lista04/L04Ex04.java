import java.util.Scanner;

public class L04Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char[] vetorFrase = new char[80];
        String frase;

            System.out.println("Digite uma frase de 80 caracteres: ");
            frase = input.nextLine();
            if (frase.length() != 80){
                System.out.println("Sua frase não tem 80 caracteres, tente novamente.");
                frase = input.nextLine();
            }else{
                vetorFrase = frase.toCharArray();
            }

        for (int i = 0; i <vetorFrase.length; i++){
            System.out.print(vetorFrase[i] + " ");
        }

    }
}
