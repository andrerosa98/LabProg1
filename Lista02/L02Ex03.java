import java.util.Scanner;

public class L02Ex03{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        float trianguloA;
        float trianguloB;
        float trianguloC;
        float somaAB;
        float somaAC;
        float somaBC;

        System.out.print("Digite o primeiro lado do triângulo: ");
        trianguloA = input.nextFloat();
        System.out.print("Digite o segundo lado do triângulo.: ");
        trianguloB = input.nextFloat();
        System.out.print("Digite o terceiro lado do triângulo: ");
        trianguloC = input.nextFloat();

        somaAB = trianguloA + trianguloB;
        somaAC = trianguloA + trianguloC;
        somaBC = trianguloB + trianguloC;

        if (trianguloA > somaBC | trianguloB > somaAC | trianguloC > somaAB){
            System.out.println("Não é um triângulo possível");
        }else if (trianguloA == trianguloB && trianguloA == trianguloC && trianguloB == trianguloC){
            System.out.println("É um triângulo equilátero.");
        }else if (trianguloA == trianguloB | trianguloA == trianguloC | trianguloB == trianguloC){
            System.out.println("É um triângulo isóceles");
        }else{
            System.out.println("É um triângulo escaleno.");
        }
    }
}