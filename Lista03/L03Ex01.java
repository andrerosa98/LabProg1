/*
package Lista03;

import java.util.Scanner;

public class L03Ex01{
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int idade;
        int cont = 0;
        String nome;
        float peso;
        int contIdade = 0;
        int somaIdade = 0;
        float somaPeso = 0;
        int contMais = 0;
        float mediaPeso = 0;
        float mediaIdade = 0;

        System.out.print("Digite a sua idade: ");
        idade = input.nextInt();

        while (idade >= 0){
            cont++;
            
            System.out.print("Digite o seu nome: ");
            nome = input.next();
            System.out.print("Digite o seu peso (Kg): " );
            peso = input.nextFloat();

            if (idade < 21){
                contIdade++;
            }

            somaIdade = somaIdade + idade;

            if (idade > 50){
                somaPeso = somaPeso + peso;
                contMais++;
            }
            System.out.print("Digite a sua idade: ");
            idade = input.nextInt();
        }
    
        if (contMais > 0){
        mediaPeso = somaPeso / contMais;
        }
        if (cont > 0){
        mediaIdade = somaIdade / cont;
        }    
        System.out.println("O total de pessoas com menos de 21 anos é: " + contIdade);
        System.out.println("A média das idades é: " + mediaIdade);
        System.out.println("O peso médio das pessoas com mais de 50 anos é: " + mediaPeso);
    }

}*/
