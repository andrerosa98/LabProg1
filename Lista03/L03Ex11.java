import java.util.Scanner;

public class L03Ex11 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        float rendaPessoal;
        String nome;
        float rendaFamiliar;
        float gastoAlimentacao;
        float gastoOutrasDespesas;
        int alunos200 = 0;
        int alunosRicos = 0;
        int qtdAlunos = 0;
        float pctAcima200;
        float pctRelacao;

        System.out.println("******** FACULDADE FACULDADE ********");
        System.out.print("Digite a renda pessoal: R$");
        rendaPessoal = input.nextFloat();
        input.nextLine();

        while (rendaPessoal > 0){
            System.out.print("Digite seu nome: ");
            nome = input.nextLine();
            System.out.print("Digite sua renda familiar: R$");
            rendaFamiliar = input.nextFloat();
            System.out.print("Digite quanto é gasto com alimentação: R$");
            gastoAlimentacao = input.nextFloat();
            System.out.print("Digite o total gasto com outras despesas: R$");
            gastoOutrasDespesas = input.nextFloat();

            if (gastoOutrasDespesas > 200){
                alunos200++;
            }

            if (rendaPessoal > rendaFamiliar){
                alunosRicos++;
            }
            qtdAlunos++;

            pctRelacao = (gastoAlimentacao + gastoOutrasDespesas) / rendaPessoal;

            System.out.printf("O aluno %s tem %.2f%% de gastos com alimentação e outras despesas em relação a sua renda pessoal. %n", nome, pctRelacao);

            System.out.println("******** FACULDADE FACULDADE ********");
            System.out.print("Digite a renda pessoal: R$");
            rendaPessoal = input.nextFloat();
            input.nextLine();
        }

        pctAcima200 = (alunos200 / qtdAlunos) * 100f;

        System.out.printf("A porcentagem de alunos que gasta acima de R$200,00 com outras despesas é %.0f%%%n", pctAcima200);
        System.out.println("O número de alunos com renda pessoal maior do que a renda familiar é " + alunosRicos);


    }
    
}
