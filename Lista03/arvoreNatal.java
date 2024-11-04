import java.util.Scanner;

public class arvoreNatal{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String caracter;
        int vezes;
        int cont = 0;
        int vezesCaracter = 0;
        int i;

        System.out.print("Escolha um caractere: ");
        caracter = input.next();
        System.out.print("Quantas vezes vai repetir? ");
        vezes = input.nextInt();


        if (vezes == 15){
            vezesCaracter = 4;
        }

        System.out.println("      *     ");  
        for (i = 0; i < vezes; i++){
            
            System.out.print("     ");
                for(cont = 0; cont <= vezesCaracter; cont+=2){
                    System.out.print(caracter);
                    
                }
            System.out.println("     ");
        }
        
      
    }
}