package LacosdeRepeticao;

import java.util.Scanner;

public class Exercicio2ForeWhile {
/*Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre 
 *na tela quantos números são pares e quantos número são ímpares. Veja o exemplo abaixo:
 * 
 */
	
	// Exercicio 2 usando For
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num,somaPar=0,somaImpar=0,x;
		int idade,genero,categoria,qtdBack=0,qtdMFront=0,qtdHMobile40=0,qtdMFullStack30=0;
		char op = 'S';
		for (x=1;x<=10;x++)
		{
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();
			if (num % 2 == 0)
			{
				somaPar++; // somaPar = somaPar + 1
			}
			else
			{
				{
					somaImpar++;
				}
			x++;	
			}
			System.out.printf("\nTemos: "+somaPar+" números pares...");
			System.out.printf ("\nTemos: "+somaImpar+" números ímpares...");
		}
		
		// Exercicio 4 usando while
			
		/*Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da área de Desenvolvimento e precisam de um sistema para analisar os dados. Escreva um algoritmo em Java, que leia via teclado as seguintes informações de cada colaborador:
		Idade (Número inteiro)
		Sexo (Número Inteiro): 
		1 – Masculino
		2 – Feminino
		3 – Outros
		Categoria (Número Inteiro):
		1 – Backend
		2 – Frontend
		3 – Mobile
		4 – FullStack
		Após digitar a categoria, o sistema deverá perguntar ao usuário se ele deseja continuar a leitura dos dados de um novo colaboradore ou não (S/N). Caso seja pressionada a tecla N, mostre na tela:
		
		O número de pessoas desenvolvedoras Backend
		O número de mulheres desenvolvedoras Frontend
		O número de homens desenvolvedores Mobile maiores de 40 anos
		O número de mulheres desenvolvedoras FullStack menores de 30 anos
		 */
		
		while(op == 'S');
		{
			System.out.println("\nEntre com a sua idade: ");
			idade=leia.nextInt();
			
					
		}
		
	}

}
