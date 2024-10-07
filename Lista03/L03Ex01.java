package Lista03;

import  java.util.Scanner;

public class L03Ex01{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int idade = 1;
        int cont = 0;
        int contIdade = 0; 
        int contMais50 = 0;
        String nome;
        float peso;
        float somaPeso = 0;
        float mediaIdade = 0;
        float somaIdade = 0;
        float mediaPeso = 0;


        while (idade >= 0){
            System.out.print("Digite seu nome: ");
            nome = input.nextLine();
            System.out.print("Digite sua idade: ");
            idade = input.nextInt();
            System.out.print("Digite seu peso em Kg: ");
            peso = input.nextFloat();

            cont = cont++;

            if (idade < 21){
                contIdade = contIdade++;
            }

            somaIdade = somaIdade + idade;

            mediaIdade = somaIdade / cont;

            if (idade > 50){
                contMais50 = contMais50++;
                
                somaPeso = somaPeso + peso;
                mediaPeso = somaPeso / contMais50;
                
            }
        }

        System.out.println("Total de pessoas com menos de 21 anos: " + contIdade);
        
        if (mediaIdade > 0){
            System.out.println("A média das idades é: " + mediaIdade);
        }   
        if (mediaPeso > 0){
            System.out.println("O peso médio das pessoas com mais de 50 anos é: " + mediaPeso);
        }
        
    }
}
