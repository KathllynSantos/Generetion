package LacosdeRepeticao;

import java.util.Scanner;

public class ExerciciosDoForDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num,somaPar=0,somaImpar=0,x;
				
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
					somaImpar++;
				}
		
			}
			System.out.printf("\nTemos: "+somaPar+" números pares...");
			System.out.printf ("\nTemos: "+somaImpar+" números ímpares...");	

	
	}
	{
			int idade,genero,categoria,qtdBack=0,qtdMFront=0,qtdHMobile40=0,qtdMFullStack30=0;
			String op = "S";
			
			Scanner leia = new Scanner(System.in);
			
			while(op.equals("S"))
						
			{
				
				System.out.println("\nEntre com a sua idade: ");
				idade=leia.nextInt();
				System.out.println("\nEntre com o seu genero: ");
				System.out.println("\n1- Masculino\t 2- Feminino\t 3-Outros");
				genero=leia.nextInt();	
				System.out.println("\nEntre com a sua categoria: ");
				System.out.println("\n1- Backend\t 2- Frontend\t 3- Mobile\t 4- FullStack");
				categoria=leia.nextInt();
				
			
				
				if(categoria == 1)
				{
					qtdBack++;
				}
				else if(genero == 2 && categoria == 2)
				{
					qtdMFront++;
				}
				else if(genero == 1 && categoria == 3 && idade>40)
				{
					qtdHMobile40++;
				}
				else if(genero == 2 && categoria == 4 && idade<30)
				{
					qtdMFullStack30++;
				}
				
				System.out.println("\nDeseja cadastrar um novo colaboradore: (S-Sim e N-Não)?");
				op=leia.nextLine();
			}
			
			System.out.printf("\nTemos: "+qtdBack+" pessoas desenvolvedoras Backend");
			System.out.printf("\nTemos: "+qtdMFront+" mulheres desenvolvedoras FrontEnd");
			System.out.printf("\nTemos: "+qtdHMobile40+" homens desenvolvedores Mobile maiores de 40 anos");
			System.out.printf("\nTemos: "+qtdMFullStack30+" mulheres desenvolvedoras FullStack menores de 30 anos");
			

		}
	{
	/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
	 * Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos. 
	 * Veja o exemplo abaixo: 
	 *                                 Exercicio 5
	 */ 
		
		Scanner leia = new Scanner (System.in);
		int numero , soma = 0;
	 
		System.out.println ("Digite um número: ");	 
	 
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

