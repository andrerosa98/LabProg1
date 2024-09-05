import java.util.Scanner;

public class L01Ex01{

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int tempoHoras, pacotes;
        
        System.out.print("Digite o tempo em horas: ");
        tempoHoras = input.nextInt();
        
        pacotes = (tempoHoras * 3);

        
        System.out.println("Trafegaram pela rede " + pacotes + " pacotes.");


    }

}


