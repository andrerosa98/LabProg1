import java.util.Scanner;

public class Imc {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        float imc;
        float peso;
        float altura;
        String status;
        
        System.out.print("Digite o seu peso em Kg: ");
        peso = input.nextFloat();
        System.out.print("Digite a sua altura em metros: ");
        altura = input.nextFloat();

        imc = peso / (altura * altura);

        if (imc > 30.0){
            status = "obeso";
        }else if (imc > 25.0){
                status = "acima do peso";
            }else if (imc > 18.5){
                status = "normal";
            }else{
                status = "abaixo do peso";
            }
        System.out.printf("O seu IMC é igual a %.2f. Significa que você está %s %n", imc,status);    
    }

}
