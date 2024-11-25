import java.util.Random;
import java.util.Scanner;

public class L04Ex09{
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        char[] gabarito = new char[10];
        int[] numAluno = new int[10];
        char[] respostas = new char[(numAluno.length * gabarito.length)];
        int respostaCerta = 0;
        int respostaCertaTotal = 0;
        int respostaErrada = 0;
        int aprovado = 0;
        final float APROVACAO = 6.0f;
        float pctAprovacao;

        for (int i = 0; i < gabarito.length; i++){
            System.out.print("Digite o gabarito da pergunta " + (i+1) + ": ");
            char aleatorio = (char) (random.nextInt(4) + 'A');
            gabarito[i] = aleatorio;
        }

        for (int i = 0; i < numAluno.length; i++){
           numAluno[i] = random.nextInt(10); 
        }
        for (int i = 0; i < (numAluno.length * gabarito.length); i++){
            respostas[i] = (char) (random.nextInt(4) + 'A');
        }

        System.out.println("GABARITO");
        System.out.println("---------------------");
        System.out.printf ("|%c|%c|%c|%c|%c|%c|%c|%c|%c|%c| \n", gabarito[0],gabarito[1],gabarito[2],gabarito[3],gabarito[4],
                                                                 gabarito[5],gabarito[6],gabarito[7],gabarito[8],gabarito[9]);
        System.out.println("---------------------");

        for (int i = 0; i < numAluno.length; i++){
            for (int j = 0; j < respostas.length; j++){
                if (respostas[j] == gabarito[j]){
                    respostaCerta++;
                    respostaCertaTotal++;
                }else{
                    respostaErrada++;
                }
            }
            System.out.println("O aluno de número " + numAluno[i] + " obteve a nota " + respostaCerta++ + " de " + gabarito.length);

            if (respostaCerta > APROVACAO){
                    aprovado++;
            }
            respostaCerta = 0;
        }

        pctAprovacao = aprovado / numAluno.length;

        System.out.printf("A porcentagem de aprovação foi de %.2f%%\n", pctAprovacao);
    }
}