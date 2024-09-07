import java.util.Scanner;

public class L01Ex08 
{
 public static void main (String[] args)
 {
    Scanner input = new Scanner(System.in);

    int numConta;
    int contRev;
    int mod;
    int numContaOr;
    int somaNum;
    int somaNum1;
    int somaNum2;
    int somaNum3;
    int somaFinal;

    System.out.print("Digite o número da conta corrente (3 dígitos): ");
    numConta = input.nextInt();
    numContaOr = numConta;
    
    contRev = 0;
    while (numConta != 0)
    {
        mod = numConta % 10;
        contRev = contRev * 10 + mod;
        numConta /= 10;
    }
    somaNum = numContaOr + contRev;
    somaNum3 = somaNum % 10;
    somaNum = somaNum / 10;
    somaNum2 = somaNum % 10;
    somaNum = somaNum / 10;
    somaNum1 = somaNum % 10;
    somaNum2 = somaNum2 * 2;
    somaNum3 = somaNum3 * 3;
    somaFinal =somaNum1 + somaNum2 + somaNum3;
    somaFinal = somaFinal % 10;

    System.out.println("O dígito verificador da conta é " + somaFinal);
 }   
}
