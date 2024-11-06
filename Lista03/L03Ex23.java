import java.util.Scanner;

public class L03Ex23{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        char estadoCivil;
        int idade;
        int pessoasCasadas = 0;
        int pessoasSolteiras = 0;
        int pessoasTotais = 0;
        int idadeViuvos = 0;
        int pessoasViuvas = 0;
        int pessoasDivorciadas = 0;
        float pctSolteiros;
        float mediaViuvos;
        float pctDivorciados;

        System.out.print("Digite sua idade: ");//Recebe a primeira idade, fora do laço
        idade = input.nextInt();

        while(idade >= 0){//Início do laço
            
            
            System.out.print("Digite o estado civil: (C, S, V ou D): ");//Recebe o estado civil, já dentro do laço
            estadoCivil = input.next().charAt(0);
            while(estadoCivil != 'C' && estadoCivil != 'S' && estadoCivil != 'V' && estadoCivil != 'D'){
                System.out.print("ERRO! Digite uma das opções: (C, S, V ou D): ");
                estadoCivil = input.next().charAt(0);
            }
            pessoasTotais++;//Conta quantos registros teremos

            if (estadoCivil == 'C'){//Calcula a quantidade de pessoas casadas
                pessoasCasadas++;
            }

            if (estadoCivil == 'S'){//Calcula a quantidade de pessoas solteiras
                pessoasSolteiras++;
            }

            if (estadoCivil == 'V'){//Soma as idades dos viúvos e calcula a quantidade de pessoas viúvas
                idadeViuvos = idadeViuvos + idade;
                pessoasViuvas++;
            }

            if (estadoCivil == 'D'){//Calcula a quantidade de pessoas divorciadas
                pessoasDivorciadas++;
            }

            System.out.print("Digite a idade do próximo participante (ou -1 para sair): ");//Recebe as próximas idades, dentro do laço
            idade = input.nextInt();
        }

        pctSolteiros = (pessoasSolteiras / pessoasTotais) * 100; //Calcula a porcentagem de pessoas solteiras, em relação ao total
        mediaViuvos  = idadeViuvos / pessoasViuvas; //Calcula a média de idade das pessoas viúvas
        pctDivorciados = (pessoasDivorciadas / pessoasTotais) * 100; //Calcula a porcentagem de pessoas divorciadas

        System.out.println("a) A quantidade de pessoas casadas é" + pessoasCasadas + "pessoa(s)");
        System.out.printf("b) A porcentagem de pessoas solteiras é %.2f%% %n", pctSolteiros);
        System.out.printf("c) A média das idades das pessoas viúvas é %.2f %n", mediaViuvos);
        System.out.printf("d) A porcentagem de pessoas divorciadas é %.2f%% %n", pctDivorciados);

    }
}