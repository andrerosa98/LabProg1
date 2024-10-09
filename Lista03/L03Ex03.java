package Lista03;
import java.util.Scanner;
public class L03Ex03 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

       int idade;
       String nome;
       float peso;
       int contDezoito = 0;
       
        System.out.print("Digite sua idade: ");
        idade = input.nextInt();
        input.nextLine();
        
        while (idade >= 0){ //Flag é na idade
            System.out.print("Digite seu nome: ");
            nome = input.nextLine();
            System.out.print("Digite seu peso (Kg): ");
            peso = input.nextFloat();

            if (peso > 80){ //Imprime todos os nomes maiores de 80Kg
                System.out.println(nome + ": obeso");
            }

            if (idade < 18){ //Conta todos menores de 18 anos
                contDezoito++;
            }

            System.out.print("Digite sua idade: ");
            idade = input.nextInt();
            input.nextLine();
        }

        System.out.println("Pessoas menores de 18 anos: " + contDezoito);


    }

}
