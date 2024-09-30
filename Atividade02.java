import java.util.Scanner;

public class Atividade02{

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        int opcao;
        int ex01Numero1, ex01Numero2, ex01Numero3, ex01NumeroFinal;
        int ex02Numero, ex02numeroA, ex02numeroB, ex02Soma;
        float ex03TrianguloA, ex03TrianguloB, ex03TrianguloC, ex03SomaAB, ex03somaAC, ex03somaBC;

        
        
        System.out.println();
		System.out.println("\n\n><><>< I N S T I T U T O  Z E P P E L I N ><><><\n");
		System.out.println("< 1 > Imprimir maior número (L02Ex01)");
		System.out.println("< 2 > Característica 3025 (L02Ex02)");
		System.out.println("< 3 > Validar Triângulo (L02Ex03)");		
		System.out.println("< 0 > SAIR");
		System.out.print("Opção: ");
        opcao = input.nextInt();
        
        switch (opcao){

        case 1:
            //Exercício 01
        
            System.out.print("Digite o primeiro número: ");
                ex01Numero1 = input.nextInt();
            System.out.print("Digite o segundo número : ");
                ex01Numero2 = input.nextInt();
                if (ex01Numero2 > ex01Numero1){
                    ex01NumeroFinal = ex01Numero2;
                }else{
                    ex01NumeroFinal = ex01Numero1;
                }
            System.out.print("Digite o terceiro número: ");
                ex01Numero3 = input.nextInt();
                if (ex01Numero3 > ex01NumeroFinal){
                    ex01NumeroFinal = ex01Numero3;
                }
                System.out.println("O maior número digitado foi " + ex01NumeroFinal);
            break;


        case 2:
            //Exercício 02

            System.out.print("Digite um número inteiro de 4 algarismos: ");
                ex02Numero = input.nextInt();


            ex02numeroA = ex02Numero / 100;
            ex02numeroB = ex02Numero % 100;

            ex02Soma = ex02numeroA + ex02numeroB;

            if ((ex02Soma*ex02Soma) == ex02Numero){
                System.out.println("O número " + ex02Numero + " possui a mesma característica que o número 3025.");
            }else{
                System.out.println("O número " + ex02Numero + " não possui a mesma característica que o número 3025.");
            }
        break;

        case 3:
            //Exercício 03


            System.out.print("Digite o primeiro lado do triângulo: ");
            ex03TrianguloA = input.nextFloat();
            System.out.print("Digite o segundo lado do triângulo.: ");
            ex03TrianguloB = input.nextFloat();
            System.out.print("Digite o terceiro lado do triângulo: ");
            ex03TrianguloC = input.nextFloat();

            ex03SomaAB = ex03TrianguloA + ex03TrianguloB;
            ex03somaAC = ex03TrianguloA + ex03TrianguloC;
            ex03somaBC = ex03TrianguloB + ex03TrianguloC;

            if (ex03TrianguloA > ex03somaBC | ex03TrianguloB > ex03somaAC | ex03TrianguloC > ex03SomaAB){
                System.out.println("Não é um triângulo possível");
            }else if (ex03TrianguloA == ex03TrianguloB && ex03TrianguloA == ex03TrianguloC && ex03TrianguloB == ex03TrianguloC){
                System.out.println("É um triângulo equilátero.");
            }else if (ex03TrianguloA == ex03TrianguloB | ex03TrianguloA == ex03TrianguloC | ex03TrianguloB == ex03TrianguloC){
                System.out.println("É um triângulo isóceles");
            }else{
                System.out.println("É um triângulo escaleno.");
            }
        break;

        case 0:
            System.out.println("\nFIM");
				break;
        default:
            System.out.println("Opcao Inválida");

        }
    System.out.println("\n\n\nFim de Programa...");

    }
}
