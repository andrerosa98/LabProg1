package Lista03;
import java.util.Scanner;
public class L03Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;
        String cadastro;
        float valorConta;
        int qtdContribuintes = 0;
        float somaValores = 0;
        float compValor = 0;
        String cadMenor = " ";
        int menosQuinhentos = 0;
        float mediaValores;


        System.out.println("Digite uma opção: ");
        System.out.println("1 - Iniciar / Continuar");
        System.out.println("2 - Sair");
        opcao = input.nextInt();

        while (opcao == 1){
            System.out.print("Digite seu CPF (sem pontos/traços): ");
            cadastro = input.next();
            input.nextLine();
            System.out.print("Digite o valor da sua conta telefônica: R$");
            valorConta = input.nextFloat();

            qtdContribuintes++; // Conta a quantidade de contribuintes

            somaValores = somaValores + valorConta; // Soma o valor das contas telefônicas

            if (valorConta < compValor || compValor == 0){
                compValor = valorConta; // Acha a conta de menor valor
                cadMenor = cadastro;    // Armazena o CPF cuja conta é a menor 
            }

            if (valorConta < 500){
                menosQuinhentos++; // Conta a quantidade de clientes com contas menores que R$500,00
            }

            System.out.println("Digite uma opção: ");
            System.out.println("1 - Iniciar / Continuar");
            System.out.println("2 - Sair");
            opcao = input.nextInt();

        }

        mediaValores = somaValores / qtdContribuintes;

        System.out.println("Quantidade de contribuintes: " + qtdContribuintes);
        System.out.printf("Média dos valores pagos: R$%.2f\n", mediaValores);
        System.out.println("O CPF do cliente com a menor conta é " + cadMenor);
        System.out.println(menosQuinhentos + " clientes pagam menos de R$500,00");

        if (opcao == 2){

            System.out.println("Você saiu do programa.");

        }else{
            System.out.println("ERROR");
        }

    }
}
