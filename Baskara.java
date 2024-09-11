import java.util.Scanner;

public class Baskara {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        float numeroA;
        float numeroB;
        float numeroC;
        float delta;
        double raizUm;
        double raizDois;
        
        System.out.print("Digite a variável A: ");
        numeroA = input.nextFloat();
        System.out.print("Digite a variável B: ");
        numeroB = input.nextFloat();
        System.out.print("Digite a variável C: ");
        numeroC = input.nextFloat();

        delta = (numeroB * numeroB) - (4*numeroA * numeroC);
        raizUm = (- numeroB + Math.sqrt(delta)) / (numeroA * 2f);
        raizDois = (- numeroB - Math.sqrt(delta)) / (numeroA * 2f);

        if (numeroA == 0){
            System.out.println("Não forma equação de 2º grau!");

        }else if (delta < 0){
            System.out.println("Não existe equação de 2º grau!");

        }else if (delta == 0){
            raizDois = raizUm;
            System.out.println("A primeira e a segunda raiz são iguais a " + raizDois);
        }else{
            System.out.printf("A primeira raiz é igual a %.5f e a segunda raiz é igual a %.5f", raizUm, raizDois);
        }

    }
}
