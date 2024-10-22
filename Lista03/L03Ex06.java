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
        String nomeMulherAlta = " ";
        float alturaMulherAlta = 0;
        String nomeHomemVelho = " ";
        int idadeHomemVelho = 0;
        
        System.out.print("Digite o nome ou SAIR: ");
        nome = input.next();
        

        while (!"SAIR".equals(nome)){
            System.out.print("Digite a idade: ");
            idade = input.nextInt();
            System.out.print("Digite o sexo (F/M): ");
            sexo = input.next();
            while (!"M".equals(sexo) && !"F".equals(sexo)){
                System.out.print("ERRO! Escreva F ou M: ");
                sexo = input.next();
            }
            System.out.print("Digite a altura (m): ");
            altura = input.nextFloat();
            while (altura <=0){
                System.out.print("Erro! Altura deve ser maior que 0. Digite a altura: ");
                altura = input.nextFloat();
            }

            if (sexo.equals("F") && idade >= 30 && idade <= 45){
                sexoFeminino++;
                alturaMulherAlta = altura;
            }else{
                alturaFinal = alturaFinal + altura;
                sexoMasculino++;
                if (idade > idadeHomemVelho){
                    nomeHomemVelho = nome;
                }
            }

            if (altura > alturaMulherAlta){
                nomeMulherAlta = nome;
            }

            System.out.print("Digite o nome: ");
            nome = input.next();

        }

        mediaAltura = alturaFinal / sexoMasculino;

        if (sexoFeminino > 0){
        System.out.println("O total de pessoas do sexo feminino com idades entre 30 e 45 anos é: " + sexoFeminino);
        System.out.println("A mulher mais alta é: " + nomeMulherAlta);

        }
        
        if (sexoMasculino > 0){
        System.out.println("A média das alturas dos homens é: " + mediaAltura);
        System.out.println("O homem mais velho é: " + nomeHomemVelho);
        
        }
    }
}