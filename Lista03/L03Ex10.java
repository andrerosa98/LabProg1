import java.util.Scanner;

public class L03Ex10{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int qtdAlunos;
    int contAlunos = 0;
    String nome;
    final int QTDMATERIAS = 5;
    int qtdMaterias = 0;
    float nota = 0;
    int aprovadosTres = 0;
    float media;
    boolean aprovadoTotal = true;
    int aprovadoCincoMaterias = 0;
    int contUmeQuatro = 0;
    boolean testeAprovadoUmeQuatro = true;
    
    System.out.print("Digite a quantidade de alunos: ");
    qtdAlunos = input.nextInt();
    input.nextLine();

    String[] aprovadosTotal = new String[qtdAlunos];
    String[] aprovadosUmeQuatro = new String[qtdAlunos];

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

                if (qtdMaterias == 3 && nota > 5.0f){
                        aprovadosTres++;
                }
                
                if (nota < 5.0f){
                    aprovadoTotal = false;
                }
               
                if ((qtdMaterias == 1 && nota < 5) || (qtdMaterias == 4 && nota < 5.0f)){
                testeAprovadoUmeQuatro = false;
                }

            }
            
            if (testeAprovadoUmeQuatro == true){
                aprovadosUmeQuatro[contUmeQuatro] = nome;
                contUmeQuatro++;
            }


            if (aprovadoTotal == true){
                aprovadosTotal[aprovadoCincoMaterias] = nome;
                aprovadoCincoMaterias++;
            }
            aprovadoTotal = true;
            testeAprovadoUmeQuatro = true;
            qtdMaterias = 0;
        }
            media = ((float) aprovadosTres / qtdAlunos) * 100f;

            System.out.printf("%.0f%% de alunos foram aprovados na matéria 3. %n", media);
            
            for (int i = 0; i < aprovadoCincoMaterias; i++){
                System.out.println(aprovadosTotal[i] + " foi aprovado em todas as matérias!");
            }

            for (int i = 0; i < contUmeQuatro; i++){
                System.out.println(aprovadosUmeQuatro[i] + " foi aprovado nas matérias 1 e 4!");
            }
    }
}