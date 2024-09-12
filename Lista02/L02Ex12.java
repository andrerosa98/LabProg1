import java.util.Scanner;

public class L02Ex02{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int telefone;
        int telefoneOriginal;
        int verifTelefone;
        
        
        System.out.print("Digite o seu número de telefone (sem DDD e traços): ");
        telefone = input.nextInt();
        input.nextLine();
        telefoneOriginal = telefone;

        verifTelefone = telefone / 10000;

        if (verifTelefone == 3225){
            System.out.println("O prefixo " + verifTelefone + " corresponde ao bairro Oeste.");
        }else if (verifTelefone == 3224){
            System.out.println("O prefixo " + verifTelefone + " corresponde ao bairro Centro.");
        }else if (verifTelefone == 3223 || verifTelefone == 3212){
            System.out.println("O prefixo " + verifTelefone + " corresponde ao bairro Oeste ou ao bairro Centro.");
        }else if (verifTelefone == 3241 || verifTelefone == 3242 || verifTelefone == 3243 || verifTelefone == 3281){
            System.out.println("O prefixo " + verifTelefone + " corresponde ao bairro Sul.");
        }else if (verifTelefone == 3251 || verifTelefone == 3285){
            System.out.println("O prefixo " + verifTelefone + " corresponde ao bairro Bueno.");
        }else if(verifTelefone == 3233 || verifTelefone == 3291){
            System.out.println("O prefixo " + verifTelefone + " corresponde ao bairro Campinas.");
        }else{
            System.out.println("Não é um número com prefixo válido.");
        }
    }
}