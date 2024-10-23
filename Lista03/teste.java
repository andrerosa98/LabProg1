import java.util.Scanner;

public class teste{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int x;
    int cont = 0;
    

    System.out.print("Digite a qtd:");
    x = input.nextInt();
        input.nextLine();
    String[] nome = new String[x];

    while (cont < x){
       
        System.out.print("Digite:");
        nome [cont] = input.nextLine();
        cont++;
    }

    cont = 0;

    for (int i = 0; i < x; i+=1){ // 1º declarar o contador; 2º regra de repetição; 3º variação

        System.out.println(nome[i]);

    }
 
    }

}