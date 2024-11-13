public class EmSala04 {
 
    public static void main(String[] args) {
        
        int numeroReverso;
        int contPalindromo = 0;
        int numero = 10000;
        int numeroOriginal;
        int numeroCalc;
        
        System.out.println("TODOS OS NÚMEROS PALÍNDROMOS DE 5 ALGARISMOS: ");

        
        while(numero <= 99999){
            numeroOriginal = numero;
            numeroCalc = numero;

            numeroReverso = numeroCalc % 10;
            numeroReverso = numeroReverso * 10;
            
            for (int i = 1; i < 5; i++) {
                numeroCalc = numeroCalc / 10;
                numeroReverso = numeroReverso + (numeroCalc % 10);
                numeroReverso = numeroReverso * 10;
            }
            numeroCalc = numeroCalc / 10;
            numeroReverso = numeroReverso / 10;


            if (numeroReverso == numero){
                contPalindromo++;
                System.out.println(contPalindromo + "º número palíndromo: " + numero);
            }
        numero++;     
        }
            System.out.println("No total, existem " + contPalindromo + " números palíndromos de 5 algarismos.");

    }

}
