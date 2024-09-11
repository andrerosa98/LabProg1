import java.util.Scanner;

public class L02Ex07 {
    public static void main (String[] args){

        int tipo;
        float consumo;
        double taxa;
        double resto;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o seu tipo de consumidor? (1 - Residencial, 2 - Comercial ou 3 - Industrial): ");
        tipo = input.nextInt();
        input.nextLine();
        System.out.print("Qual foi o consumo em metros cúbicos?: ");
        consumo = input.nextFloat();

        if (tipo == 1){ //Residencial
            taxa = 5.0 + (consumo * 0.05);
            System.out.printf("Sua fatura será no valor de R$%.2f", taxa);
        }else if (tipo == 2 && consumo <= 80){ //Comercial menor que 80
           taxa = 500.0;
           System.out.printf("Sua fatura será no valor de R$%.2f", taxa);
        }else if (tipo == 2 && consumo > 80){ //Comercial maior que 80
            resto = consumo - 80.0;
            resto = resto * 0.25;
            taxa = (resto + 500.0);
            System.out.printf("Sua fatura será no valor de R$%.2f", taxa);
        }else if (tipo == 3 && consumo <= 100){
            taxa = 800.0;
            System.out.printf("Sua fatura será no valor de R$%.2f", taxa);
        }else if (tipo == 3 && consumo > 100){
            resto = consumo - 100;
            resto = resto * 0.04;
            taxa = resto + 800.0;
            System.out.printf("Sua fatura será no valor de R$%.2f", taxa);
        }
    }
}
