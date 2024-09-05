import java.util.Scanner;

public class L01Ex02{

    public static void main (String[] args){

        Scanner input = new Scanner(System.in); //declara input como a entrada de dados

        float entradaByte, entradaBits;
        
        System.out.print("Digite um valor em bytes: ");
        entradaByte = input.nextFloat();

        entradaBits = (entradaByte / 8);

        System.out.println(entradaByte + " bytes correspondem a " + entradaBits + " bits");

    }

}