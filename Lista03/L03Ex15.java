import java.util.*;

public class L03Ex15 {

    public static void Opcao() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a opção desejada: ");
        System.out.println("1 - Crédito");
        System.out.println("2 - Débito");
        System.out.println("3 - Fim");
        int opcao = input.nextInt();

        
    }
    
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        
        long numConta;
        String nomeCliente;
        String nomeClienteMaiuscula;
        float saldoAnterior;
        int opcao;
        float saldoAdicionado;
        float saldoAtual;
        float saldoSubtraido;

        System.out.println("********************************************");
        System.out.println("*************   BANCO PUDIM   **************");
        System.out.println("********************************************");
        System.out.print("Digite o número da conta:");
        numConta = input.nextLong();

        while (numConta != 0){
            System.out.print("Digite o nome do cliente: ");
            input.nextLine();
            nomeCliente = input.nextLine();
            nomeClienteMaiuscula = nomeCliente.toUpperCase();
            System.out.print("Digite o saldo anterior do cliente: R$");
            saldoAnterior = input.nextFloat();
            System.out.println("****************************************");
            System.out.println("BEM VINDA(O), " + nomeClienteMaiuscula + ".");
           
                System.out.println("Digite a opção desejada: ");
                System.out.println("1 - Crédito");
                System.out.println("2 - Débito");
                System.out.println("3 - Fim");
                opcao = input.nextInt();

            while(opcao != 3){ 

                switch (opcao){

                    case 1:
                        System.out.print("Digite o valor a ser adicionado: R$");
                        saldoAdicionado = input.nextFloat();
                        saldoAtual = saldoAnterior + saldoAdicionado;
                        System.out.println("Saldo atual da conta: R$" + saldoAtual);
                        Opcao();
                    break;

                    case 2:
                        System.out.print("Digite o valor a ser subtraído: R$");
                        saldoSubtraido = input.nextFloat();
                        saldoAtual = saldoAnterior - saldoSubtraido;
                        System.out.println("Saldo atual da conta: R$" + saldoAtual);
                    break;

                    default:
                        System.out.println("Opção inválida. Tente novamente");
                        Opcao();
                }
            }

            switch (opcao){
                case 3:
                    System.out.println("OBRIGADO!");
                break;
            }


        }



        input.close();
    }
    
}
