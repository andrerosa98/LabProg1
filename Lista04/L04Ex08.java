import java.util.Random;

public class L04Ex08 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numEmpregado = new int[300];
        int[] mesEmprego = new int[300];
        int[] menorMes = new int[3];
        int[] pos = new int[3];

        for (int i = 0; i < numEmpregado.length; i++) {
            numEmpregado[i] = random.nextInt(300);
            mesEmprego[i] = random.nextInt(300);

            for (int j = 0; j < menorMes.length; j++) {
                if (menorMes[j] == 0 || mesEmprego[i] < menorMes[j]) {
                    for (int k = pos.length - 1; k > j; k--) {
                        menorMes[k] = menorMes[k - 1];
                        pos[k] = pos[k - 1];
                    }
                    menorMes[j] = mesEmprego[i];
                    pos[j] = i;
                    break;
                }
            }
        }

        System.out.println("O empregado mais recente tem o número " + numEmpregado[pos[0]] + " e foi contratado no mês " + menorMes[0]);
        System.out.println("O segundo empregado mais recente tem o número " + numEmpregado[pos[1]] + " e foi contratado no mês " + menorMes[1]);
        System.out.println("O terceiro mais recente tem o número " + numEmpregado[pos[2]] + " e foi contratado no mês " + menorMes[2]);
    }
}