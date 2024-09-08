import java.util.Scanner;

public class L01Ex26 
{
    public static void main (String[] args)
    {

        Scanner input = new Scanner(System.in);

        int votosA;
        int votosB;
        int votosC;
        int brancos;
        int nulos;
        int total;
        float votosValidosA;
        float votosValidosB;
        float votosValidosC;
        float votosNulos;
        float votosBrancos;
        

        System.out.print("Digite a quantidade de votos válidos da candidata A: ");
        votosA = input.nextInt();
        System.out.print("Digite a quantidade de votos válidos da candidata B: ");
        votosB = input.nextInt();
        System.out.print("Digite a quantidade de votos válidos da candidata C: ");
        votosC = input.nextInt();
        System.out.print("Digite a quantidade de votos em branco: ");
        brancos = input.nextInt();
        System.out.print("Digite a quantidade de votos nulos: ");
        nulos = input.nextInt();

        total = votosA + votosB + votosC + brancos + nulos;
        votosValidosA = (float)(votosA * 100) / total;
        votosValidosB = (float)(votosB * 100) / total;
        votosValidosC = (float)(votosC * 100) / total;
        votosNulos = (float)(nulos * 100) / total;
        votosBrancos = (float)(brancos * 100) / total;

        System.out.println("***** RESULTADO DAS ELEIÇÕES *****");
        System.out.printf("Total de eleitores: %d %n", total);
        System.out.printf("Percentual de votos válidos da candidata A: %.2f%% %n ", votosValidosA);
        System.out.printf("Percentual de votos válidos da candidata B: %.2f%% %n ", votosValidosB);
        System.out.printf("Percentual de votos válidos da candidata C: %.2f%% %n ", votosValidosC);
        System.out.printf("Percentual de votos brancos: %.2f%% %n", votosBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%% %n", votosNulos);


        

    }    
}
