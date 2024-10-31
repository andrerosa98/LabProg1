import java.util.*;

public class L03Ex12{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        int qtdTuristas;
        String nomePraia;
        float distancia;
        int contTuristas = 0;
        int turistasMenos10 = 0;
        String praiaMaisDistante;
        float maiorKmPraia;
        int turistasMais20 = 0;
        float mediaTuristas = 0;
        float pctTuristas = 0;
        int qtdPraias20 = 0;
        
        System.out.print("Digite a quantidade de turistas: ");//Recebe a quantidade de turistas
        qtdTuristas = input.nextInt();

        while (qtdTuristas >= 0){
            System.out.print("Digite o nome da praia: "); //Recebe nome da praia
            nomePraia = input.next();
            System.out.print("Digite a distância entre a praia e o hotel: "); // Recebe distância entre praia e hotel
            distancia = input.nextFloat();
            
            contTuristas = contTuristas + qtdTuristas;

            if(distancia < 10){ //Calcula os turistas que estão a menos de 10Km do hotel
                turistasMenos10 = turistasMenos10 + qtdTuristas;
            }

            praiaMaisDistante = nomePraia; //Atribui o nome da praia mais distante
            maiorKmPraia = distancia; //Atribui a distância da praia mais distante

            if(distancia > maiorKmPraia){ //Compara a distância e inclui o nome da praia mais distante na variável
                praiaMaisDistante = nomePraia;
            }

            if (distancia >= 20){ //Calcula os turistas que estão a mais de 10km do hotel
                turistasMais20 = turistasMais20 + qtdTuristas;
                qtdPraias20++; //Conta quantas praias a mais de 20Km do hotel existem
            }

            System.out.print("Digite a quantidade de turistas (ou -1 para sair): ");
            qtdTuristas = input.nextInt();
        }

        if (qtdPraias20 > 0){ // Impede divisão por 0
        mediaTuristas = (turistasMais20 / qtdPraias20); // Calcula a média de turistas nas praias a mais de 20Km do hotel
        }
        if (contTuristas > 0){ // Impede divisão por 0
        pctTuristas   = (turistasMenos10 / contTuristas) * 100; //Calcula a porcentagem de turistas nas praias com menos de 10Km do hotel
        }

        System.out.printf("A porcentagem de turistas nas praias com menos de 10Km do hotel é %.2f%%\n", pctTuristas);
        System.out.printf("A média dos turistas em praias com mais de 20Km é %.0f\n", mediaTuristas);
    }
}