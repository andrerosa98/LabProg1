import java.util.Scanner;

public class L03Ex06{
    public static void main (String[] args){

        Scanner input = new Scanner (System.in);

        
        String nome;
        int idade;
        String sexo;
        float altura;
        int sexoFeminino = 0;
        float alturaFinal = 0;
        int sexoMasculino = 0;
        float mediaAltura;
        
        System.out.print("Digite o nome: ");
        nome = input.next();
        System.out.print("Digite a idade: ");
        idade = input.nextInt();

        while (idade >=0){

            System.out.print("Digite o sexo (F/M): ");
            sexo = input.next();
            System.out.print("Digite a altura (m): ");
            altura = input.nextFloat();

            if (sexo.equals("F") && idade >= 30 && idade <= 45){
                sexoFeminino++;
            }

            if (sexo.equals("M")){
                alturaFinal = alturaFinal + altura;
                sexoMasculino++;
            }

            System.out.print("Digite o nome: ");
            nome = input.next();
            System.out.print("Digite a idade: ");
            idade = input.nextInt();

        }

        mediaAltura = alturaFinal / sexoMasculino;

        System.out.println("O total de pessoas do sexo feminino com idades entre 30 e 45 anos é: " + sexoFeminino);
        
        if (sexoMasculino > 0){
        System.out.println("A média das alturas dos homens é: " + mediaAltura);
        }
    }
}