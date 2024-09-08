import java.util.Scanner;

public class L01Ex20 
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        float tamanhoPista;
        float pesoAviao;
        int visibilidade;
        int intensidadeChuva = 0;
        int numeroPassageiros;
        boolean possuiSistemaDecolagem;
        boolean chuva;

        System.out.println("______________________________________________________________________");
        System.out.println("|               ***** VERIFICAÇÃO DE DECOLAGEM *****                 |");
        System.out.println("|Para definir as condições de decolagem, responda às peguntas abaixo |");
        System.out.print  ("|Qual o tamanho da pista?                                            |");
        tamanhoPista = input.nextFloat();
        System.out.print  ("|Qual o peso do avião?                                               |");
        pesoAviao = input.nextInt();
        input.nextLine();
        System.out.print  ("|Qual a visibilidade atual?                                          |");
        visibilidade = input.nextInt();
        input.nextLine();
        System.out.print  ("|Está chovendo? (true/false)                                         |");
        chuva = input.nextBoolean();
            if (chuva == true)
            {
                System.out.print("|Qual a intensidade da chuva?                                        |");
                intensidadeChuva = input.nextInt();
                input.nextLine();
            }else{

            }
        System.out.print  ("|Qual o número de passageiros?                                       |");
        numeroPassageiros = input.nextInt();
        input.nextLine();
        System.out.print  ("|O avião possui sistema de decolagem computadorizado? (true/false)   |");
        possuiSistemaDecolagem = input.nextBoolean();
        
        //para decolagem

        if (tamanhoPista > 2.0 && chuva == false && visibilidade > 20){
            System.out.println("Avião autorizado a decolar.");
        }else if (tamanhoPista < 1.5 && pesoAviao < 40){
            System.out.println("Avião autorizado a decolar.");
        }else if (tamanhoPista >= 1.5 && tamanhoPista <= 2.0 && pesoAviao < 60){
            System.out.println("Avião autorizado a decolar.");
        }else if (visibilidade < 20 && possuiSistemaDecolagem == true){
            System.out.println("Avião autorizado a decolar.");
        }else if (intensidadeChuva > 5){
            System.out.println("Avião não autorizado a decolar.");
        }else if (numeroPassageiros > 100 && chuva == true){
            System.out.println("Avião não autorizado a decolar.");
        }else{
            System.out.println("Avião não autorizado a decolar.");
        }
    }    
}
