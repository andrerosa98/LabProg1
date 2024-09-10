import java.util.Scanner;

public class L02Ex01{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int numeroA;
        int numeroB;
        int numeroC;
        
        System.out.print("Digite o primeiro número inteiro: ");
        numeroA = input.nextInt();
        input.nextLine();
        System.out.print("Digite o segundo número inteiro: ");
        numeroB = input.nextInt();
        input.nextLine();
        System.out.print("Digite o terceiro número inteiro: ");
        numeroC = input.nextInt();
        input.nextLine();

        if (numeroA > numeroB & numeroA > numeroC){
            System.out.println("O maior número é o " + numeroA);
        }else if (numeroB > numeroA & numeroB > numeroC){
            System.out.println("O maior número é o " + numeroB);

        }else{
            System.out.println("O maior número é o " + numeroC);
        }
    }
}