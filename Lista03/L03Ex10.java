import java.util.Scanner;

public class L03Ex10{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int qtdAlunos;
    int contAlunos = 0;
    String nome;
    final int QTDMATERIAS = 5;
    int qtdMaterias = 0;
    float nota;
    int aprovadosTres = 0;
    float media;
    
    System.out.print("Digite a quantidade de alunos: ");
    qtdAlunos = input.nextInt();
    input.nextLine();

        while (contAlunos < qtdAlunos){
            contAlunos++;

            System.out.println("***ALUNO " + contAlunos + " ***");
            System.out.print("Digite o nome do aluno: ");
            nome = input.nextLine();
            while (qtdMaterias < QTDMATERIAS){
                qtdMaterias++;
                System.out.print("Digite a nota na matéria " + qtdMaterias + ": ");
                nota = input.nextFloat();
                input.nextLine();

                if (qtdMaterias == 1 && qtdMaterias == 4){
                    if (nota > 5.0){
                        System.out.println(nome + " foi aprovado nas matérias 1 e 4!");
                    }
                }

                if (qtdMaterias == 3){
                    if (nota > 5.0){
                        aprovadosTres++;
                    }
                }

                if (qtdMaterias == 1 && qtdMaterias == 2 && qtdMaterias == 3 && qtdMaterias == 4 && qtdMaterias == 5){
                    if (nota > 5.0){
                        System.out.println("O aluno " + nome + " foi aprovado em todas as matérias!");
                    }
                }

               
            }
            qtdMaterias = 0;
        }
            media = (aprovadosTres / qtdAlunos) * 100;
            System.out.printf("%.0f%% de alunos foram aprovados na matéria 3. %n", media);
    }
}