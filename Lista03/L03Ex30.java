import java.util.*;

public class L03Ex30{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String nome;
        char tamanho;
        char caracter;
        int tamFinal;
        int i;
        int cont = 0;
        
        System.out.println("===== FELIZ NATAL =====");
        System.out.println("Faça sua árvore");
        System.out.print("Digite seu nome: ");
        nome = input.nextLine();
        System.out.print("Digite o tamanho da árvore (P/M/G): ");
        tamanho = input.next(".").charAt(0);
        System.out.print("Escolha o modelo da árvore (qualquer caracter): ");
        caracter = input.next(".").charAt(0);

        if (tamanho == 'P'){
            tamFinal = 5;
            System.out.println("  *");
        }else if (tamanho == 'M'){
            tamFinal = 15;
            System.out.println("        *");
        }else{
            tamFinal = 31;
            System.out.println("                *");
        }

        for (i = 0; i < tamFinal; i++){
            while (cont < tamFinal){
                System.out.printf("%d", caracter);
                cont++;
            }
            
            cont = 0;
            
        }
        

        if (tamanho == 'P'){
            System.out.println("=====");
            System.out.println(nome);
        }else if (tamanho == 'M'){
            System.out.println("================");
            System.out.println(nome);
        }else{
            System.out.println("===============================");
            System.out.println(nome);
        }        

    }
}