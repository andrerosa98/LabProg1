import java.util.Scanner;

public class L03Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdTurmas;
        int qtdAlunos;
        int cout = 0;
        int totalAlunos = 0;
        float nota;
        int aprovado = 0;
        float media= 0;
        float somaNotas = 0;
        float somaNotasGeral = 0;
        int qtdAlunosGeral = 0;
        float mediaGeral = 0;
        int aprovadoGeral = 0;
        
        System.out.print("Digite a quantidade de turmas: "); //Inicializa a quantidade de turmas
        qtdTurmas = input.nextInt();
        input.nextLine();

        while (cout < qtdTurmas){

            cout++;

            System.out.println("*****TURMA " + cout + " *****");

            System.out.print("Digite a quantidade de alunos: "); //Inicializa a quantidade de alunos por turma
            qtdAlunos = input.nextInt();
            input.nextLine();

            while(totalAlunos < qtdAlunos){ // Recebe a nota de cada aluno
                totalAlunos++;
                
                System.out.print("Digite a nota do aluno " + totalAlunos + ": ");
                nota = input.nextFloat();

                somaNotas = somaNotas + nota;

                media = somaNotas / qtdAlunos;
                
                if (nota >= 6.0){
                    aprovado++;
                }
            }

            System.out.println(">>> O total de alunos aprovados na turma " + cout + " é: " + aprovado);
            System.out.println(">>> A média das notas da turma " + cout + " é: " + media);

            somaNotasGeral = somaNotasGeral + somaNotas;
            qtdAlunosGeral = qtdAlunosGeral + qtdAlunos;
            aprovadoGeral = aprovadoGeral + aprovado;
            somaNotas = 0;
            aprovado = 0;
            totalAlunos = 0;

            mediaGeral = somaNotasGeral / qtdAlunosGeral;
        }
        System.out.printf("A média geral das turmas foi de: %.2f%n", mediaGeral);
    }
}
