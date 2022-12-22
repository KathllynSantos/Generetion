programa
{
	
	funcao inicio()
	{
		
		inteiro vetor[]={2, 5, 1, 3, 4, 9, 7 ,8, 10, 6},x

		para(inteiro a=0;a<10;a++)
		{
			escreva("\nDigite um número: ")
			leia(vetor[a])
		}
		para(inteiro a=0;a<10;a++)
		{
			para(inteiro b=0;b<10;b++)
			{
				se(vetor[a] > vetor[b])
				{
					inteiro temp = vetor[a]
					vetor[a] = vetor[b]
					vetor[b] = temp
				}
			}
		}
		para(inteiro y=0;y<10;y++)
		{
			escreva("\nVetor: ",vetor[y])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 51; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */