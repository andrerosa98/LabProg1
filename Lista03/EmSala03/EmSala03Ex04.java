import java.util.Scanner;

public class EmSala03Ex04 {
    
    public static void Cabecalho(){
        System.out.println("+--------------------+");
        System.out.println("|  XXXX  XXX   XXXX  |");
        System.out.println("|  X  X  X  X  X     |");   
        System.out.println("|  XXXX  X  X  XXXX  |");
        System.out.println("|  X  X  X  X     X  |");
        System.out.println("|  X  X  XXX   XXXX  |");
        System.out.println("+--------------------+");
    }

    public static int SegundosDia(){
        int segundosDia;
        segundosDia = 24 * 60 * 60;
        return segundosDia;
    }

    public static void Rodape (String mensagem){
        System.out.println("\n\n********** " + mensagem + " **********");
    }

    public static int CalculaIdade (int ANOATUAL, int anoNasc){
        int idade;
        idade = ANOATUAL - anoNasc;
        return idade;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int ANOATUAL = 2024;
        String nome;
        String msg;
        int anoNasc;
        int idade;
        int segVividos;

        System.out.print("\n\nDigite seu nome: ");
        nome = input.nextLine();
        System.out.print("Digite o seu ano de nascimento: ");
        anoNasc = input.nextInt();
        input.nextLine();
        System.out.print("Mensagem motivacional: ");
        msg = input.nextLine();
        idade = CalculaIdade(ANOATUAL, anoNasc);
        segVividos = idade * 365 * SegundosDia();

        Cabecalho();
        System.out.printf("\n\n%s, \nVocê já viveu %,d segundos", nome, segVividos);
        Rodape(msg);
    }
}
