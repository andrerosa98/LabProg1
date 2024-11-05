import java.util.Scanner;

public class L03Ex48 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numBloco = 1;
        int numAndar = 1;
        int numApto  = 1;

        while(numBloco <= 3){
            while(numAndar <= 9){
                while(numApto <= 4){
                    System.out.println("Cartão: " +numBloco+numAndar+numApto);
                    numApto++;
                }
                numApto = 1;
                numAndar++;
            }
            numAndar = 1;
            numBloco++;
        }
        
    }
    
}
