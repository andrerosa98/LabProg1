import java.util.Scanner;

public class L03Ex05{
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int codItem;
        int qtdItem;
        String nomeItem;
        float precoUnitario;
        int qtdTotal = 0;
        float valorTotal = 0;
        
        System.out.println("******* PEDIDO 1 *******");
        System.out.print("Digite o código do item: ");
        codItem = input.nextInt();
        input.nextLine();
        
        while (codItem >= 0){
            qtdTotal++;
            System.out.print("Digite o nome do item: ");
            nomeItem = input.next();
            System.out.print("Digite o preço unitário: R$");
            precoUnitario = input.nextFloat();
            System.out.print("Digite a quantidade: ");
            qtdItem = input.nextInt();  
            input.nextLine();

            valorTotal = valorTotal + precoUnitario;

            System.out.println("******* PEDIDO " + qtdItem + " *******");
            System.out.print("Digite o código do item: ");
            codItem = input.nextInt();
            input.nextLine();
        }

        System.out.println("Total de vendas: " + qtdTotal);
        System.out.printf("Valor total dos itens: R$%.2f", valorTotal);

    }
}