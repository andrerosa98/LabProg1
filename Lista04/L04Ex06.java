import java.util.Random;

public class L04Ex06{
    public static void main (String[] args){

        Random random = new Random();
        int[] absoluto = new int[11];
        int[] notas = new int[80];
        
        for(int i = 0; i < notas.length; i++){
            notas[i] = random.nextInt(11);

            switch (notas[i]){
                case 0:
                    absoluto[0] += 1;
                break;
                case 1:
                    absoluto[1] += 1;
                break;
                case 2:
                    absoluto[2] += 1;
                break;
                case 3:
                    absoluto[3] += 1;
                break;
                case 4:
                    absoluto[4] += 1;
                break;
                case 5:
                    absoluto[5] += 1;
                break;
                case 6:
                    absoluto[6] += 1;
                break;
                case 7:
                    absoluto[7] += 1;
                break;
                case 8:
                    absoluto[8] += 1;
                break;
                case 9:
                    absoluto[9] += 1;
                break;
                case 10:
                    absoluto[10] += 1;
                break;

            }
        }

        for (int i = 0; i <= 10; i++){
            System.out.println("O total de notas " + i + " foi: " + absoluto[i]);
        }


    }
}