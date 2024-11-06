public class L03Ex49{
    public static void main (String[] args){

        int qtdTabuada = 1;
        int qtdMultiplicador = 1;
        int qtdTotal;

        while(qtdTabuada <= 10){
            System.out.println("=== TABUADA DE " + qtdTabuada + " ===");
            while (qtdMultiplicador <= 10){
                qtdTotal = qtdTabuada * qtdMultiplicador;
                System.out.println(qtdTabuada + " X " + qtdMultiplicador + " = " + qtdTotal);
                qtdMultiplicador++;
            }
        System.out.println("=========================================");
        qtdTabuada++;
        qtdMultiplicador = 1;
        }

    }
}