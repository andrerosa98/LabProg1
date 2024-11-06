import java.util.*;

public class L03Ex51{
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        Long novoTotal = (long) 1;
        Long resultado = (long) 0; 
        Long peso;       

        for (int i = 2; i <= 62; i++){
            
            novoTotal = novoTotal * 2;
            resultado = (novoTotal + resultado);
        }

        System.out.println(resultado);

        peso = resultado * (long)0.01;

        System.out.println("O peso dos grãos, em toneladas é: " + peso);
    }
}