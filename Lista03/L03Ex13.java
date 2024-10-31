import java.util.Scanner;

public class L03Ex13{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int numero;
        int contNumero = 0;
        int menorValor100 = 0;
        int numeroTotal = 0;
        int somaMaior50 = 0;
        float verifTres;
        int somaMultiplo3 = 0;
        float media;
        
        System.out.print("Digite um número inteiro: ");
        numero = input.nextInt();

        while (numero != -1){
            
            contNumero++; //Conta quantos números são colocados

            if (numero > 100 && numero < 1000){ // a) Menor valor dentre os maiores que 100 e menores que 1000 
                menorValor100 = numero;
            }

            numeroTotal = numeroTotal + numero; //Soma todos os números

            if (numero > 50 && numero < 100){ // Soma os números maiores que 50 e menores que 100
                somaMaior50 = somaMaior50 + numero;
            }

            verifTres = numero % 3;

            if (verifTres == 0){ // Verifica números múltiplos de três
                somaMultiplo3 = somaMultiplo3 + numero;
            }

            System.out.print("Digite um número inteiro ou -1 para sair:");
            numero = input.nextInt();

        }

        media = numeroTotal / contNumero;

        System.out.println("a) O menor valor dentre os maiores que 100 e menores que 1000 é: " + menorValor100);
        System.out.println("b) A média de todos os valores é: " + media);
        System.out.println("c) A soma dos valores maiores que 50 e menores que 100 é: " + somaMaior50);
        System.out.println("d) A soma de todos os múltiplos de 3 é: " + somaMultiplo3);

    }
}