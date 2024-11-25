import java.util.Scanner;

public class L04Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char[] vetorFrase = new char[80];
        String frase;
        int contBranco = 0;
        int contA = 0;
        int contDouble = 0;
        char[] vetorDouble = new char[80];

            System.out.println("Digite uma frase de 80 caracteres: ");
            frase = input.nextLine();
            if (frase.length() != 80){
                System.out.println("Sua frase não tem 80 caracteres, tente novamente.");
                frase = input.nextLine();
            }else{
                vetorFrase = frase.toCharArray();
            }

        for (int i = 0; i < vetorFrase.length; i++){
            if (vetorFrase[i] == ' '){
                contBranco++;
            }
            if (vetorFrase[i] == 'a' || vetorFrase[i] == 'A'){
                contA++;
            }
            if (i + 1 < vetorFrase.length && vetorFrase[i] == vetorFrase[i + 1]){
                contDouble++;
                vetorDouble[i] = vetorFrase[i];
            }
        }

        System.out.println("b) A quantidade de caracteres em branco é: " + contBranco);
        System.out.println("c) A quantidade de caracteres 'a' ou 'A' é: " + contA);
        System.out.println("d) A quantidade de caracteres que se repetem é: " + contDouble + " e os caracteres são: ");

        for (int i = 0; i < vetorDouble.length; i++){

        System.out.print(vetorDouble[i] + " ");

        }

    }
}
