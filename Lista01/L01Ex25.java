import java.util.Scanner;

public class L01Ex25 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        float salario;
        float horaAula;
        float horasTrab;
        int qtdFilhos;
        int descontoFilho;
        float descontoINSS;

        
        System.out.print("Digite o valor da hora aula: R$ ");
        horaAula = input.nextFloat();
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        horasTrab = input.nextInt();
        input.nextLine();
        System.out.print("Quantos filhos você tem? ");
        qtdFilhos = input.nextInt();
        input.nextLine();

        salario = (horaAula * horasTrab);
        descontoFilho = (qtdFilhos * 5);
        descontoINSS = (salario * 0.12f);
        salario = salario - (descontoINSS + descontoFilho);

        System.out.printf("Seu salário é de R$ %.2f %n", salario);

    }    
}
