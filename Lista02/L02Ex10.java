import java.util.Scanner;

public class L02Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeDoPosto;
        double consumoAnual;
        double consumoMensal;
        double valorLitro;
        double valorNovo;
        valorLitro = 5.40;

        System.out.print("Digite o nome do posto: ");
        nomeDoPosto = input.nextLine();
        System.out.print("Digite o seu consumo anual em litros: ");
        consumoAnual = input.nextDouble();

        consumoMensal = (consumoAnual / 12.0);

        if (consumoMensal > 50000){
            valorNovo = valorLitro + (valorLitro * 0.12);
        }else{
            valorNovo = valorLitro + (valorLitro * 0.20);
        }

        System.out.printf("O novo valor do litro do combustível a ser cobrado no posto %s é de R$%.2f %n", nomeDoPosto, valorNovo);
    }
}
