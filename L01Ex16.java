import java.util.Scanner;

public class L01Ex16 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

       String nomeA;
       String nomeB;
       String nomeC;
       float pesoA;
       float pesoB;
       float pesoC;
       int idadeA;
       int idadeB;
       int idadeC;
       float mediaPeso;
       float mediaIdade;

       System.out.print("Digite o nome do primeiro paciente: ");
       nomeA = input.nextLine();
       System.out.print("Digite o peso do primeiro paciente: ");
       pesoA = input.nextFloat();
       System.out.print("Digite a idade do primeiro paciente: ");
       idadeA = input.nextInt();
       input.nextLine();
       System.out.print("Digite o nome do segundo paciente: ");
       nomeB = input.nextLine();
       System.out.print("Digite o peso do segundo paciente: ");
       pesoB = input.nextFloat();
       System.out.print("Digite a idade do segundo paciente: ");
       idadeB = input.nextInt();
       input.nextLine();
       System.out.print("Digite o nome do terceiro paciente: ");
       nomeC = input.nextLine();
       System.out.print("Digite o peso do terceiro paciente: ");
       pesoC = input.nextFloat();
       System.out.print("Digite a idade do terceiro paciente: ");
       idadeC = input.nextInt(); 
       input.nextLine();

       mediaPeso = (pesoA + pesoB + pesoC) / 3;
       mediaIdade = (float)(idadeA + idadeB + idadeC) / 3;

       System.out.printf("A média de peso entre os três pacientes é de %.2f %n", mediaPeso);
       System.out.printf("A média de idade entre os três pacientes é de %.2f %n", mediaIdade);
       

    }    
}
