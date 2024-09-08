import java.util.Scanner;

public class L01Ex24
{
	public static void main (String[] args){

	Scanner input = new Scanner(System.in);

		System.out.println("********* Vem que Tem **********");
		System.out.print("Qual o valor da compra? ");
			
			float valor, aVista, noCartao;
			float duasVezes, tresVezes, quatroVezes, cincoVezes;
			float duasVezesduas, tresVezestres, quatroVezesquatro, cincoVezescinco;
			
			valor    = input.nextFloat();
			aVista   = valor -(valor * 10/100);
			noCartao = valor -(valor * 5/100);
			duasVezes = (valor + (valor * 3/100)) / 2;
			tresVezes = (valor + (valor * 5/100)) / 3;
			quatroVezes = (valor + (valor * 7/100)) / 4;
			cincoVezes = (valor + (valor * 10/100)) / 5;
			duasVezesduas = duasVezes * 2;
			tresVezestres = tresVezes * 3;
			quatroVezesquatro = quatroVezes * 4; 
			cincoVezescinco =  cincoVezes * 5;
			
			System.out.println("Valor da compra: " + valor);
			System.out.println("À vista: " + aVista);
			System.out.println("Cartão: " + noCartao);
			System.out.println("2x " + duasVezes + " = " + duasVezesduas);
			System.out.println("3x " + tresVezes + " = " + tresVezestres);
			System.out.println("4x " + quatroVezes + " = " + quatroVezesquatro);
			System.out.println("5x " + cincoVezes + " = " + cincoVezescinco);
			System.out.println("********* Volte Sempre **********");
			

	}
	
	
}