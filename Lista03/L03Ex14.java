import java.util.*;

public class L03Ex14 {
    public static void  main (String[] args){
        Scanner input = new Scanner(System.in);

        double carteira;
        String nome;
        int qtdMultas;
        int contMotorista = 1;
        int contMultas = 1;
        float valorMulta;
        float valorTotal = 0;
        float valorTotalDetran = 0;
        float maiorDivida = 0;
        String nomeDevedor = " ";
        
        
        System.out.println("* * * * DETRAN * * * * ");
        System.out.println("===== MOTORISTA 1 =====");
        System.out.print("Digite o número da carteira: ");//Recebe o número da carteira
        carteira = input.nextDouble();

        while (carteira > 0){
            System.out.print("Digite o nome do motorista: "); //Recebe o nome do motorista
            nome= input.next();
            System.out.print("Digite a quantidade de multas: "); //Recebe a qtd. de multas
            qtdMultas = input.nextInt();
            contMotorista++;
            
            valorTotal = 0;
            while (contMultas <= qtdMultas){ //Loop para receber o valor das multas
                System.out.print("Valor da multa " + contMultas + ": R$ ");
                valorMulta = input.nextFloat();
                contMultas++;

                valorTotal = valorTotal + valorMulta; //Somatório das multas do motorista escolhido

            }

            System.out.printf("Total da dívida: R$%.2f %n", valorTotal);
            contMultas = 1;
            valorTotalDetran = valorTotalDetran + valorTotal;

            if (maiorDivida < valorTotal){
                nomeDevedor = nome;
            }
            
            System.out.println("* * * * DETRAN * * * * ");
            System.out.println("===== MOTORISTA " + contMotorista + " =====");
            System.out.print("Digite o número da carteira: ");
            carteira = input.nextDouble();

        }

        System.out.println("O motorista com a maior dívida é: " + nomeDevedor);
        System.out.printf("O total arrecadado pelo DETRAN foi: R$%.2f %n", valorTotalDetran);
    }
}
