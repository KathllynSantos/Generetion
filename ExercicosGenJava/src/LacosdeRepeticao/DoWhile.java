package LacosdeRepeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
	/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
	 * Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos. 
	 * Veja o exemplo abaixo: 
	 *                                 Exercicio 5
	 */ 
		
		Scanner leia = new Scanner (System.in);
		int numero , soma = 0;
	 
		System.out.println("Digite um número: ");	 
	 
		 do 
         {
         numero = leia.nextInt();
             if (numero>0)
             {
                 soma = numero + soma;
             }
         }
		 while (numero!= 0);
		 System.out.println("\nA soma dos números digitados foi: "+soma);

 }

}
