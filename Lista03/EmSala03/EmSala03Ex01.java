import java.util.Scanner;

public class EmSala03Ex01 {
    public static void main (String[] args){
      Scanner input = new Scanner(System.in);
        
        boolean primo;
        int numero;
        int d;
        char continua;

        do { 
            primo = true;
            System.out.print("Número: ");
            numero = input.nextInt();
            if (numero <= 1){
                primo = false;
            }else{
                for(d = 2; d * d <= numero; d++){
                    if (numero % d == 0){
                        primo = false;
                        break;
                    }
                }
            }
            if (primo){
                System.out.println("O número " + numero + " é primo");
            }else{
                System.out.println("O número " + numero + " não é primo");
            }

            System.out.println("Digite 'S' para executar novamente: ");
            continua = input.next().charAt(0);
        } while (continua == 'S');
        System.out.println("FIM DE PROGRAMA");

    }
}
