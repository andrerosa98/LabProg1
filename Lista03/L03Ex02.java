package Lista03;

import java.util.Scanner;
public class L03Ex02 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int numConta;
        String nome;
        float saldo;
        int contUsuario = 0;
        String nomeVip = "a";
        int contPercentual = 0;
        float percentUsuario;

        
        
        System.out.print("Digite o número da conta: ");
        numConta = input.nextInt();

        while (numConta >= 0){
            System.out.print("Digite o seu nome: ");
            nome = input.next();
            System.out.print("Digite o saldo: ");
            saldo = input.nextFloat();
            contUsuario++;

            if (saldo > 500f){ // Cliente VIP
                nomeVip = nome;
            }

            if (saldo >= 100 && saldo <= 200){ //soma do percentual
                contPercentual++;
            }

            System.out.print("Digite o número da conta: ");
            numConta = input.nextInt();
            input.nextLine();

        }

        percentUsuario = (float) contPercentual / contUsuario; //cálculo percentual

        if (contUsuario != 0){
            System.out.printf("O percentual de usuários com saldos entre R$100,00 e R$200,00 é: %.2f\n", percentUsuario);

        }
    
        if (nomeVip != "a"){
            System.out.print(nomeVip + "é um cliente VIP");
        }
    }
}
