import java.util.Scanner;

public class EmSala03Ex03 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        double qtdCasa;
        double qtdFinal = 0;

        for (int i = 0; i < 64; i++){
            qtdCasa = Math.pow(2,i);
            System.out.printf("\nQuantidade na Casa %02d: %, 30.0f", i + 1, qtdCasa);
            qtdFinal = qtdFinal + qtdCasa;
        }
        System.out.printf("\n T O T A L:  %, 30.0f\n", qtdFinal);
        System.out.println("Pagamento do Monge: ");
        System.out.printf("%, 30.0f toneladas de grãos \n", qtdFinal/1000);

        System.out.println("Pagamento do Nerd: ");
        System.out.printf("%,30.0f bytes \n", qtdFinal / 8.0);
        System.out.printf("%,30.0f Kb\n",(qtdFinal / 8.0)/ 1024);
        System.out.printf("%,30.0f Mb\n",(((qtdFinal / 8.0)/ 1024)/ 1024));
        System.out.printf("%,30.0f Gb\n",((((qtdFinal / 8.0)/ 1024)/ 1024)/ 1024));
        System.out.printf("%,30.0f Terabytes\n",(((((qtdFinal / 8.0)/ 1024)/ 1024) / 1024)/ 1024));
        System.out.printf("%,30.0f Petabytes\n",((((((qtdFinal / 8.0)/ 1024)/ 1024) / 1024)/ 1024)/ 1024));
        System.out.printf("%,30.0f Exabytes\n",(((((((qtdFinal / 8.0)/ 1024)/ 1024) / 1024)/ 1024)/ 1024) / 1024));

        System.out.println("Pagamento do trabalhador: ");
        System.out.printf("%,30.0f Reais \n", qtdFinal / 100);
        System.out.printf("%,30.0f Mil Reais \n",(qtdFinal / 100) / 1000);
        System.out.printf("%,30.0f Milhões de Reais \n",((qtdFinal / 100)/ 1000) / 1000);
        System.out.printf("%,30.0f Bilhões de Reais \n",(((qtdFinal / 100)/ 1000) / 1000)/ 1000);
        System.out.printf("%,30.0f Trilhões de Reais \n",((((qtdFinal / 100)/ 1000) / 1000)/ 1000)/ 1000);
        System.out.printf("%,30.0f Quatrilhões de Reais \n",(((((qtdFinal / 100) / 1000)/ 1000)/ 1000)/ 1000)/ 1000);
        
    }
    
}
