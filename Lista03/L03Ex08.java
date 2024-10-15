import java.util.Scanner;

public class L03Ex08{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        final float DIARIA  = 30.00f;
        final float MENOS10 = 10.00f;
        final float MAIS10  =  8.00f;
        String nome;
        float numConta;
        int dias;
        int qtdClientes = 0;
        float valorFixo;
        float valorVariavel;
        float valorConta;
        float valorTotal = 0;


        System.out.print("Digite o nome do cliente: ");
        nome = input.next();
        System.out.print("Digite o número da conta: ");
        numConta = input.nextFloat();
        input.nextLine();
        System.out.print("Digite a quantidade de dias da estadia: ");
        dias = input.nextInt();

        while (dias >= 0){
            qtdClientes++;
            System.out.println("*****POUSADA - CLIENTE " + qtdClientes + " *****");
            System.out.printf("Número da conta: %.0f\n", numConta);
            System.out.println("Nome do cliente: " + nome);
            System.out.println("Dias de estadia: " + dias);

            valorFixo = dias * DIARIA;

            if (dias >= 10){
                valorVariavel = dias * MENOS10;
            }else{
                valorVariavel = dias * MAIS10;
            }

            valorConta = valorFixo + valorVariavel;
            valorTotal = valorTotal + valorConta;

            System.out.printf("Valor da conta: R$%.2f\n", valorConta);

            System.out.print("Digite o nome do cliente: ");
            nome = input.next();
            System.out.print("Digite o número da conta: ");
            numConta = input.nextFloat();
            input.nextLine();
            System.out.print("Digite a quantidade de dias da estadia: ");
            dias = input.nextInt();

        }
        System.out.printf("Total ganho pela pousada: R$%.2f\n", valorTotal);
    }
}