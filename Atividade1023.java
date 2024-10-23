import java.util.Scanner;

public class Atividade1023{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;
        int qtd;
        int dado1 = 0;
        String dado2;
        float dado3 = 0;
        int dado4;
        float dado5 = 0;
        int dado1Total = 0;
        int verifDado1 = 0;
        String maior = " ";
        float media;

        System.out.println("******************* THE DB *******************");
        System.out.print("Quantos dados deseja incluir? (ou 0 para sair): ");
        opcao = input.nextInt();

        do{

            for (qtd = 1; qtd <= opcao; qtd++){

                System.out.println("*** DADO NÚMERO " + qtd + " ***");

                System.out.print("Digite o primeiro dado (tipo int): ");
                dado1 = input.nextInt();
                input.nextLine();
                System.out.print("Digite o segundo dado (tipo String): ");
                dado2 = input.nextLine();
                System.out.print("Digite o terceiro dado (tipo float): ");
                dado3 = input.nextFloat();
                System.out.print("Digite o quarto dado (tipo int): ");
                dado4 = input.nextInt();
                input.nextLine();
                System.out.print("Digite o quinto dado (tipo float): ");
                dado5 = input.nextFloat();

                if(dado1 > verifDado1){
                    maior = dado2;
                }

                dado1Total = dado1Total + dado1;
            }
            media = (dado3 + dado5) / opcao; 

            System.out.println("O somatório total dos dados 1 foi: " + dado1Total);
            System.out.println("O maior dado1 pertence a " + maior);
            System.out.printf("A média dos dados3 e dados5 é %.2f%n", media);
            
            System.out.println("******************* THE DB *******************");
            System.out.print("Quantos dados deseja incluir? (ou 0 para sair): ");
            opcao = input.nextInt();

        } while(opcao != 0);   
    }
}
