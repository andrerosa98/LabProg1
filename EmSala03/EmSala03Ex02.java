import java.util.Scanner;

public class EmSala03Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota;
        int total = 0;
        int numNotas = 0;
        int notasA = 0;
        int notasB = 0;
        int notasC = 0;
        int notasD = 0;
        int notasE = 0;
        float media;

        System.out.printf("%s%n%s%n %s%n %s%n", "Entre com as notas entre 0 e 10.", 
        "Digite o indicador de fim de arquivo para finalizar: ", 
        "UNIX/Linux/MacOS digite <Ctrl> <d> e depois <Enter>",
        "Windows digite <Ctrl> <z> e depois <Enter>");

        while(input.hasNext()){
            nota = input.nextInt();
            while(nota < 0 || nota > 10){
                System.out.println("Erro! Digite uma nota válida (inteiro entre 0 e 10): ");
                nota = input.nextInt();
            }
            total += nota;
            ++numNotas;

            switch(nota){
                case 9:
                case 10:
                    ++notasA;
                break;
                case 8:
                    ++notasB;
                break;
                case 7:
                    ++notasC;
                break;
                case 6:
                    ++notasD;
                break;
                default: 
                    ++notasE;
            }
        }

        System.out.printf("%n RELATÓRIO DE NOTAS: %n");
        if (numNotas != 0){
            media = (float) total / numNotas;
            System.out.printf("Total de %d notas inseridas %n", numNotas);
            System.out.printf("Média da classe: %.2f%n", media);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", 
            "Número de estudantes em cada nota: ",
            "A: ", notasA, "B: ", notasB, "C: ", notasC, "D: ", notasD, "E: ", notasE);
        }else{
            System.out.println("Nenhuma nota foi inserida: ");
        }
    }
}
